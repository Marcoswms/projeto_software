import java.util.Scanner;

//Tabuada

public class LoopFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        int finaltabuada = 10;

        for (int index = 1; index <= finaltabuada; index++) {
            System.out.println(numero + " * " + index + " = " + numero * index);
        }
        scan.close();
    }
}