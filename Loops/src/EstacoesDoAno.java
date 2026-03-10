import java.util.Scanner;
public class EstacoesDoAno {

	public static void main(String[] args) {
		// Faça um programa que leia o número do mês 
		// diga se é "Verão", "Outono", "Inverno" ou "Primavera" (agrupando os meses de cada estação).
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um mês pelo seu número: ");
		int mes = sc.nextInt();
		String Estacao = null;
		
		switch (mes) {
			case 12, 1, 2:
				Estacao = "Verão";
				break;
			case 3, 4, 5:
				Estacao = "Outuno";
				break;
			case 6, 7, 8:
				Estacao = "Inverno";
				break;
			case 9, 10, 11:
				Estacao = "Primavera";
				break;
	}
		String mensagem = String.format("Esse mês é durante o %s", Estacao);
		System.out.println(mensagem);
}
}
