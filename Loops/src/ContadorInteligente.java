import java.util.Scanner;
public class ContadorInteligente {

	public static void main(String[] args) {
		// Leia um número N e:
		// Conte de 1 até N
		// Depois conte de N até 1
		
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		System.out.print("Digite um número: ");
	    int numero = sc.nextInt();
	    
	    System.out.println("Iniciando contagem");
	    
	    while (contador != numero) {
	    	contador ++;
	    	System.out.println(contador);
	    }
	    System.out.println("Iniciando contagem regressiva");
	    System.out.println(contador);
	    
	    while (contador > 1) {
	    	contador --;
	    	System.out.println(contador);
	    }
	}
}
