import java.util.Scanner;
public class ConversorDeClima {

	public static void main(String[] args) {
		// Leia uma letra (V, O, I, P)
		// imprima a estação do ano correspondente: Verão (Summer), Outono, Inverno ou Primavera.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma letra (V, O, I, P): ");
		String letra = sc.next().toUpperCase();
		String estacao;
		
		switch (letra) {
			case "V":
				estacao = "Verão";
				break;
			case "O":
				estacao = "Outono";
				break;
			case "I":
				estacao = "Inverno";
				break;
			case "P":
				estacao = "Primavera";
				break;
			default:
			    estacao = "Letra inválida";
			    break;
		}
		
		System.out.print(estacao);
	}

}
