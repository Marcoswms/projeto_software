import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos itens deseja inserir?");
        int tamanhoVetor = scan.nextInt();
        scan.nextLine();
        double[] notasAlunos = new double[tamanhoVetor];

        for(int index = 0; index < notasAlunos.length; index++) {
            System.out.println("Digite uma nota entre 0,0 a 10,0:");
            double nota = scan.nextDouble();

            while(notasAlunos[index] < 0.0 || notasAlunos[index] > 10.0){
                System.out.println("Nota Inválida!");
                nota = scan.nextDouble();
            }
            notasAlunos[index] = nota;
        }
        for (double nota : notasAlunos) {
            System.out.println(nota);
        }
        scan.close();
    }
}