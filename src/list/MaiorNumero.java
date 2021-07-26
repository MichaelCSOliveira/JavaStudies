package list;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		/*Crie uma classe java MaiorNumero que contenha um método que receba
		dois números inteiros e imprima o maior entre eles.*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = reader.nextInt();
		System.out.print("Digite outro número: ");
		int b = reader.nextInt();
		if (a>b) System.out.print("O maior número é: " + a);
		else System.out.print("O maior número é: " + b);
		
	}

}
