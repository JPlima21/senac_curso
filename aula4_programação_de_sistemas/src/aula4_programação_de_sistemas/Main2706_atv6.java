package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Valor é positivo");
		} else if (num == 0) {
			System.out.println("Valor é igual a 0");
		} else {
			System.out.println("Valor é negativo");
		}
		
		sc.close();
	}

}
