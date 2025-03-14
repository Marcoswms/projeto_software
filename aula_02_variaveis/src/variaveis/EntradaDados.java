package variaveis;//Pacote onde se encontra cada este código

import java.util.Scanner;//Biblioteca para utilizar o Scanner

public class EntradaDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Instanciando para usar o Scanner
        String nome;

        System.out.println("Digite seu Nome: ");
        nome = scan.next();//next - armazena valores tipo String atraves do 'scan'
        System.out.println("Você digitou " + nome);

        System.out.println("Digite sua Idade: ");
        int idade = scan.nextInt();//nextInt - armazena valores tipo inteiro

        System.out.println("Digite sua Altura: ");
        double altura = scan.nextDouble();//nextDouble - armazzena valores tipo Double

        scan.close();
    }
}