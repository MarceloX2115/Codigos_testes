package Lanchinho;

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código e quantidade: ");
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        
        double total;
        switch (codigo) {
            case 1: total = quantidade * 4.00; break;
            case 2: total = quantidade * 4.50; break;
            case 3: total = quantidade * 5.00; break;
            case 4: total = quantidade * 2.00; break;
            case 5: total = quantidade * 1.50; break;
            default: total = 0;
        }
        
        System.out.printf("Total: R$ %.2f%n", total);
        
        scanner.close();
    }
}