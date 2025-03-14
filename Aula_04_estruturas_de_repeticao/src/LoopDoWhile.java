//Jogo de adivinhação.

import java.util.Scanner;

public class LoopDoWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int usuario;
        int maquina = (int) (Math.random() * 10);
        System.out.println(maquina);

        do {
            System.out.println("Informe um número: ");
            usuario = scan.nextInt();

            if (usuario < maquina) {
                System.out.println("Número menor do que o número gerado.");
            } else {
                System.out.println("Número maior do que o número gerado.");
            }

        } while (usuario != maquina);
        System.out.println("Parabéns, você acertou!");

        scan.close();
    }
}