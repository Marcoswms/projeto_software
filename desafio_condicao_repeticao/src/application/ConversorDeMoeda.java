package application;

/* Desenvolva um programa que peça ao usuário um valor em reais e a moeda para a qual deseja converter:
   • 1 - Dólar (R$ 1 = US$ 0.20).
   • 2 - Euro (R$ 1 = € 0.18).
   • 3 - Libra (R$ 1 = £ 0.15).
* Use switch para calcular e mostrar o valor convertido. */

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        final double VALOR_DOLAR = 0.20;
        final double VALOR_EURO = 0.18;
        final double VALOR_LIBRAS = 0.15;

        double valorConvertido = 0.0;

        System.out.println("Informe um valor em Reais: ");
        double valorEmReais = scan.nextDouble();
        System.out.println("################################");
        System.out.printf("1 - Dólar%n2 - Euro%n3 - Libra%n");
        System.out.println("Escolha para qual moeda deseja a conversão: ");
        String escolheMoeda = scan.next();

        switch (escolheMoeda) {
            case "1":
                valorConvertido = valorEmReais * VALOR_DOLAR;
                System.out.printf("%nValor convertido: US$ %.2f", valorConvertido);
                break;
            case "2":
                valorConvertido = valorEmReais * VALOR_EURO;
                System.out.printf("%nValor convertido: € %.2f", valorConvertido);
                break;
            case "3":
                valorConvertido = valorEmReais * VALOR_LIBRAS;
                System.out.printf("%nValor convertido: £ %.2f", valorConvertido);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scan.close();
    }
}