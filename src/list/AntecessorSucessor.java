package list;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima
		o seu antecessor e seu sucessor.*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = reader.nextInt();
		System.out.println("O número antecessor é: "+(a-1));
		System.out.println("O número antecessor é: "+(a+1));
		
	}

}
