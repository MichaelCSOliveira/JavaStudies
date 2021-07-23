package list;

import java.util.Scanner;

public class TrocaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite um número para a variável A: ");
		int a = reader.nextInt();
		System.out.print("Digite outro número para a variável B: ");
		int b = reader.nextInt();
		int c = b;
		b = a;
		a = c;
		System.out.println("Número na variável A: " + a);
		System.out.println("Número na variável B: " + b);

	}

}
