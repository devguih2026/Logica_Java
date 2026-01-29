package maiorDeIdade;

public class Main {

	public static void main(String[] args) {
		// Leia a idade e classifique se a pessoa é criança, adolescente, adulto ou idoso
		// read the age and classify if the person is a child, teenager, adult or old
		
		int idade = 9;
		if (idade < 12) {
			String mensagem = String.format("Com %s anos, a pessoa é uma criança", idade);
			System.out.println(mensagem);
		} else if (idade > 12 && idade < 17){
			String mensagem = String.format("Com %s anos, a pessoa é adolescente", idade);
			System.out.println(mensagem);
		} else if (idade > 18 && idade < 60){
			String mensagem = String.format("Com %s anos, a pessoa é adulta", idade);
			System.out.println(mensagem);
		} else {
			String mensagem = String.format("Com %s anos, a pessoa é idosa", idade);
			System.out.println(mensagem);
		}
	} 

}
