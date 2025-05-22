package Negativando;
import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
        
        scanner.close();
    }
}