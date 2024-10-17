package application;

import java.util.Locale;
import java.util.Scanner;

import entittes01.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);

		System.out.print("NUMERO CONTA: ");
		int numeroConta = edd.nextInt();
		System.out.print("TITULAR:");
		String nome = edd.next();
		// edd.nextLine();
		System.out.print("DEPOSITO INICIAL: S/N" );
		String escolha = edd.next();
		edd.nextLine();

		if (escolha.charAt(0) == 'S') {
			System.out.print("DEPOSITO INICIAL");
			double saldo = edd.nextDouble();

			Account conta = new Account(numeroConta, nome, saldo);

			System.out.println("CONTA: " + conta.getNumeroConta() + " - TITULAR: " + conta.getNome() + " - SALDO: R$"
					+ conta.getSaldo());
			
			System.out.print("ADIONAR VALOR: R$");
			double deposito = edd.nextDouble();
			conta.deposito(deposito);
			
			System.out.println("CONTA: " + conta.getNumeroConta() + " - TITULAR: " + conta.getNome() + " - SALDO: R$"
					+ conta.getSaldo());
			
			System.out.print("SACAR VALOR: R$");
			double saque = edd.nextDouble();
			conta.saque(saque);
			
			System.out.println("CONTA: " + conta.getNumeroConta() + " - TITULAR: " + conta.getNome() + " - SALDO: R$"
					+ conta.getSaldo());
			
		} else {
			Account conta = new Account(numeroConta, nome);

			System.out.println("CONTA: " + conta.getNumeroConta() + " - TITULAR: " + conta.getNome() + " - SALDO: R$"
					+ conta.getSaldo());
			
			System.out.print("ADIONAR VALOR: R$");
			double deposito = edd.nextDouble();
			conta.deposito(deposito);
			
			System.out.println("CONTA: " + conta.getNumeroConta() + " - TITULAR: " + conta.getNome() + " - SALDO: R$"
					+ conta.getSaldo());
			
			System.out.print("SACAR VALOR: R$");
			double saque = edd.nextDouble();
			conta.saque(saque);
			
			System.out.println("CONTA: " + conta.getNumeroConta() + " - TITULAR: " + conta.getNome() + " - SALDO: R$"
					+ conta.getSaldo());
		}
		edd.close();
	}
}