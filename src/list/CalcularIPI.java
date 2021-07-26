package list;

import java.util.Scanner;

public class CalcularIPI {

	public static void main(String[] args) {
		/*Escrever um algoritmo que lê:
			- a porcentagem do IPI a ser acrescido no valor das peças;
			- o código da peça 1, valor unitário da peça 1, quantidade de peças 1;
			- o código da peça 2, valor unitário da peça 2, quantidade de peças 2.
		O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
		Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
		int ipi = reader.nextInt();
		
		System.out.print("Digite o código da peça 1: ");
		int cod1 = reader.nextInt();
		System.out.print("Digite o valor unitário da peça 1: ");
		int val1 = reader.nextInt();
		System.out.print("Digite a quantidade de peças: ");
		int quant1 = reader.nextInt();
		
		System.out.print("Digite o código da peça 2: ");
		int cod2 = reader.nextInt();
		System.out.print("Digite o valor unitário da peça 2: ");
		int val2 = reader.nextInt();
		System.out.print("Digite a quantidade de peças 2: ");
		int quant2 = reader.nextInt();
		
		System.out.print("O total a pagar é: R$"+(val1*quant1 + val2*quant2)*(ipi/100 + 1));

	}

}
