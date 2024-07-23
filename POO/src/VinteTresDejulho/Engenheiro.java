package VinteTresDejulho;

import java.lang.classfile.Superclass;

public class Engenheiro extends Funcionario{
	Integer CREA;
	String nivel;
	String area;
	
	public Engenheiro(String nome, double salario, Integer matricula, double peso, int idade, Integer CREA, String nivel, String area) {
		super(nome, salario, matricula, peso, idade);
		this.CREA = CREA;
		this.nivel = nivel;
		this.area = area;
	}

	public Integer getCREA() {
		return CREA;
	}

	public void setCREA(Integer cREA) {
		CREA = cREA;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Engenheiro [CREA=" + CREA + ", nivel=" + nivel + ", area=" + area + ", nome=" + nome + ", salario="
				+ salario + ", matricula=" + matricula + ", peso=" + peso + ", idade=" + idade + "]";
	}
	
	@Override
	public double calcularSalario(double imposto, double gratificacao) {
		// TODO Auto-generated method stub
		return super.calcularSalario(imposto, gratificacao);
	}
}
