package br.com.renbstux.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import br.com.renbstux.helper.Utils;
import br.com.renbstux.model.Produto;

public class Mercado {

	private static Scanner teclado = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;

	public static void main(String[] args) {
		produtos = new ArrayList<Produto>();
		carrinho = new HashMap<Produto, Integer>();
		Mercado.menu();

	}

	private static void menu() {
		System.out.println("===================================================================");
		System.out.println("===================B e m  -  V i n d o ( a )=======================");
		System.out.println("===================   G e e k  S h o p      =======================");
		System.out.println("===================================================================");
		System.out.println("");
		System.out.println("Selecione uma op��o abaixo: ");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Comprar produto");
		System.out.println("4 - Visualizar carrinho");
		System.out.println("5 - Sair do sistema");

		int opcao = 0;

		try {
			opcao = Integer.parseInt(Mercado.teclado.nextLine());
		} catch (InputMismatchException e) {
			Mercado.menu();
		} catch (NumberFormatException f) {
			Mercado.menu();
		}

		switch (opcao) {
		case 1:
			Mercado.cadastrarProduto();
			break;
		case 2:
			Mercado.listarProdutos();
			break;
		case 3:
			Mercado.comprarProduto();
			break;
		case 4:
			Mercado.visualizarCarrinho();
			break;
		case 5:
			System.out.println("Volte Sempre!");
			Utils.pausar(2);
			System.exit(0);
		default:
			System.out.println("Op��o inv�lida.");
			Utils.pausar(2);
			Mercado.menu();
			break;
		}
	}

	private static void cadastrarProduto() {
		System.out.println("Cadastro de Produto");
		System.out.println("===================");

		System.out.println("Informe o nome do produto: ");
		String nome = Mercado.teclado.nextLine();

		System.out.println("Informe o pre�o do produto: ");
		Double preco = Mercado.teclado.nextDouble();

		Produto produto = new Produto(nome, preco);

		Mercado.produtos.add(produto);

		System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso.");
		Utils.pausar(2);
		Mercado.menu();

	}

	private static void listarProdutos() {
		if (Mercado.produtos.size() > 0) {
			System.out.println("Listagem de Produtos");
			System.out.println();

			for (Produto p : Mercado.produtos) {
				System.out.println(p);
				System.out.println();
			}
		} else {
			System.out.println("Ainda n�o existem produtos cadastrados!");
		}
		Utils.pausar(2);
		Mercado.menu();
	}

	private static void comprarProduto() {
		if (Mercado.produtos.size() > 0) {
			System.out.println("informe o codigo do produto que deseja comprar: ");
			System.out.println();

			System.out.println("================= Produtos Dispon�veis =================");
			for (Produto p : Mercado.produtos) {
				System.out.println(p);
				System.out.println("=======================================================");
			}
			int codigo = Integer.parseInt(Mercado.teclado.nextLine());
			boolean tem = false;

			for (Produto p : Mercado.produtos) {
				if (p.getCodigo() == codigo) {
					int quant = 0;
					try {
						quant = Mercado.carrinho.get(p);
						// J� tem este produto no carrinho, atualiza quantidade
						Mercado.carrinho.put(p, quant + 1);
					} catch (NullPointerException e) {
						// Primeiro produto no carrinho
						Mercado.carrinho.put(p, 1);
					}
					System.out.println("O produto " + p.getNome() + " foi adicionado ao carrinho.");
					tem = true;
				}
				if (tem) {
					System.out.println("Deseja adicinar outraos produtos? ");
					System.out.println("Informe 1 para sim ou 0 para n�o: ");
					int op = Integer.parseInt(Mercado.teclado.nextLine());

					if (op == 1) {
						Mercado.comprarProduto();
					} else {
						System.out.println("Por Favor, aguarde enquanto fechamos seu pedido...");
						Utils.pausar(2);
						Mercado.fecharPedido();
					}

				} else {
					System.out.println("N�o foi encontado o produto com o c�digo " + codigo);
					Utils.pausar(2);
					Mercado.menu();
				}
			}

		} else {
			System.out.println("Ainda n�o existe produto cadastrado no mercado.");
			Utils.pausar(2);
			Mercado.menu();
		}
	}

	private static void visualizarCarrinho() {
		if (Mercado.carrinho.size() > 0) {
			System.out.println("Produtos no carrinho: ");

			for (Produto p : Mercado.carrinho.keySet()) {
				System.out.println("Produto: " + p + "\nQuantidade: " + Mercado.carrinho.get(p));
			}
		} else {
			System.out.println("Ainda n�o existem produtos no carrinho.");
		}
		Utils.pausar(2);
		Mercado.menu();
	}

	private static void fecharPedido() {
		Double valorTotal = 0.0;
		System.out.println("  P r o d u t o s  d o  C a r r i n h o ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		for(Produto p : Mercado.carrinho.keySet()) {
			int quant = Mercado.carrinho.get(p);
			valorTotal += p.getPreco() * quant;
			System.out.println(p);
			System.out.println("Quantidade: " + quant);
			System.out.println(" ----------------------------------------");
		}
		System.out.println("Sua fatura � " + Utils.doubleParaString(valorTotal));
		Mercado.carrinho.clear();
		System.out.println("Obrigado pela prefer�ncia.");
		Utils.pausar(5);
		Mercado.menu();
	}
}
