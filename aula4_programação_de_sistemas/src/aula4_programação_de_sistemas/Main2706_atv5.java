package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media = 6;
		
		System.out.println("Digite a primeria nota: ");
		double nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextInt();
		
		System.out.println("Digite a terceria nota: ");
		double nota3 = sc.nextInt();
		
		double calculo = ((nota1 + nota2 + nota3)/3);
		
		if (calculo < media) {
			System.out.println("A média do aluno foi de " + calculo + " esta abaixo da média esta de RECUPERAÇÃO!");
		} else if(calculo == media) {
			System.out.println("A média do aluno foi de " + calculo + " esta na média");
		} else {
			System.out.println("O média do aluno foi de " + calculo + " esta acima da média esta APROVADO!" );
		}
		sc.close();

	}

}
