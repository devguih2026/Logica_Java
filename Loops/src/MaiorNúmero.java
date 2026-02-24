import java.util.Scanner;
public class MaiorNúmero {

	public static void main(String[] args) {
		// Leia vários números até o usuário digitar 0.
		// Mostre o maior número digitado.
		
		Scanner sc = new Scanner(System.in);
		
		int numero = -1;
		int maior = 1;
		
		while (numero != 0) {
			System.out.print("Digite um número: ");
		    numero = sc.nextInt();
		    if (numero > maior) {
				maior = numero;
				if (numero == 0){	
						break;
					}
			}
		}
		String mensagem = String.format("Maior número digitado: %s", maior);
		System.out.println(mensagem);
	}
}
