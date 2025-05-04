import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();

        // Adicionando nomes na ultima posição da lista:
        listaNomes.add("Marcos");
        listaNomes.add("Willian");
        listaNomes.add("Silveira");

        // Adicionando nomes na posição desejada da lista:
        listaNomes.add(2, "Manoel");
        listaNomes.add(3, "Da");

        // Verificar o tamanho do Array:
        System.out.println("Tamanho do Array: " + listaNomes.size());
        System.out.println();

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Printar uma posição específica do Array:
        System.out.println("\nPosição 2: " + listaNomes.get(2));

        // Remover itens do Array:
        //listaNomes.remove(3);
        listaNomes.remove("Da");//Removendo pelo nome.

        // Identificando a posição de um elemento
        System.out.println(listaNomes.lastIndexOf("Silveira"));

    }
}