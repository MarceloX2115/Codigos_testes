package Muitos;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite A e B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
        scanner.close();
    }
}