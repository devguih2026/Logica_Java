package notas;
import java.util.Scanner;

public class Aprovado {

	public static void main(String[] args) {
		// Leia uma nota de 0 a 10 e informe:
	    //  < 5 → Reprovado
		// 5 a 6.9 → Recuperação
		// ≥ 7 → Aprovado
		// Valide se a nota é válida.
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua nota: ");
        int nota = sc.nextInt();
        
        if (nota < 5 & nota > 0) {
        	System.out.println("Está reprovado(a)");
        } else if (nota > 5 & nota < 6.9) {
        	System.out.println("Está de recuperação");
        } else if (nota > 7) {
        	System.out.println("Está aprovado(a)");
        } else if (nota < 0){
        	System.out.println("Digite uma nota válida");
        }

	}

}
