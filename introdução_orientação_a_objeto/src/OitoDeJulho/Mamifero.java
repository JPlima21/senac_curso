package OitoDeJulho;

import java.util.Set;

public class Mamifero {
	
	String nome;
	double altura;
	int idade;
	
	public Mamifero(String nome, double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void apresentarNomeAnimal() {
		System.out.println(getNome());
	}
	
	public int clasificandoAnimal(int opc) {
		if (opc == 0) {
			System.out.println("Pequeno porte");
			return 0;
		} else if (opc == 1) {
			System.out.println("Médio porte");
			return 1;
		}else {
			System.out.println("Grande porte");
			return 2;
		}
		
	}
	
	public int classificandoAnimalPorIdade(int idade) {
		if (idade <= 20) {
			System.out.println("Animal novo");
			return 0;
		} else {
			System.out.println("Animal velho");
			return 1;
		}
	}
}
