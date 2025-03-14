package exercicios;
/*
 *Crie um programa que leia o raio de um círculo e calcule a Área e o Perímetro.
 *Utilize a biblioteca Math para o valor de 'PI'.
 */

import java.util.Locale;
import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de raio: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área: %.2f\nPerímetro: %.2f", area, perimetro);
        scan.close();
    }
}