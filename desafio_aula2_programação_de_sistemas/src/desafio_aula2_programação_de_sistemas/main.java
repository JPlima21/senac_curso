package desafio_aula2_programação_de_sistemas;

import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		
		int result = (num1 + num2);
		
		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + result );
	}

}
