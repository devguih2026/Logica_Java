package desconto;
import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// Leia o valor de uma compra:

		//	≥ 500 → 20% de desconto
			
		//	≥ 300 → 15% de desconto
			
		//	≥ 100 → 10% desconto
			
		//	< 100 → sem desconto
			
		//	Mostre valor final.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor da compra? ");
		int compra = sc.nextInt();
		
		if (compra >= 500) {
			double desconto = compra * 0.2;
			String mensagem = String.format("Valor final: %s", compra - desconto); 
        	System.out.println(mensagem); 
		} else if (compra >= 300) {
			double desconto = compra * 0.15;
			String mensagem = String.format("Valor final: %s", compra - desconto); 
        	System.out.println(mensagem);
		} else if (compra >= 100) {
			double desconto = compra * 0.1;
			String mensagem = String.format("Valor final: %s", compra - desconto); 
        	System.out.println(mensagem);
		} else {
			String mensagem = String.format("Valor final: %s", compra); 
        	System.out.println(mensagem);
		}
	}
}
