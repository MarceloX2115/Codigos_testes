package Teste1;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é par ou ímpar usando o operador %
        if (numero % 2 == 0) {
            System.out.println(numero + " é PAR!");
        } else {
            System.out.println(numero + " é ÍMPAR!");
        }
        
        scanner.close();
    }
}