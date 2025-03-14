package exercicios;
/*
 *Desafio 03 – Média de Aluno
 *Faça um programa que leia três notas de um aluno e calcule a média final. Ao final, exiba a média formatada.
 *Exemplo de Saída: “A média final do aluno é 7.0”
 */

import java.util.Scanner;
import java.util.Locale;

public class MediaDeAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int quantidadeAlunos = 3;
        double soma = 0.0;
        double[] recebeNota = new double[quantidadeAlunos];

        for (int index = 0; index < quantidadeAlunos; index++) {
            System.out.printf("Informe a " + (index + 1) + "ª nota: ");
            recebeNota[index] = scan.nextDouble();
        }

        for (int index = 0; index < quantidadeAlunos; index++) {
            soma += recebeNota[index];
        }
        double media = soma / quantidadeAlunos;
        System.out.printf("\nA média final do aluno é %.2f", media);
        scan.close();
    }
}