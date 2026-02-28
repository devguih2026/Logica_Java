import java.util.Scanner;
public class MiniSistema {

	public static void main(String[] args) {
		// Crie um menu que se repete até o usuário escolher sair:

		// 1 – Somar dois números
		// 2 – Subtrair dois números
		// 3 – Multiplicar dois números
		// 4 – Dividir dois números
		// 0 – Sair
		
		System.out.println("Bem vindo(a) à calculadora Java");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quer fazer algum cálculo? ");
		String calculo = sc.next();
		
		if (calculo.equals("sim")) {
			while (true) {
				System.out.println("-------------");
				System.out.println("Para somar dois números, digite 1");
				System.out.println("Para subtrair dois números, digite 2");
				System.out.println("Para multiplicar dois números, digite 3");
				System.out.println("Para dividir dois números, digite 4");
				System.out.println("Digite 0 para sair do programa");
				
				System.out.print("Digite a opção: ");
				int conta = sc.nextInt();
				
				if (conta == 1) {
					System.out.print("Digite o primeiro número: ");
					int n1 = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int n2 = sc.nextInt();
					int resultadoSoma = n1 + n2;
					String mensagemSoma = String.format("%s + %s = %s", n1, n2, resultadoSoma);
					System.out.println(mensagemSoma);
					
				} else if (conta == 2) {
					System.out.print("Digite o primeiro número: ");
					int n1 = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int n2 = sc.nextInt();
					int resultadoSubtracao = n1 - n2;
					String mensagemSubtracao = String.format("%s - %s = %s", n1, n2, resultadoSubtracao);
					System.out.println(mensagemSubtracao);
					
				}  else if (conta == 3) {
					System.out.print("Digite o primeiro número: ");
					int n1 = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int n2 = sc.nextInt();
					int resultadoMultiplicacao = n1 * n2;
					String mensagemX = String.format("%s x %s = %s", n1, n2, resultadoMultiplicacao);
					System.out.println(mensagemX);
					
				}	else if (conta == 4) {
					System.out.print("Digite o primeiro número: ");
					int n1 = sc.nextInt();
					System.out.print("Digite o segundo número: ");
					int n2 = sc.nextInt();
					if (n2 == 0) {
						System.out.print("0 não é válido");
					} else {
					double resultadoDivisao = (double) n1 / n2;
					String mensagemDivisao = String.format("%s / %s = %s", n1, n2, resultadoDivisao);
					System.out.println(mensagemDivisao);
					}
				} else if (conta > 4) {
					System.out.println("Opção inválida");
				} else {
					System.out.println("Fim do programa");
					break;
				}
			}		
		} else {
			System.out.println("Fim do programa");
		}	
	}
}

