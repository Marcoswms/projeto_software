import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        //Operadores Logicos
        // and - &&
        // or - ||
        // not - !

        //Login e Senha

        Scanner sc = new Scanner(System.in);

        String loginSalvo = "pedromiho";
        String senhaSalva = "1234";

        System.out.print("Digite o seu login: ");
        String login = sc.nextLine();
        System.out.print("Digite a sua senha: ");
        String senha = sc.nextLine();

        //Na comparacao de String utilizamos o equals()

        if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
            System.out.println("Acesso liberado");
        }
        else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}