package list;

public class SomaMultiplicacao {

	public static void main(String[] args) {
		/* Escreva um programa que imprima na tela a soma dos números ímpares
		entre 0 e 30 e a multiplicação dos números pares entre 0 e 30.*/ 
		int soma = 0;
		int multi = 0;
		for(int i = 0; i<=30; i++) {
			if(i%2==1) soma = soma + i;
			if(i%2==2) multi = multi * i;
		}
		System.out.println("A soma dos números ímpares é: " + soma);
		System.out.println("A multiplicação dos números pares é: " + multi);
		
	}

}
