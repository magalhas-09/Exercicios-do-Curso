package application;

import java.util.Locale;
import java.util.Scanner;

import entities.currencyConverter;

public class program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		currencyConverter dollar = new currencyConverter();
		
		System.out.println("What is the dollar price? ");
		dollar.dollarPrice = sc.nextDouble();
		
		System.out.println();
		System.out.println("How many dollars will be bought? ");
		dollar.price = sc.nextDouble();
		
		System.out.println();
		System.out.println(dollar);
				
		
		
		
		sc.close();

	}

}
