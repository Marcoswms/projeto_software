package application;

/* Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados. */

import java.util.Locale;
import java.util.Scanner;

public class MediaDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final int ENCERRAR = 0;

        double recebeNumero;
        double guardaNumero = 0.0;
        int contador = 0;

        do {
            System.out.println("Digite um número ou digite 0 para encerrar:");
            recebeNumero = scan.nextDouble();

            if (recebeNumero != ENCERRAR) {
                guardaNumero += recebeNumero;
                contador++;

            } else {
                System.out.printf("A média dos números informados é: %.2f", guardaNumero / contador);
            }
        } while (recebeNumero != ENCERRAR);
    }
}