package Adivinha;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Gerador de numero entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        
        System.out.println("Tente adivinhar o número (1 a 100)!");
        
        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroAleatorio);
        
        scanner.close();
    }
}