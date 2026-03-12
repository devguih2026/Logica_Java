import java.util.Scanner;
public class ValidarDDD {

	public static void main(String[] args) {
		// Leia um número de DDD e informe a qual cidade ele pertence 
		// (ex: 11 - São Paulo, 21 - Rio de Janeiro, 51 - Porto Alegre, 31 - BH, Minas Gerais, 61 - Brasília
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um DDD: ");
		int ddd = sc.nextInt();
		String estado = "";
			
		switch (ddd) {
			case 51:
			estado = "Rio Grande do Sul";
			break;
			case 21:
				estado = "Rio de Janeiro";
			break;
			case 11:
				estado = "São Paulo";
			break;
			case 31:
				estado = "Minas Gerais";
			break;
			case 61:
				estado = "Brasília";
				break;
			default:
				System.out.print("DDD não registrado");
				return;
		}
		
		
		System.out.printf("DDD %d pertence ao estado: %s%n", ddd, estado);
	}
}

