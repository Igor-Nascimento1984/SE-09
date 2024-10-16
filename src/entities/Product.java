package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
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
