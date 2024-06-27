package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = sc.nextInt();
		
		if (10 <= num && num <= 30) {
			System.out.println("O valor que você digito esta entre os valores 10 e 30");
		} else {
			System.out.println("O valor que você digito NÃO esta entre os valores 10 e 30");
		}
		sc.close();
	}

}
