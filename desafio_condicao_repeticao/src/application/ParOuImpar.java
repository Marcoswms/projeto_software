package application;

/* Solicite números ao usuário, informando se são pares ou ímpares, e acumule as somas de números pares
   e de números impares.
 * O programa encerra ao receber 0, exibindo as somas totais de pares e ímpares. */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int ENCERRAR = 0;

        int recebeNumero = 0;
        int pares = 0;
        int impares = 0;

        while (true) {
            System.out.println("Digite um número ou digite 0 para encerrar:");
            recebeNumero = scan.nextInt();

            double validaPar = recebeNumero % 2;

            if (validaPar == 0) {
                pares += recebeNumero;
            } else impares += recebeNumero;

            if (recebeNumero == ENCERRAR) {
                System.out.printf("%nSoma dos Pares = %d%nSoma dos Impares = %d", pares, impares);
                break;
            }
        }
    }
}