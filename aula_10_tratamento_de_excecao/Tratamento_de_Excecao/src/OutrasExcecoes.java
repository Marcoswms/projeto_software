import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OutrasExcecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        try {
//            Class.forName("Carro");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Classe não encontrada");
//        }

        try {
            File file = new File("arquivo.txt");//File - Para leitura de arquivos, neste caso o arquivo não existe.
            FileReader leitura = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e){
            System.out.println("Arquivo corrompido!");
        }finally {
            System.out.println("Programa Finalizado");//finally - exibe uma mensagem de encerramento de um bloco de código.
        }
        scan.close();
    }
}