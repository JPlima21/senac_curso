package DoisDeAgosto;

public interface IProfissoes {
	public double calcularSalario(
			double salarioBruto, 
			double imposto, 
			double gratificacao);
	
	public double calcularHorasTrabalhadas(
			double dia, 
			double hora);
		
	public double calcularINSS(
			double salarioBruto,
			double faixaDeImposto);

}
