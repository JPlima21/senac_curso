package aula8_programação_de_sistemas;

import java.util.Scanner;

public class Main0307_atv11 {
	//Questão 1
	public static void imprimirMil() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}
	
	public static void digiteDez() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int num = 0;
		
		while(i <= 9){
			System.out.println("Digite o " + (i+1) + "° valor");
			num = sc.nextInt();
			i++;
		}	
		sc.close();	
	}
	public static void apresentarFrase(int n) {
		int i = 0;
		while (i < n) {
			System.out.println("Hello word!");
			i++;
		}
	}
	
	public static void main(String[] args) {
		digiteDez();
		//apresentarFrase(10);
	}

}
