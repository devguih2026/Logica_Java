import java.util.Scanner;
public class DiasDaSemana {

	public static void main(String[] args) {
		// Leia um número de 1 a 7 e imprima o nome do dia correspondente 
		// (1 - Domingo, 2 - Segunda, etc.). Use o default para avisar se o número for inválido.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um dia: ");
		int dia = sc.nextInt();
		String NomeDia;
		
		switch (dia) {
			case 1:
				NomeDia = "Domingo";
		        break;
			case 2:
				NomeDia = "Segunda";
				break;
			case 3:
				NomeDia = "Terça";
		        break;
			case 4:
				NomeDia = "Quarta";
		        break;
			case 5:
				NomeDia = "Quinta";
		        break;
			case 6:
				NomeDia = "Sexta";
		        break;
			case 7:
				NomeDia = "Sábado";
		        break;
			default:
		        NomeDia = "Dia inválido";
		        break;
	}
		System.out.println(NomeDia);
	}
}
