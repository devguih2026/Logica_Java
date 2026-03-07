import java.util.Scanner;
public class MenuDeLanchonete {

	public static void main(String[] args) {
		// Exiba um menu com 5 itens e seus preços. 
		// O usuário digita o código do item e a quantidade. 
		// O switch deve calcular o valor total com base no código escolhido.
		
		System.out.println("Bem vindo à lanchonete");
		System.out.println("Aqui temos os seguintes itens:");
		System.out.println("1 Xis: 25R$, 2 Hot Dog: 20R$, 3 Refri: 10R$, 4 Suco: 10R$, 5 chocolate: 10R$");
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual você quer? ");

		int item = sc.nextInt();
		System.out.print("Quantos? ");
		int quantidade = sc.nextInt();
		int ValorTotal = 0;
		
		switch (item) {
		case 1:
			ValorTotal = 25 * quantidade;
	        break;
		case 2:
			ValorTotal = 20 * quantidade;
	        break;
		case 3:
			ValorTotal = 10 * quantidade;
	        break;
		case 4:
			ValorTotal = 10 * quantidade;
	        break;
		case 5:
			ValorTotal = 10 * quantidade;
	        break;
	}
		System.out.printf("O pedido custará %d R$", ValorTotal);
}
}
