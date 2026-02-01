package calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leia dois números e uma operação (+ - * /) e mostre o resultado. Trate divisão por zero.
		
		Scanner escolha = new Scanner(System.in);
		System.out.print("Quer fazer qual operação? ");
		String escolher = escolha.next();
		
		if (escolher.equals("somar")) {
			Scanner n1 = new Scanner(System.in);
			System.out.print("Digite o primeiro número: ");
			int numero1 = n1.nextInt();
			
			Scanner n2 = new Scanner(System.in);
			System.out.print("Digite o segundo número: ");
			int numero2 = n2.nextInt();
			
			int soma = numero1 + numero2;
			String mensagem = String.format("A soma de %d + %d é: %d", numero1, numero2, soma);
			System.out.println(mensagem);
			
		} else if (escolher.equals("subtrair")) {
			
			Scanner n1 = new Scanner(System.in);
			System.out.print("Digite o primeiro número: ");
			int numero1 = n1.nextInt();
			
			Scanner n2 = new Scanner(System.in);
			System.out.print("Digite o segundo número: ");
			int numero2 = n2.nextInt();
			
			int subtrair = numero1 - numero2;
			String mensagem = String.format("A subtração de %d - %d é: %d", numero1, numero2, subtrair);
			System.out.println(mensagem);
			
		} else if (escolher.equals("multiplicar")) {
			
			Scanner n1 = new Scanner(System.in);
			System.out.print("Digite o primeiro número: ");
			int numero1 = n1.nextInt();
			
			Scanner n2 = new Scanner(System.in);
			System.out.print("Digite o segundo número: ");
			int numero2 = n2.nextInt();
			
			int multiplicar = numero1 * numero2;
			String mensagem = String.format("A multiplicação de %d * %d é: %d", numero1, numero2, multiplicar);
			System.out.println(mensagem);
			
		} else if (escolher.equals("dividir")) {
			
			Scanner n1 = new Scanner(System.in);
			System.out.print("Digite o primeiro número: ");
			int numero1 = n1.nextInt();
			
			Scanner n2 = new Scanner(System.in);
			System.out.print("Digite o segundo número: ");
			int numero2 = n2.nextInt();
			if (numero2 == 0) {
				String mensagem = String.format("Não é possível dividir nenhum número por 0");
				System.out.println(mensagem);
			} else {
				int dividir = numero1 / numero2;
				String mensagem = String.format("A divisão de %d / %d é: %d", numero1, numero2, dividir);
				System.out.println(mensagem);
			}
			
		}
			
	}

}
