package poo_adega;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Vinho vinho = new Vinho(null, 0.0, null, 0);
		Suco suco = new Suco(null, 0, null);
		Refrigerante refrigerante = new Refrigerante (null, 0, false);
		
		int menu = 1;
		boolean subMenuControl = false;
		String subMenu = "";
		
		while (menu>0 && menu<4) {
			subMenuControl = false;
			System.out.println("---ADEGA---");
			System.out.println("1 - Cadastrar \n2 - Verificar Preço \n3 - Mostrar Dados \nQualquer outro número para encerrar.");
			menu = reader.nextInt();
			switch (menu) {
				case 1:
					System.out.println("1 - Vinho \n2 - Suco \n3 - Refrigerante");
					while (subMenuControl == false) {
						menu = reader.nextInt();
						reader.nextLine();
						switch (menu) {
							case 1:
								System.out.print("Informe o nome do vinho: ");
								vinho.setNome(reader.nextLine());
								System.out.print("Informe o tipo do vinho: ");
								vinho.setTipo(reader.nextLine());
								System.out.print("Informe o preco do vinho: ");
								vinho.setPreco(reader.nextDouble());
								System.out.print("Informe o safra do vinho: ");
								vinho.setSafra(reader.nextInt());
								reader.nextLine();
								subMenuControl = true;
								break;
							case 2:
								System.out.print("Informe o nome do suco: ");
								suco.setNome(reader.nextLine());
								System.out.print("Informe o preco do suco: ");
								suco.setPreco(reader.nextDouble());
								reader.nextLine();
								System.out.print("Informe o sabor do suco: ");
								suco.setSabor(reader.nextLine());
								subMenuControl = true;
								break;
							case 3 :
								System.out.print("Informe o nome do refrigerante: ");
								refrigerante.setNome(reader.nextLine());
								System.out.print("Informe o preco do refrigerante: ");
								refrigerante.setPreco(reader.nextDouble());
								reader.nextLine();
								System.out.print("É retornável? 1 - Sim || 2 - Não");
								menu = reader.nextInt();
								reader.nextLine();
								if (menu == 1) { refrigerante.setRetornavel(true);}
								else if (menu == 2) { refrigerante.setRetornavel(false);}
								else { System.out.println("Opção inexistente");}
								subMenuControl = true;
								break;
							default: 
								System.out.println("Opção inexistente.");
								break;
						}
					}
					break;
				case 2:
					System.out.println("1 - Vinho \n2 - Suco \n3 - Refrigerante");
					while (subMenuControl == false) {
						menu = reader.nextInt();
						reader.nextLine();
						switch (menu) {
							case 1:
								if (vinho.verificarPreco(vinho.getPreco())==true) {
								System.out.println("Produto em Oferta!");
								} else { System.out.println("Produto com preço normal!");}
								subMenuControl = true;
								break;
							case 2:
								if (suco.verificarPreco(suco.getPreco())==true) {
									System.out.println("Produto em Oferta!");
								} else { System.out.println("Produto com preço normal!");}
								subMenuControl = true;
								break;
							case 3:
								if (refrigerante.verificarPreco(refrigerante.getPreco())==true) {
									System.out.println("Produto em Oferta!");
								} else { System.out.println("Produto com preço normal!");}
								subMenuControl = true;
								break;
							default:
								System.out.println("Opção inexistente.");
								break;
						}
					}
					break;
				case 3:
					System.out.println("1 - Vinho \n2 - Suco \n3 - Refrigerante");
					while (subMenuControl == false) {
						menu = reader.nextInt();
						reader.nextLine();
						switch (menu) {
							case 1:
								System.out.println(vinho.mostrarBebida());
								subMenuControl = true;
								break;
							case 2:
								System.out.println(suco.mostrarBebida());
								subMenuControl = true;
								break;
							case 3:
								System.out.println(refrigerante.mostrarBebida());
								subMenuControl = true;
								break;
							default:
								System.out.println("Opção inexistente.");
								break;
						}
					}
					break;
			}
		}

	}

}
