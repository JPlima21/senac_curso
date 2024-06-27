package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();

		System.out.println("Digite um número: ");
		int num2 = sc.nextInt();

		int media = ((num1 + num2) / 2);

		System.out.println("A média entre " + num1 + " e " + num2 + " é igual a " + media);

		sc.close();
	}

}
