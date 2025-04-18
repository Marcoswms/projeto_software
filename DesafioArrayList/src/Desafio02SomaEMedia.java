import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*  02 - Soma e Média de Números
    . Crie uma lista de números inteiros.
    . Calcule a soma e a média de todos os números na lista. */

public class Desafio02SomaEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        double media = 0.0;
        List<Integer> listaDeNumeros = new ArrayList<>();

        while (true){
            System.out.println("Digite um número:");
            int recebeNumero = scan.nextInt();
            listaDeNumeros.add(recebeNumero);

            soma += recebeNumero;
            System.out.println("Cadastrar outro número? s/n");
            char acao = scan.next().charAt(0);
            if(acao == 'n'){
                break;
            }
            else if (acao == 's'){
                continue;
            }
            else System.out.println("Opção inválida. Ação cancelada!"); break;
        }
        media = soma / listaDeNumeros.size();
        System.out.println("Soma: " + soma + "\nMédia: " + media);
        scan.close();
    }
}