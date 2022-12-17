import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horainicial, horafinal;
		
		System.out.println("Digite hora inicial");
		horainicial = sc.nextInt();
		System.out.println("Digite hora final");
		horafinal = sc.nextInt();
		
		int duracao;
		
		if (horainicial < horafinal) {
			duracao = horainicial - horafinal;
		}
		else {
			duracao = 24 - horainicial + horafinal;
		}
		
		System.out.println("O jogo durou " + duracao + " Horas ");
		
		
		sc.close();

	}

}
