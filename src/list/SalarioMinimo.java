package list;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class SalarioMinimo {

	public static void main(String[] args) {
		/*Crie um algoritmo que leia o valor do salário mínimo e o valor do
		salário de um usuário, calcule a quantidade de salários mínimos esse
		usuário ganha e imprima o resultado. (1SM=R$788,00)*/
		
		Scanner reader = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Digite o valor do salário mínimo atual: R$");
		double salMin = reader.nextInt();
		System.out.print("Digite o valor do salário do usuário: R$");
		double salUser = reader.nextInt();
		int sal = (int) (salUser / salMin);
		System.out.println("O usuário ganha um total de "+sal+" salário(s) minímos."); 
		System.out.println("Salário minímo atual: R$"+df.format(salMin));
		System.out.println("Salário do usuário: R$"+df.format(salUser));
		
	}

}
