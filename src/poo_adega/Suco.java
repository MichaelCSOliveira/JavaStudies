package poo_adega;

public class Suco extends Bebida {
	
	private String sabor;

	public Suco (String nome, double preco, String sabor) {
		super(nome, preco);
		this.sabor = sabor;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String mostrarBebida() {
		return ("Nome do Vinho: "+getNome()
		+"\n Preço: R$"+getPreco()
		+"\n Sabor: "+sabor);
	}
	public boolean verificarPreco(double preco) {
		if (preco<2.5) return (true);
		return (false);
	}
}
