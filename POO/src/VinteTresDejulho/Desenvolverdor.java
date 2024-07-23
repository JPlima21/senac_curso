package VinteTresDejulho;

public class Desenvolverdor extends Funcionario{
	String linguagemProgramacao;
	String nivel;
	
	public Desenvolverdor(String nome, double salario, Integer matricula, double peso, int idade, String linguagemProgramacao, String nivel) {
		super(nome, salario, matricula, peso, idade);
		this.linguagemProgramacao = linguagemProgramacao;
		this.nivel = nivel;
	}

}
