package application;

import java.util.Locale;
import java.util.Scanner;

import entittes01.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		Account conta;

		System.out.print("NUMERO CONTA: ");
		int numeroConta = edd.nextInt();
		System.out.print("TITULAR:");
		edd.nextLine();
		String nome = edd.nextLine();

		System.out.println("DEPOSITO INICIAL: S/N ");
		System.out.print("OPÇÃO: ");
		String escolha = edd.next();
		edd.nextLine();

		if (escolha.charAt(0) == 'S') {
			System.out.print("DEPOSITO INICIAL: R$");
			double depositoInicial = edd.nextDouble();

			conta = new Account(numeroConta, nome, depositoInicial);

		} else {
			conta = new Account(numeroConta, nome);

		}

		System.out.println("DADOS DA CONTA");
		System.out.println(conta.toString());
		
		System.out.print("ADIONAR VALOR: R$");
		double deposito = edd.nextDouble();
		conta.deposito(deposito);
		
		System.out.println(conta.toString());

		System.out.print("SACAR VALOR: R$");
		double saque = edd.nextDouble();
		conta.saque(saque);
		
		System.out.println(conta.toString());

		edd.close();
	}
}