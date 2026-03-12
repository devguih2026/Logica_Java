import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		// Leia uma nota de 0 a 10 (inteira). Use o switch para imprimir:

		// 10 e 9: "Excelente"

		// 8 e 7: "Bom"

		// 6 e 5: "Regular"

		// Menor que 5: "Insuficiente"
		
		Scanner sc = new Scanner(System.in);
		int nota;

				// O loop continuará rodando enquanto a nota for inválida
				while (true) {
					System.out.print("Digite uma nota (0 a 10): ");
					nota = sc.nextInt();

					if (nota >= 0 && nota <= 10) {
						break; // Nota válida! Sai do loop while
					} else {
						System.out.println("Erro: Notas maiores que 10 ou menores que 0 não são aceitas.");
						System.out.println("Tente novamente.");
					}
				}

				// Assim que sair do while, o switch processa a nota válida
				String avaliar;
				switch (nota) {
					case 10, 9:
						avaliar = "Excelente";
						break;
					case 8, 7:
						avaliar = "Bom";
						break;
					case 6, 5:
						avaliar = "Regular";
						break;
					default:
						avaliar = "Insuficiente";
						break;
				}

				System.out.println("Resultado: " + avaliar);
			}
		}