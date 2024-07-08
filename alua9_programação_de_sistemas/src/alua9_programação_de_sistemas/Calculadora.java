package alua9_programação_de_sistemas;

import java.util.Scanner;

public class Calculadora {
	public void identificarPrimo(int num) {
		int div = 0;
		for (int i = 0; num > i; i++) {
			if (num % (i + 1) == 0) {
				div += 1;
			}
		}if (div == 2) {
			System.out.println("O número " + num + " é um número primo");
		}else {
			System.out.println("O número " + num + " não é um número primo");
		}
	}
	
	public void calcularFatorial(int num) {
		int result = 1;
		while(num > 0) {
			System.out.print(num);
			System.out.print((num > 1)? " x " : " = " );
			result *= num;
			num -= 1;
		}
		System.out.println(result);	
	}
	
	public void mostraValorPar(int n) {
		for (int i = n; i > 0; i-- ) {
			if (i % 2 == 0) {
				System.out.println("Número par: " + i);
			}
		}
	}
	
	public void mostraValorImpar(int n) {
		for (int i = n; i > 0; i++ ) {
			if (i % 2 == 1) {
				System.out.println("Número Impar: " + i);
			}
		}
	}
	
	public void imprimirMil() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}
	
	public void multiplicacaoInterativa() {
		Scanner scanner = new Scanner(System.in);
        double mult = 1; 
        double valor;
        boolean primeiroNumero = true;
        do {
            System.out.print("Digite um número: ");
            valor = scanner.nextDouble();

            if (valor != 0) {
                mult = mult * valor;
                primeiroNumero = false;
            } else if (primeiroNumero) {
                mult = 0;
            }
        } while (valor != 0);
        System.out.println("A multiplicação é: " + mult);
        scanner.close();
    }
	
	public static void main(String[] args) {
		

	}

}
