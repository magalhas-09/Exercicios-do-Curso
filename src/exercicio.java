import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorhora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorhora = sc.nextDouble();
		
		salario = horas*valorhora;
		
		System.out.println("O numero do funcionario é: " + numero);
		System.out.printf("O salário é de U$ %.2f%n", salario);
		
		sc.close();
		

	}

}
