package poo_adega;

public class Refrigerante extends Bebida{
	
	private boolean retornavel;
	
	public Refrigerante (String nome, double preco, boolean retornavel) {
		super(nome, preco);
		this.retornavel = retornavel; 
	}
	
	public boolean getRetornavel() {
		return (retornavel);
	}
	
	public void setRetornavel(boolean retornavel) {
		this.retornavel = retornavel;
	}
	
	public String mostrarBebida() {
		return ("Nome do Refrigerante: "+getNome()
		+"\n Preço: R$"+getPreco()
		+"\n Retorável: "+retornavel);
	}
	public boolean verificarPreco(double preco) {
		if (preco<5) return (true);
		return (false);
	}

}
