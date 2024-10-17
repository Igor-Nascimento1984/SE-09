package aplication01;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		System.out.println("DADOS DO PRODUTO");
		System.out.print("PRODUTO:");
		String nome = edd.nextLine();
		System.out.print("PREÇO:");
		double preco = edd.nextDouble();
		System.out.print("QUANTIDADE:");
		int quantidade = edd.nextInt();

		Product produto = new Product(nome, preco,quantidade);
		
		produto.setNome("COMPUTADOR");
		System.out.println("ATUALIAZAÇÃO: " + produto.getNome());
		
		produto.setPreco(1200.00);
		System.out.println("ATUALIAZAÇÃO: " + produto.getPreco());
		
		System.out.println(produto.toString());

		System.out.print("ADICONAR PRODUTO: ");
		quantidade = edd.nextInt();
		produto.addProduto(quantidade);
		System.out.println(produto.toString());
		System.out.print("RETIRAR PRODUTO: ");
		quantidade = edd.nextInt();
		produto.removeProduto(quantidade);
		System.out.println(produto.toString());
		edd.close();

	}

}
