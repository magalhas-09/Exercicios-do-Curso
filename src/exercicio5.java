import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um numero:");
		x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Não Negativo");
		}
		
		else {
			System.out.println("Negativo");
		}

		
		
		sc.close();
	}

}
