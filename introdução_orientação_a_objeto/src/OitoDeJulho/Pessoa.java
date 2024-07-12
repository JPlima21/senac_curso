package OitoDeJulho;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	double peso;
	int cpf;
	
	public Pessoa(String nome, int idade, double altura, double peso, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.cpf = cpf;
		
		
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
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void apresentarDados() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getAltura());
		System.out.println(getPeso());
		System.out.println(getCpf());
	}
	
}
