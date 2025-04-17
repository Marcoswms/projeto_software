import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidade.Roupa;

/* Desafio - Gerenciamento de Estoque de Roupas
   . Criar um programa para gerenciar o estoque de roupas de uma loja.
   . O objetivo é registrar informações das roupas, adicionar ou remover peças do estoque e exibir os dados atualizados.

 * Requisitos Classe - Roupa:

 - A classe deve ter os seguintes atributos:
   . marca (String): Marca da roupa.
   . tipo (String): Tipo da roupa (ex.: camisa, calça, vestido).
   . tamanho (String): Tamanho da roupa (ex.: P, M, G).
   . quantidade (int): Quantidade em estoque.
   . valor (double) : Valor da peça.
 - Adicione um método que retorna o valor total do estoque (quantidade * valor).
 - Adicione um método para incrementar a quantidade no estoque.
 - Adicione um método para decrementar a quantidade no estoque, garantindo que não seja possível remover mais
   peças do que o disponível.
 - Crie o Projeto de Classe (UML).

 * Requisitos Programa Executável - Main:
   . Permita que o usuário registre uma nova roupa, informando a marca, o tipo, o tamanho, a quantidade inicial
     e o valor unitário.
   . Permita adicionar ou remover peças do estoque.
   . Exiba as informações atualizadas da roupa após cada operação, incluindo o valor total.
   . Permita registrar várias roupas e exibir todas as informações no final. */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Boolean novaCompra = true;
        List<Roupa> listaClientes = new ArrayList<>();
        Roupa cliente;

        System.out.println("\nBem vindo a sua loja online UMC/Marcos");

        do {
            System.out.println("\nInforme os dados de sua compra");

            System.out.println("Marca: ");
            String marca = scan.next();
            System.out.println("Tipo: ");
            String tipo = scan.next();
            System.out.println("Tamanho: ");
            String tamanho = scan.next();
            System.out.println("Quantidade: ");
            int quantidade = scan.nextInt();
            scan.nextLine();
            System.out.println("Valor da Unidade: ");
            double valor = scan.nextDouble();
            scan.nextLine();

            while(quantidade <= 0 || valor <= 0.0){
                System.out.println("\nQuantidade ou valor inválidos!\nInsira novamente");
                System.out.println("Quantidade: ");
                quantidade = scan.nextInt();
                scan.nextLine();

                System.out.println("Valor da Unidade: ");
                valor = scan.nextDouble();
                scan.nextLine();
            }

            cliente = new Roupa(marca, tipo, tamanho, quantidade, valor);

            System.out.println("Deseja alterar quantidade de unidades adquiridas?\nDigite: 1-Alterar / 2-Visualizar compra");
            String validacaoAcao = scan.next();

            switch (validacaoAcao){
                case "1":
                    System.out.println("Informe: 1-Adicionar / 2-Remover");
                    String validacaoUnidade = scan.next();

                    switch (validacaoUnidade){
                        case "1":
                            System.out.println("Informe a quantidade para adicionar:");
                            quantidade = scan.nextInt();
                            cliente.adicinaQuantidade(quantidade);
                            break;
                        case "2":
                            System.out.println("Informe a quantidade para remover:");
                            quantidade = scan.nextInt();
                            cliente.removeQuantidade(quantidade);
                            break;
                        default:
                            System.out.println("\nAlternativa Inválida.");
                            break;
                    }
                    break;
                case "2":
                    break;
                default:
                    System.out.println("\nAlternativa Inválida");
                    validacaoAcao = scan.next();
                    break;
            }

            cliente.valorTotal();
            System.out.println("\nResumo da compra:\n" + cliente);
            listaClientes.add(cliente);

            System.out.println("\nDeseja continuar comprando? 1-Sim / 2-Não");
            String validacaoCompra = scan.next();

            switch (validacaoCompra){
                case "1":
                    System.out.println("\nNova Compra:");
                    break;
                case "2":
                    novaCompra = false;
                    break;
                default:
                    System.out.println("\nAlternativa Inválida");
                    validacaoCompra = scan.next();
                    break;
            }

        }while(novaCompra.equals(true));

        System.out.println("\nDados da compra: ");
        for(Roupa lista : listaClientes){
            System.out.println(lista+ "\n");
        }
        System.out.println("Obrigado!");
        scan.close();
    }
}