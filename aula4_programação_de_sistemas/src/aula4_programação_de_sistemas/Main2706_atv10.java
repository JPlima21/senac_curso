package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor entre [A, B, C e D]: ");
		String valor = sc.nextLine();
		
		System.out.println(valor);
		
		if (valor.contains("A") || valor.contains("a")) {
			System.out.println("Excelente");
		} else if(valor.contains("B") || valor.contains("b")) {
			System.out.println("Bom");
		} else if(valor.contains("C") || valor.contains("c")) {
			System.out.println("Regular");
		} else if(valor.contains("D") || valor.contains("d")) {
			System.out.println("Ruim");
		} else {
			System.out.println("Valor invalido!");
		}
		
		sc.close();
	}

}
