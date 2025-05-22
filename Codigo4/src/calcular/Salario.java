package calcular;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Número do funcionário: ");
		int numero = scanner.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		int horas = scanner.nextInt();
		
		System.out.println("Valor por hora: ");
		double valorHora = scanner.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.printf("Numero = %d%nSalario = U$ %.2f%n", numero, salario);
		
		scanner.close();
	}

}
