import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		// Leia um número e calcule seu fatorial usando loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		long fatorial = 1;
		
		for (int i = numero; i > 1; i --) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
	}

}
