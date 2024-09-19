import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		if (calculaFibonacci(numero)) {
			System.out.println("O número " + numero + " faz parte da sequência de Fibonacci");
		} else {
			System.out.println("O número " + numero + " não faz parte da sequência de Fibonacci");
		}
	}

	public static boolean calculaFibonacci(int num) {
		int a = 0, b = 1, c = 0;

		for (c = 0; c < num;) {
			c = a + b;
			a = b;
			b = c;
		}
		return c == num;
	}
}