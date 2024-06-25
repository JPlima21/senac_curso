package aula2_programação_de_sistemas;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // ler uma linha de texto
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        // imprimir na tela
        System.out.println("Nome:" + nome);
        
        // fecha scanner
        scanner.close();
	}

}
