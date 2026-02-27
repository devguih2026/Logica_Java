import java.util.Scanner;
public class NumeroPrimo {

	public static void main(String[] args) {
		// Leia um número e diga se ele é primo.
		// um número que só pode ser dividido por 1 e ele mesmo
		// exemplos: 2, 3, 5, 7, 11
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		int totalDivisores = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				totalDivisores++;
			}
		}
		if (totalDivisores == 2) {
			System.out.println("É primo");
		} else {
			System.out.print("Não é primo");
		}
	}
}
