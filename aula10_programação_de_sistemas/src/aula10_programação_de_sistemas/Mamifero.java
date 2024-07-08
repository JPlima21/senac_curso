package aula10_programação_de_sistemas;

public class Mamifero {

	String familia;
	String corPelagem;
	String nome;
	int idade;

	public Mamifero(String familia, String corPelagem, String nome, int idade) {
		this.familia = familia;
		this.corPelagem = corPelagem;
		this.nome = nome;
		this.idade = idade;
	}

	public void Andar() {
		System.out.println("Andando...");
	}

	public void Comer() {
		System.out.println();
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String especie) {
		this.familia = especie;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {

	}

}
