package application;

/* Elabore um programa que peça ao usuário para informar o valor de um empréstimo e o número de parcelas desejadas:
  • Número de Parcelas: 6, 12 ou 24 meses.

 * Use uma estrutura switch para calcular o valor final, considerando as taxas:
  • 6 meses: +5% do valor total.
  • 12 meses: +10% do valor total.
  • 24 meses: +20% do valor total.
 * Mostre o valor total a ser pago com base na escolha. */

import java.util.Locale;
import java.util.Scanner;

public class TaxaDeEmpestimo {
    public static void main(String[] args) {

        final double PARCELA_06_MESES = 0.05;
        final double PARCELA_12_MESES = 0.10;
        final double PARCELA_24_MESES = 0.20;

        double valorFinal = 0.0;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do empréstimo desejado:");
        double valorEmprestimo = scan.nextDouble();

        System.out.println("##########################");
        System.out.println("Parcelas disponíves:\n- 6 Meses\n- 12 Meses\n- 24 Meses");
        System.out.println("##########################");
        System.out.println("Escolha o número de parcelas desejadas:");
        int quantidadeDeParcelas = scan.nextInt();

        switch (quantidadeDeParcelas) {
            case 6:
                valorFinal = (valorEmprestimo * PARCELA_06_MESES) * quantidadeDeParcelas +valorEmprestimo;
                break;
            case 12:
                valorFinal = (valorEmprestimo * PARCELA_12_MESES) * quantidadeDeParcelas +valorEmprestimo;
                break;
            case 24:
                valorFinal = (valorEmprestimo * PARCELA_24_MESES) * quantidadeDeParcelas +valorEmprestimo;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        System.out.printf("O valor total a ser pago será: %.3f", valorFinal);
    }
}