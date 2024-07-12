package OitoDeJulho;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("DIgite os dados:");
			System.out.print("Nome:");
			String p_nome = sc.nextLine();
			System.out.print("Idade:");
			int p_idade = sc.nextInt();
			System.out.print("Altura:");
			double p_altura = sc.nextDouble();
			System.out.print("Peso:");
			double p_peso = sc.nextDouble();
			System.out.print("CPF:");
			int p_cpf = sc.nextInt();
			Pessoa registro = new Pessoa(p_nome, p_idade, p_altura, p_peso, p_cpf);
			
			System.out.println("=====================================");
			System.out.print("Os dados estão corretos? ");
			String resp = sc.nextLine();
			
			if (resp.contains("S") || resp.contains("s")) {
				registro.apresentarDados();
				System.out.println("Registrado com sucesso!");
				break;
			} else if (resp.contains("N") || resp.contains("n")) {
				
			}else {
				System.out.println("Resposta invalida!");
			}
			
		}
	sc.close();
	}

}
