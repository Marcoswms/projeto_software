import java.util.Locale;
import java.util.Scanner;
import entidade.Roupa;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Roupa cliente;

        System.out.println("Bem vindo a sua loja online UMC/Marcos");
        System.out.println();
        System.out.println("Informe os dados de sua compra");

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
            System.out.println("Quantidade ou valor inválidos!\nInsira novamente");
            System.out.println("Quantidade: ");
            quantidade = scan.nextInt();
            scan.nextLine();

            System.out.println("Valor da Unidade: ");
            valor = scan.nextDouble();
            scan.nextLine();
        }

        cliente = new Roupa(marca, tipo, tamanho, quantidade, valor);

        System.out.println("Deseja adicionar ou remover a quantidade de unidades adquiridas?\nDigite: 1-Sim / 2-Não");
        String validacaoUnidade = scan.next();

        switch (validacaoUnidade){
            case "1":
                System.out.println("Informe: 1-Adicionar / 2-Remover");
                validacaoUnidade = scan.next();

                if (validacaoUnidade.equals("1")){
                    System.out.println("Informe a quantidade para adicionar:");
                    quantidade = scan.nextInt();
                    cliente.adicinaQuantidade(quantidade);
                }
                else {
                    System.out.println("Informe a quantidade para remover:");
                    quantidade = scan.nextInt();
                    cliente.removeQuantidade(quantidade);
                }
                break;
            case "2":
                System.out.println("Abaixo mostraremos o resumo de sua compra:");
                System.out.println();
                break;
            default:
                System.out.println("Informe uma alternativa válida");
                System.out.println();
                break;
        }

        System.out.println(cliente.toString());
        System.out.println();
        System.out.println("Obrigado!");

        scan.close();

    }
}