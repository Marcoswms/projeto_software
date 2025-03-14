import java.util.Scanner;

public class Compras {

    public static void main(String[] args) {
        //Maquina de Cartão

        //Capturar o valor de uma compra e metodo de pagamento

        // 1 - Dinheiro/Pix - 10% de desconto
        // 2 - Debito - 5% de desconto
        // 3 - Credito

        //	- Metodos de Parcelamento
        //		- A vista = Valor total
        //		- 2x - 5% de juros
        //		- 3x - 10% de juros

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da sua compra R$ ");
        double valorCompra = sc.nextDouble();

        System.out.println("Metodo Pagamento");
        System.out.println("1 - Dinheiro/Pix");
        System.out.println("2 - Debito");
        System.out.println("3 - Credito");
        int metodoPagamento = sc.nextInt();

        switch (metodoPagamento) {

            case 1:
                double valorFinal = valorCompra * 0.9;
                System.out.println("O valor da sua compra ficou R$ " + valorFinal);
                break;
            case 2:
                valorFinal = valorCompra * 0.95;
                System.out.println("O valor da sua compra ficou R$ " + valorFinal);
                break;
            case 3:
                System.out.println("Metodo Parcelamento");
                System.out.println("1 - A vista");
                System.out.println("2 - 2x + 5% de juros");
                System.out.println("3 - 3x + 10% de juros");
                int metodoParcelamento = sc.nextInt();

                switch (metodoParcelamento) {
                    case 1:
                        System.out.println("O valor da sua compra ficou R$ " + valorCompra);
                        break;
                    case 2:
                        valorFinal = valorCompra * 1.05;
                        System.out.println("O valor da sua compra ficou R$ " + valorFinal);
                        break;
                    case 3:
                        valorFinal = valorCompra * 1.1;
                        System.out.printf("O valor da sua compra ficou R$ %.2f %n", valorFinal);
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        sc.close();
    }
}