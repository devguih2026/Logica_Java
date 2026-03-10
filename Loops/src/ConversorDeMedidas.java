import java.util.Scanner;
public class ConversorDeMedidas {

	public static void main(String[] args) {
		// O usuário digita um valor em metros e escolhe uma opção:

		// 1: Milímetros

		// 2: Centímetros

		// 3: Quilômetros
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor em metros: ");
		int medida = sc.nextInt();
		System.out.print("Quer converter para milímetros, centímetros ou quilômetros? ");
		String converter = sc.next();
		double ValorConvertido = 0;
		
		switch (converter) {
			case "milímetros":
				ValorConvertido = (double) (medida * 1000);  // 	multiplica o valor de comprimento por 1000 para converter metros para milímetros
				break;
			case "centímetros":
				ValorConvertido = (double) (medida * 100); // multiplica o valor de comprimento por 1000 para converter metros para centímetros
				break;
			case "quilômetros":
				ValorConvertido = (double) (medida / 1000.0);  // divide o valor de comprimento por 1000 para converter metros para quilômetros
				break;
		}
			System.out.print(ValorConvertido);
	}
	
}
