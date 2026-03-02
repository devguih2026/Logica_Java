import java.util.Scanner;
public class ClassificaçaoDeProduto {

	public static void main(String[] args) {
		// Leia um código de produto (inteiro).

		// 1: Alimento perecível

		// 2: Alimento não perecível

		// 3: Vestuário

		// 4: Higiene Pessoal
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o código do produto: ");
		int codigo = sc.nextInt();
		String produto;
		
		switch (codigo) {
		case 1:
			produto = "Alimento perecível";
	        break;
		case 2:
			produto = "Alimento não perecível";
	        break;
		case 3:
			produto = "Vestuário";
	        break;
		case 4:
			produto = "Higiene Pessoal";
	        break;   
	    default:
	    	produto = "Código inválido. Por favor, digite um valor entre 1 e 4";
	    	break;
		}
		System.out.print(produto);
	}
}
