package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoedas;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do Dolar?");
		ConversorMoedas.valor = sc.nextDouble();
		System.out.println("Quantos dolares vai comprar ?");
		double dolarConversao = sc.nextDouble();
		
		double conversao  = ConversorMoedas.converteDolarReais(dolarConversao);
		
		System.out.println(conversao);
		
		sc.close();
	}

}
