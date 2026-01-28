package maiorDeDois;

public class Main {

	public static void main(String[] args) {
		// Leia dois números e informe qual é o maior ou se são iguais.
		// Read two numbers and inform which is the bigger or if they are both the same
		
		int n1 = 10;
		int n2 = 11;
		if (n1 > n2) {
			String mensagem = String.format("O número %s é maior", n1);
			System.out.println(mensagem);
		}	else if (n2 > n1){
			String mensagem = String.format("O número %s é maior", n2);
			System.out.println(mensagem);
		} else {
			System.out.println("ambos são iguais");
		}

	}
	
}
