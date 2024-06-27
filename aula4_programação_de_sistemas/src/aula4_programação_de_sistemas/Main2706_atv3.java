package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media = 7;
		
		System.out.println("Digite a primerio valor: ");
		double nota1 = sc.nextInt();
		
		System.out.println("Digite a segundo valor: ");
		double nota2 = sc.nextInt();
		
		System.out.println("Digite a tercerio valor: ");
		double nota3 = sc.nextInt();
		
		double calculo = ((nota1 + nota2 + nota3)/3);
		
		if (calculo < media) {
			System.out.println("A média dos valores foi de " + calculo + " esta abaixo da média");
		} else if(calculo == media) {
			System.out.println("A média dos valores foi de " + calculo + " esta na média");
		} else {
			System.out.println("O média dos valores foi de " + calculo + " esta acima da Média" );
		}
		sc.close();
	}

}
