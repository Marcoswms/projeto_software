package exercicios;
/*
 *Desafio 01 - Conversão de Temperatura
 *Solicite ao usuário uma temperatura em Celsius (tipo double) e converta para Fahrenheit (F) e Kelvin(K).
 */

import java.util.Scanner;
import java.util.Locale;

public class ConvercaoTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        double kelvin = celsius + 273.15;

        System.out.printf(
                "A conversão de Celsius para Fahrenheit é: %.2f\nA conversão de Celsius para kelvin é: %.2f",
                fahrenheit, kelvin);
        scan.close();
    }
}