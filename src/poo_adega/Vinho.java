package poo_adega;

public class Vinho extends Bebida {
	
	private String tipo;
	private int safra;
	
	public Vinho (String nome, double preco, String tipo, int safra) {
		super(nome, preco);
		this.tipo = tipo;
		this.safra = safra;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getSafra() {
		return safra;
	}
	public void setSafra(int safra) {
		this.safra = safra;
	}

	public String mostrarBebida() {
		return ("Nome do Vinho: "+getNome()
			+"\n Preço: R$"+getPreco()
			+"\n Tipo: "+tipo
			+"\n Safra: "+safra);
	}
	public boolean verificarPreco(double preco) {
		if (preco<25) return true;
		return false;
		
	}
	
}
