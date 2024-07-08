package aula8_programação_de_sistemas;

public class Main0307 {
	public static void calcularFatorial(int num) {
		int result = 1;
		while(num > 0) {
			System.out.print(num);
			System.out.print((num > 1)? " x " : " = " );
			result *= num;
			num -= 1;
		}
		System.out.println(result);	
	}
	
	
	
	public static void main(String[] args) {
		calcularFatorial(5);

	}

}
