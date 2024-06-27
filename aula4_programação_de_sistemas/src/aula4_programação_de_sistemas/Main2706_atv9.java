package aula4_programação_de_sistemas;

import java.util.Scanner;

public class Main2706_atv9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua temperatura: ");
		double temperature = sc.nextDouble();
		
		if (temperature < 37.7) {
			System.out.println("Temperatura abaixo do normal");
		} else if(temperature == 37.7) {
			System.out.println("Temperatura normal");
		} else {
			System.out.println("Temperatua acima do normal, você esta com febre");
		}

	}

}
