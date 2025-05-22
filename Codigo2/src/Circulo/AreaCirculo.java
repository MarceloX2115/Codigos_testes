package Circulo;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        
        double area = PI * raio * raio;
        System.out.printf("A=%.4f%n", area);
        
        scanner.close();
    }
}