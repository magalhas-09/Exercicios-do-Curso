package application;

import java.util.Locale;
import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();		
		
		int[] vet = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Valores: ");
		for(int i=0; i<n; i++) {
			System.out.println(vet[i]);
			}
		
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			sum += vet[i];
			
		}
		
        double avg = sum / vet.length;
		
        System.out.println();
        System.out.println("Soma = " + sum);
		System.out.printf("AVERAGE PRICE =  %.2f%n", avg);
		
		
		
		sc.close();
		
		sc.close();

	}

}
