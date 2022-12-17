package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Nota;

public class program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota student = new Nota();
		
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f Pontos ", student.notaFinal());
		if (student.notaFinal()<60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoint());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
