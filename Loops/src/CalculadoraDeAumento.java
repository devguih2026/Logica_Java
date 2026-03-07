import java.util.Scanner;
public class CalculadoraDeAumento {

	public static void main(String[] args) {
		// Leia o salário de um funcionário e o seu cargo (A, B ou C).

		// A: 10% de aumento

		// B: 15% de aumento

		// C: 20% de aumento

		// Use o switch para definir o percentual de aumento
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual sua profissão? (A, B, C)");
		String profissao = sc.next();
		System.out.print("Qual seu salário? ");
		double salario = sc.nextDouble();
		double aumento = 0;
		double NovoSalario = 0;
		
		switch (profissao) {
			case "A":
				aumento = (int) (salario * 0.1);
				break;
			case "B":
				aumento = (int) (salario * 0.15);
				break;
			case "C":
				aumento = (int) (salario * 0.2);
				break;
		}
		NovoSalario = aumento + salario;
		System.out.printf("Seu aumento será de R$%.2f, seu salário será de: R$%.2f", aumento, NovoSalario);
	}

}
