package list;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		//Informar um saldo e imprimir o saldo com reajuste de 1%.

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite o saldo: ");
		double saldo = reader.nextInt();
		double reajuste = saldo + saldo*0.01;
		System.out.print("O saldo com o reajuste de 1% é igual a " + reajuste);
		
	}

}
