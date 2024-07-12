package Atv6_classFuncionario;

public class Funcionario {
	
	String nome;
	int idade;
	double altura;
	String endereco;
	double salario;
	
	public Funcionario(String nome, int idade, double altura, String endereco, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.endereco = endereco;
		this.salario = salario;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario() {
		double calc = ((8 * 12)/100);
		return calc;
	}
}
