import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite um valor:");
		A = sc.nextInt();
		System.out.println("Digite outro valor:");
		B = sc.nextInt();
		
		if (A%B ==0 || B%A==0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não São Multiplos");
		}
		
		
		
		
		
		sc.close();

	}

}
