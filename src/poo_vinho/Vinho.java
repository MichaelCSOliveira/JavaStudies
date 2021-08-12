package poo_vinho;

public class Vinho {
	
	private String nome;
	private String tipo;
	private double preco;
	private int safra;
	
	public Vinho (String nome, String tipo, double preco, int safra) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.safra = safra;
	}
	
	// Get e Set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setSafra(int safra) {
		this.safra = safra;
	}
	
	//Metodos
	public String mostrarVinho() {
		return ("-\nVinho: "+nome+"\nTipo: "+tipo+"\nPreço: R$"+preco+"\nSafra: "+safra+"\n-");
	}
	

	public boolean verificarPreco(double preco){
		if (preco<25) return (true);
		return (false);
	}
	
}
