package list;

import java.util.Scanner;

public class TrocaNumero {

	public static void main(String[] args) {
		/*Crie uma classe java TrocaNumero que contenha um método que receba
		dois números NumA e NumB, nessa ordem, e imprima em ordem inversa, isto
		é, se os dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser
		impressos na ordem NumA = 9 e NumB = 5.*/
		
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
