import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 03 - Verificar Elementos Duplicados
   . Crie uma lista de números e descubra quais números são pares.
   . Crie uma nova lista somente com os números pares.

 * Saída:
   . Lista de números: [10, 20, 5, 6, 9, 5]
   . Lista de números: [10, 20, 5, 6, 9, 5] */

public class Desafio03ElementoDuplicado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> listaDeNumeros = new ArrayList<>();
        List<Integer> listaDeNumerosPares = new ArrayList<>();


        System.out.println("Criando uma lista de números inteiros:\n");
        while (true){
            System.out.println("Digite um número:");
            int recebeNumero = scan.nextInt();
            listaDeNumeros.add(recebeNumero);
            if (recebeNumero % 2 == 0){
                listaDeNumerosPares.add(recebeNumero);
            }
            System.out.println("Cadastrar outro número? s/n");
            char acao = scan.next().toLowerCase().charAt(0);
            if(acao == 'n'){
                break;
            }
            else if (acao == 's'){
                continue;
            }
            else System.out.println("Opção inválida. Ação cancelada!"); break;
        }
        System.out.println("Números cadastrados: " + listaDeNumeros);
        System.out.println("Números Pares: " + listaDeNumerosPares);

     /* Praticando retorno com expressão Lambda:

        listaDeNumeros.forEach(numero -> System.out.println("Número cadastrado: " + numero));
        listaDeNumerosPares.forEach(numerosPares -> System.out.println("Número Par: " + numerosPares)); */
    }
}


