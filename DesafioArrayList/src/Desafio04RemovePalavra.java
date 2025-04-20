import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 04 - Remove Palavras que Contêm um Caracter Específico
    . Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.

 * Saída:
    . Palavras originais: [Banana, Maçã, Abacate, Manga]
    . Removendo palavras que contêm “a": []
*/

public class Desafio04RemovePalavra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> listaDePalavras = new ArrayList<>();

        while (true){
            System.out.println("Digite uma Palavra:");
            String recebePalavra = scan.next().toLowerCase();
            listaDePalavras.add(recebePalavra);

            System.out.println("Cadastrar outra Palavra? s/n");
            char acao = scan.next().toLowerCase().charAt(0);
            if(acao == 'n'){
                break;
            }
            else if (acao == 's'){
                continue;
            }
            else System.out.println("Opção inválida. Ação cancelada!"); break;
        }
        System.out.println("Escolha a letra:");
        char letra = scan.next().toLowerCase().charAt(0);
        CharSequence removeLetra = String.valueOf(letra);
        System.out.println("Palavras originais: " + listaDePalavras);

        listaDePalavras.removeIf(lista -> lista.contains(removeLetra));//Expressão Lambda para remover 'Se condiçao = true'
        System.out.printf("\nRemovendo palavras que contêm a letra '%c': %s",  letra, listaDePalavras);

        scan.close();
/*  PS: . Usei uma espécie de 'Casting' para converter 'letra' em CharSequence para utilizar o método 'contains()'
        . contains() - verifica se há uma Sequência de caracteres em uma String. */
    }
}