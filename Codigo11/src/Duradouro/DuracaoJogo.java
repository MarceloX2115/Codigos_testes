package Duradouro;

import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hora inicial: ");
        int inicio = scanner.nextInt();
        System.out.println("Hora final: ");
        int fim = scanner.nextInt();
        
        int duracao;
        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        
        scanner.close();
    }
}