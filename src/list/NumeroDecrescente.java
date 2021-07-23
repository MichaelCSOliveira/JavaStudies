package list;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		// Crie uma classe java NumeroDecrescente que contenha um método que receba um número inteiro e imprima, em ordem decrescente, o valor do número até 0.
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int a = reader.nextInt();
		System.out.println("A ordem decrescente desse número é: ");
		while (a>0) {
			System.out.print(a + " - ");
			a--;
			if (a==0) System.out.print(a);
			
		}
		
		
	}

}
