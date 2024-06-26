package aula3_programação_de_sistemas;

import java.util.*;

public class Main2606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Entrada de informações
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		// Verificação da idade
		if (idade > 15 && idade < 18 || idade > 70) {
			System.out.println("O voto é opicional.");
		} else {
			if (idade < 15) {
				System.out.println("Você ainda não pode votar.");
			} else {
				System.out.println("Você é OBRIGADO a votar.");
			}
		}

		sc.close();

	}
}
