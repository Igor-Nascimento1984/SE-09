package entittes01;

public class Account {
		
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Account() {
		}
	
	public Account(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = 0;
	}

	public Account(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void saque(double saldo) {
		this.saldo -= (saldo + 5);
	}
	
	/*public String toString() {
		return "CONTA: "
				+ numeroConta
				+" - TITULAR: "
				+ nome
				+" - SALDO: R$"
				+saldo;
	}*/
	 
}
