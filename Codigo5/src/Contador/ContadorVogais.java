package Contador;
import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra/frase: ");
        String texto = scanner.nextLine().toLowerCase();
        
        int vogais = 0;
        
        // Percorre cada caractere e verifica se é uma vogal
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }
        
        System.out.println("Total de vogais: " + vogais);
        scanner.close();
    }
}