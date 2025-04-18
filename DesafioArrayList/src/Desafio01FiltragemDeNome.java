import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 01 - Lista com Nomes e Filtragem Personalizada
    . Crie uma lista de nomes e filtre os que começam com uma letra específica.
    . Exiba quantos nomes foram encontrados.

 * PS: Deixei a lógica com 'for' comentada, pois é a que consicero mais prática, porém reestruturei o código com 'while'
       visando que, o interessante de uma List é não ter um tamanho pré definido.
*/

public class Desafio01FiltragemDeNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int totalDeNomes = 0;
        List<String> listaNomes = new ArrayList<>();

        System.out.println("Adicione nomes a sua lista:");
        while (true){
            cont ++;
            System.out.println("Adicione o " + cont + "º nome:");
            String nome = scan.next().toLowerCase();
            listaNomes.add(nome);

            System.out.println("Deseja adicionar mais nomes? s/n");
            char validacao = scan.next().toLowerCase().charAt(0);

            if (validacao == 'n'){
                break;
            }
            else if (validacao == 's'){
                continue;
            }
            else System.out.println("\nOpção inválida!"); break;
        }
//        System.out.println("\nInforme quantos nomes deseja armazenar em sua lista:");
//        int tamanhoLista = scan.nextInt();
//        scan.nextLine();
//
//        for (int index = 0; index < tamanhoLista; index++){
//            System.out.println("Adicione o " + (index + 1) + "º nome:");
//            String nome = scan.next().toLowerCase();
//
//            listaNomes.add(nome);
//        }
        System.out.println("\nDigite a letra inicial para buscar:");
        String buscaLetraInicial = scan.next().toLowerCase();

        System.out.println("Exibindo nomes com a letra: " + buscaLetraInicial);
        for(String nomes : listaNomes){
            if (nomes.startsWith(buscaLetraInicial)){
                System.out.println(nomes);
                totalDeNomes ++;
            }
        }
        System.out.println("Total de Nomes: " + totalDeNomes);
        scan.close();
    }
}