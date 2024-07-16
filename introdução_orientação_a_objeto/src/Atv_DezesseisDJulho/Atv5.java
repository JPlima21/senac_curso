package Atv_DezesseisDJulho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		System.out.println("Digite o nome de 5 animais: ");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1)+ "°");
			String resp = sc.nextLine();
			list.add(resp);
			sc.close();
		}
		
		
		boolean contains = (list.contains("Cachorro") || list.contains("cachorro"));
		
		System.out.println("O elemento cachorro esta na lista: " + contains );
		
	}
}
