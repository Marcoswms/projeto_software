package exercicios;
/*
 *Desafio 02 - Calculando Juros Compostos
 *Implemente um programa que solicite o capital inicial, a taxa de juros (em % ao mês) e o número de meses.
 *Calcule e exiba o montante total com base na fórmula de juros compostos.
 */

import java.util.Scanner;
import java.util.Locale;

public class JurosCompostos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o capital inicial: ");
        double capitalInicial = scan.nextDouble();

        System.out.println("Informe a taxa de juros: ");
        double taxaDejuros = scan.nextDouble();

        System.out.println("Informe o número de meses: ");
        int tempoEmMeses = scan.nextInt();

        double potencia = Math.pow((taxaDejuros + 1), tempoEmMeses);
        double montanteTotal = capitalInicial * potencia;

        System.out.printf("\nMontante Total com base na formula de juros compostos: %.2f", montanteTotal);
        scan.close();
    }
}