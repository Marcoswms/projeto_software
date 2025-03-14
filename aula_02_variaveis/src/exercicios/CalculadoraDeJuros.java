package exercicios;
/*
 *Desafio 04 - Calculadora de Juros Simples
 *Crie um programa que leia o capital inicial, a taxa de juros mensal (%) e o tempo (em meses).
 *Calcule os juros simples e mostre os valores dos juros e do montante total ao final do período.
 */

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraDeJuros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o capital inicial: ");
        double capitalInicial = scan.nextDouble();

        System.out.println("Informe a taxa de juros: ");
        double taxaDejuros = scan.nextDouble();

        System.out.println("Informe o número de meses: ");
        int tempoEmMeses = scan.nextInt();

        double valorDoJuros = capitalInicial * taxaDejuros * tempoEmMeses;
        double potencia = Math.pow((taxaDejuros + 1), tempoEmMeses);
        double montanteTotal = capitalInicial * potencia;

        System.out.printf("Valor do Juros: %.2f.\nMontante Total: %.2f", valorDoJuros, montanteTotal);
        scan.close();
    }
}