package list;

public class CalculosComMedia {

	public static void main(String[] args) {
		/*Fazer um programa que imprima a média aritmética dos números
		8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média
		das	médias.*/

		double a = (8 + 9 + 7) / 3;
		System.out.println("A média dos números 7, 8 e 9 é igual a " + a);
		double b = (4 + 5 + 6) / 3;
		System.out.println("A média dos números 4, 5 e 6 é igual a " + b);
		double c = a + b;
		System.out.println("A soma das médias é iagual a " + c);
		System.out.println("A média da soma é igual a " + c/2);
		
	}

}
