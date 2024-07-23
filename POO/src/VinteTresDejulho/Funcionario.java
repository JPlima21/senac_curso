package VinteTresDejulho;

public class Funcionario {
	String nome;
	double salario;
	Integer matricula;
	double peso;
	int idade;
	
	public Funcionario(String nome, double salario, Integer matricula, double peso, int idade) {
		this.nome = nome;
		this.salario = salario;
		this.matricula = matricula;
		this.peso = peso;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", matricula=" + matricula + ", peso=" + peso
				+ ", idade=" + idade + "]";
	}
	
	public double calcularSalario(double imposto, double gratificacao) {
		double salarioLiquido = (getSalario() + gratificacao) - imposto;
		System.out.println("Salario final é ");
		return salarioLiquido;
	}

}
