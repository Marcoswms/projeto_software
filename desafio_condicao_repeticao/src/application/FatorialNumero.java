package application;

/* Peça ao usuário um número inteiro positivo e, usando um for, calcule o fatorial desse número */

import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro e maior que 0:");
        int entradaNumero = scan.nextInt();

        while (entradaNumero < 0){
            System.out.println("Número deve ser maior que 0.\nTente novamente: ");
            entradaNumero = scan.nextInt();
        }

        int decrementaNumero = entradaNumero - 1;
        int fatorial = entradaNumero;

        for (int index = decrementaNumero; index > 0; index--) {
            fatorial *= index;
        }
        System.out.printf("O fatorial de %d é igual a: %d", entradaNumero, fatorial);
    }
}