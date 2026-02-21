import java.util.Scanner;

public class imposto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();

        double taxa;

        if (salario <= 2000) {
            taxa = 0;
        } else if (salario <= 3000) {
            taxa = 0.08;
        } else if (salario <= 4500) {
            taxa = 0.18;
        } else {
            taxa = 0.28;
        }

        double imposto = salario * taxa;
        double liquido = salario - imposto;

        System.out.printf("Salário: %.2f | Imposto: %.2f | Líquido: %.2f%n",
                salario, imposto, liquido);

        sc.close();
    }
}
