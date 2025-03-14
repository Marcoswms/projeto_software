import java.util.Scanner;

//Sistema de Login e Senha
//Limitar o número de tentativas em 5 chances.

// Comparar strings temos de usar o .equals(); pois o comparativo == é somente para tipos primitivos

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = "marcos";
        String senha = "marcos123";
        String validaLogin;
        String validaSenha;

        int TENTATIVAS = 5;
        int contaTentativas = 1;

        while (true) {
            System.out.println("Digite seu Login: ");
            validaLogin = scan.nextLine();

            System.out.println("Digite sua senha: ");
            validaSenha = scan.nextLine();

            if (validaLogin.equals(login) && validaSenha.equals(senha)) {
                System.out.println("Logado com sucesso!");
                break;
            } else if (contaTentativas >= TENTATIVAS) {
                System.out.println("Você excedeu o número de tentativas");
                break;
            } else {
                System.out.println("Acesso Negado!");
                System.out.println("Tentativas totais: 5!");
                System.out.printf("Numero de tentativas: %d%n%n", contaTentativas);
                contaTentativas++;
            }
        }
        scan.close();
    }
}