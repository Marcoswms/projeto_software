package application;

/* Crie um programa em Java que simula um jogo de adivinhação.
  . A máquina irá gerar um número inteiro aleatório entre 1 e 10.
  . O jogador terá UMA tentativa para adivinhar o número.
  . O programa deverá exibir mensagens indicando se o jogador acertou ou errou. */

import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maquina = (int) (Math.random() * 10);
        int jogador;

        System.out.println(maquina);

        System.out.println("Informe um número: ");
        jogador = scan.nextInt();

        if (jogador < maquina) {
            System.out.println("Número menor do que o número gerado.\nVocê Perdeu !");
        } else if (jogador > maquina) {
            System.out.println("Número maior do que o número gerado.\nVocê Perdeu !");
        } else {
            System.out.println("Parabéns, você acertou!");
        }
        scan.close();
    }
}