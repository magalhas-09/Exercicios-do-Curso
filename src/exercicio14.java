import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Domingo";
		} 
		else if (x == 2) {
			dia = "Segunda";
		}
		else if (x == 3) {
			dia = "Terca";
		}
		else if (x == 4) {
			dia = "Quarta";
		}
		else if (x == 5) {
			dia = "Quinta";
		}
		else if (x == 6) {
			dia = "Sexta";
		}
		else if (x == 7) {
			dia = "Sabado";
		}
		else {
			dia = "Valor invalido";
		}

		System.out.println("Dia da Semana: " + dia);
		
		
		
		sc.close();
	}

}
