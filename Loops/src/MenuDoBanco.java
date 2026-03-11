import java.util.Scanner;
public class MenuDoBanco {

	public static void main(String[] args) {
		// Crie um programa com um saldo inicial. O usuário escolhe:

		// 1: Consultar Saldo

		// 2: Depositar (pede o valor)

		// 3: Sacar (pede o valor e verifica se tem saldo)

		// 0: Sair
		
		double Saldo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Para consultar seu saldo, digite 1");
		System.out.println("Para depositar saldo, digite 2");
		System.out.println("Para sacar, digite 3");
		System.out.println("Para fecahr o programa, digite 4");
		System.out.print("Escolha uma opção: ");
		int escolher = sc.nextInt(); 
		
		while (escolher != 4) {
			switch (escolher) {
			case 1:
				System.out.printf("Seu saldo atual é: R$%s", Saldo);
			break;
			case 2:
				System.out.printf("Digite o valor: ");
				double valor = sc.nextDouble();
				Saldo += valor;
				System.out.printf("Seu saldo atual é: R$%s", Saldo);
			break;
			case 3:
				System.out.printf("Digite o valor: ");
				double saque = sc.nextInt();
				if (saque > Saldo) {
					System.out.printf("Não é possível sacar um valor maior que R$%s", Saldo);
				} else {
					Saldo -= saque;
					System.out.printf("Seu saldo atual é: R$%s", Saldo);
				}
			break;
			default:
				System.out.print("Opção inválida");
				break;
		}
			System.out.print("\nEscolha outra opção (4 para sair): ");
		    escolher = sc.nextInt();
		    if (escolher == 4) {
		    	System.out.print("Obrigado por usar o sistema");
		    }
	}
	}
}
