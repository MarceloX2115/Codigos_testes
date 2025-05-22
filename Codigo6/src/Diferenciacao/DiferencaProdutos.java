package Diferenciacao;
import java.util.Scanner;

public class DiferencaProdutos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite A,B,C e D: ");
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c = scanner.nextInt();
		int d= scanner.nextInt();
		
		int diferenca = (a*b) - (c * d);
		System.out.println("Diferença = " + diferenca);
		
		scanner.close();
	}

}
