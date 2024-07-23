package VinteTresDejulho;

public class Advogado extends Funcionario{
	
	Integer OAB;
	String vara;
	
	public Advogado(String nome, double salario, Integer matricula, double peso, int idade, Integer OAB, String vara) {
		super(nome, salario, matricula, peso, idade);
		this.OAB = OAB;
		this.vara = vara;
	}

	public Integer getOAB() {
		return OAB;
	}

	public void setOAB(Integer oAB) {
		OAB = oAB;
	}

	public String getVara() {
		return vara;
	}

	public void setVara(String vara) {
		this.vara = vara;
	}

	@Override
	public String toString() {
		return "Advogado [OAB=" + OAB + ", vara=" + vara + ", nome=" + nome + ", salario=" + salario + ", matricula="
				+ matricula + ", peso=" + peso + ", idade=" + idade + ", getOAB()=" + getOAB() + ", getVara()="
				+ getVara() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + ", getMatricula()="
				+ getMatricula() + ", getPeso()=" + getPeso() + ", getIdade()=" + getIdade() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
