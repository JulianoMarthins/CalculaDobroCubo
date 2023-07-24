package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double num = scan.nextDouble();
		
		double dobro = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("Dobro: %.2f\nCubo: %.2f", dobro, cubo);
		
		scan.close();
	}

}
