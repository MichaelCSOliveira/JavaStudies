package list;

import java.util.Scanner;
import java.time.LocalDate;

public class DiaIdade {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
		meses e dias e mostre-a expressa em dias. Leve em consideração o ano
		com 365 dias e o mês com 30.
		(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
		
		Scanner reader = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		
		System.out.print("Digite o ano que você nasceu: ");
		int ano = reader.nextInt();
		System.out.print("Digite o mês que você nasceu: ");
		int mes = reader.nextInt();
		System.out.print("Digite o dia que você nasceu: ");
		int dia = reader.nextInt();
		int diaAtual = date.getDayOfMonth();
		int mesAtual = date.getMonthValue();
		int anoAtual = date.getYear();
		int anoIdade = anoAtual - ano;
		int mesIdade = mesAtual - mes;
		int idade = (anoIdade*365 + mesIdade*30 + diaAtual);
		System.out.println("Dia que você nasceu: " + dia +"/"+mes+"/"+ano);
		System.out.println("Sua idade atual: "+ anoIdade +" ano(s)");
		System.out.println("Sua idade em dias: " + idade);

	}

}
