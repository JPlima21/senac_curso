package aula8_programação_de_sistemas;

public class Main0307_atv10 {
//	public static void Minuscula(String mensagem) {
//		System.out.println(mensagem.toLowerCase());
//	}
	
	public static void identificarPrimo(int num) {
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
	
	public static void main(String[] args) {
		identificarPrimo(653);
	}
	
}
