import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		// Leia um número e mostre sua tabuada de 1 a 10
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		for (int contador = 1; contador < 11; contador ++) {
			int resultado = numero * contador;
			String mensagem = String.format("%s x %s = %s", numero, contador, resultado);
			System.out.println(mensagem);
		}
	sc.close();
	}

}
