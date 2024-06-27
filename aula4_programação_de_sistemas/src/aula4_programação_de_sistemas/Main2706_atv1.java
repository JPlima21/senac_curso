package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		int rest = (num % 2);

		if (rest == 1) {
			System.out.println("O número que você digito é IMPAR");
		} else {
			System.out.println("O número que você digitou é PAR");
		}
		sc.close();
	}

}
