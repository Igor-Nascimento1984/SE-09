package entities;

public class Product {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Product() {
		}
	
	public Product(String nome,double preco,int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Product(String nome,double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	/*
	 * PARA ADICIONAR/RETIRAR PRODUTOS DO TEMOS OS METODOS. 
	 * public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}*/
	
	public double quanTotalEmEstoque() {
		return preco*quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+", $"
				+String.format("%.2f", preco)
				+", "
				+quantidade
				+" UNIDADES, TOTAL: R$"
				+String.format("%.2f", quanTotalEmEstoque());
	}
}
