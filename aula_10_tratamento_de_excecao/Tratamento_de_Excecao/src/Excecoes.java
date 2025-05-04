import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          //try - tentativa
//        try {
//            System.out.println("Digite um número:");
//            int numero = scan.nextInt();
//            System.out.println("O número digitado foi: " + numero);
//
            //Esse 'e' recebe a informação do erro para acessarmos futuramente
//        } catch(InputMismatchException e) {
//            e.printStackTrace();// Printa o erro gerado e mostra onde está este erro.
//            System.out.println("Valor inválido, inserir apenas números!");
//        }

//        try{
//            int[] array = new int[5];
//            System.out.println(array[10]);
//
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("O erro encontrado foi " + e.getMessage());//e.getMessage() mostra qual foi o erro.
//        }

//        try{
//            int resultado = 10 /0;
//            System.out.println(resultado);
//        }catch(ArithmeticException e){
//            System.out.println("Erro: "+e.getMessage());
//        }

        try{
            int numero01 = scan.nextInt();
            int numero02 = scan.nextInt();
            double resultado = scan.nextDouble();
            System.out.println(resultado);
        }catch(Exception e){ //Exception geral para qualquer tipo de erro, ou poderá fazer mais de um catch.
            System.out.println("Erro: "+ e.getMessage());
        }
        scan.close();
    }
}