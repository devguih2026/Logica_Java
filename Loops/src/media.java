import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		// Leia notas até o usuário digitar -1.
		// Depois, mostre a média.
		
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);
		List<Integer> listaNotas = new ArrayList<>();
		
		while (true) {
			System.out.print("Digite uma nota: ");
			int nota = sc.nextInt();
			if (nota != -1) { 
				listaNotas.add(nota);
				
				soma += nota;
			} else {	
				break;
			} 
			
		}
		
		int tamanhoArray = listaNotas.size();
		if (tamanhoArray > 0) {
			double media = (double) soma / tamanhoArray;
			System.out.println("Média final: "+ media);
		} else {
			System.out.print("Nenhuma nota foi digitada");
		}
			
		//System.out.println("Média final: "+ media);
	}
			
}
	


