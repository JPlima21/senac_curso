package DoisDeAgosto;

public class Professor implements IProfissoes{

	@Override
	public double calcularSalario(double salarioBruto, double imposto, double gratificacao) {
		double salarioFinal = (salarioBruto - 1.5 * imposto) + gratificacao;
		return 0;
	}

	@Override
	public double calcularHorasTrabalhadas(double dia, double hora) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularINSS(double salarioBruto, double faixaDeImposto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
