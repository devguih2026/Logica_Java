import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class SomaTotal {

	public static void main(String[] args) {
		// Leia 5 números e mostre a soma total
		
		int soma = 0;
		List<Integer> listaNumeros = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int numero = sc.nextInt();
            listaNumeros.add(numero);
            soma += numero;
     
			}
	        String mensagem = String.format("Lista final: %s", listaNumeros);
			System.out.println(mensagem);
	        String mensagem1 = String.format("Soma total: %s", soma);
			System.out.println(mensagem1); 
        }
	}
			
			
	


