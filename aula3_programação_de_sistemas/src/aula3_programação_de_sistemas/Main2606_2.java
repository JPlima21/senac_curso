package aula3_programação_de_sistemas;

import java.util.Scanner;

public class Main2606_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println("O maior valor é " + num2);
		} else {
			System.out.println("O maior valor é " + num1);
		}
		sc.close();

	}

}
