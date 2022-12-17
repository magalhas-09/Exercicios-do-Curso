import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double total;
		
		
		
		if (x<2000.0) {
			total = 0.0;
		}
		else if (x<=3000.0) {
			total = (x - 2000.0)*0.08;
		}
		else if (x<=4500) {
			total = (x - 3000.0)*0.18 + 1000.0 * 0.08;
		}
		else {
			total = (x - 4500.0)*0.28 + 1500 * 0.18 + 1000.0 * 0.08;	
		}
		if (total == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", total);
		}
		
		sc.close();

	}

}
