package poo_adega;

public abstract class Bebida {
	
	private String nome;
	private double preco;
	
	public Bebida(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	abstract String mostrarBebida();
	abstract boolean verificarPreco(double preco);
}
