package Valor_pago;
import java.util.Scanner;

public class ValorPagar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Código, quantidade e valor da peça 1: ");
		int cod1 = scanner.nextInt();
		int qtd1 = scanner.nextInt();
		double valor1 = scanner.nextDouble();
		
		System.out.println("Codigo, quantidade e valor da peça 2: ");
		int cod2 = scanner.nextInt();
		int qtd2 = scanner.nextInt();
		double valor2 = scanner.nextDouble();
		
		double total = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		scanner.close();
	}

}
