package aula10_programação_de_sistemas;

public class Pessoa {

	String nome;
	int idade;
	double altura;
	double peso;

	public Pessoa(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;

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
	
	
	
	
	public double apresentarSalario(double salario) {
		double salariofinal = salario - (salario * 0.27);
		System.out.println("O salario é " + salariofinal);
		return salariofinal;
	}

	public static void main(String[] args) {
		Pessoa eduardo = new Pessoa("Eduardo", 18, 1.75, 68.4);
		System.out.println(eduardo.nome);
		eduardo.setNome("Eduardo Saverim");
		System.out.println(eduardo.getNome());
	}

}
