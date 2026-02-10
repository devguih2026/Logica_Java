package anoBissexto;
import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// Leia um ano e informe se ele é bissexto ou não
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        
        if (ano % 4 == 0 && ano % 100 != 0) {
			String mensagem2 = String.format("É ano bissexto"); 
        	System.out.println(mensagem2); 
        } else if (ano % 400 == 0) {
            	String mensagem = String.format("É ano bissexto"); 
            	System.out.println(mensagem);
		} else {
			String mensagem3 = String.format("Não é ano bissexto"); 
        	System.out.println(mensagem3); }    
	}
}


