package poo_vinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Vinho vinho = new Vinho(null, null, 0, 0);
		Scanner reader = new Scanner(System.in);
		int menu = 1;
		String nome = "";
		String tipo = "";
		double preco = 0;
		int safra = 0;
		while (menu > 0 && menu<4) {
			System.out.println("---VINICULA--- \n1 - Cadastrar vinho \n2 - Verificar preço \n3 - Mostrar vinho \nQualquer outro número para encerrar. \n-");
			menu = reader.nextInt();
			reader.nextLine();
			switch (menu) {
				case 1:
					System.out.print("Informe o nome do vinho: ");
					nome = reader.nextLine();
					vinho.setNome(nome);
					System.out.print("Informe o tipo do vinho: ");
					tipo = reader.nextLine();
					vinho.setTipo(tipo);
					System.out.print("Informe o preco do vinho: ");
					preco = reader.nextDouble();
					vinho.setPreco(preco);
					System.out.print("Informe o safra do vinho: ");
					safra = reader.nextInt();
					vinho.setSafra(safra);
					break;
				case 2:
					if(vinho.verificarPreco(vinho.getPreco()) == true) {
						System.out.println("-\nProduto em Oferta!\n-");
					} else {
						System.out.println("-\nProduto com preço normal!\n-");
					}
					break;
				case 3:
					System.out.println(vinho.mostrarVinho());
					break;
			}
		}
	}

}
