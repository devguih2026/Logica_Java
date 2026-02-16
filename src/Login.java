import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String usuario = sc.next();

        System.out.print("Digite sua senha: ");
        String senha = sc.next();

        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Seja bem vindo(a)");
        } else {
            System.out.println("Usuário ou senha incorretos");
        }

        sc.close();
    }
}
