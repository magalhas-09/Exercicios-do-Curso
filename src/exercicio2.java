import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cod1, numero1, cod2, numero2;
		double valor1, valor2, valorpagar;
		
		cod1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorpagar = numero1*valor1 + numero2*valor2;
		
		System.out.printf("Valor a pagar: %.2f%n", valorpagar);
		
						
		sc.close();

	}

}
