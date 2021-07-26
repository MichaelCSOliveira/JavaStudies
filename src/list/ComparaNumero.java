package list;

import java.util.Scanner;

public class ComparaNumero {

	public static void main(String[] args) {
		/*Crie uma classe java ComparaNumero que contenha um método que receba
		dois números e indique se são iguais ou se são diferentes. Mostre o
		maior e o menor (nesta sequência).*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = reader.nextInt();
		System.out.print("Digite outro número: ");
		int b = reader.nextInt();
		if(a==b) System.out.println("Os números são iguais.");
		if(a>b || b>a) System.out.println("Os números são diferentes.");
		System.out.println("O primero número digitado foi: " + a);
		System.out.println("O segundo número digitado foi: " + b);
	}

}
