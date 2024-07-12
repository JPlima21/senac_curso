package OitoDeJulho;

public class Carro {
	String marca;
	String cor;
	int numplaca;
	int anofabricacao;
	
	public Carro(String marca, String cor, int numplaca, int anofabricacao) {
		this.marca = marca;
		this.cor = cor;
		this.numplaca = numplaca;
		this.anofabricacao = anofabricacao;
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getNumplaca() {
		return numplaca;
	}
	
	public void setNumplaca(int numplaca) {
		this.numplaca = numplaca;
	}
	
	public int getAnofabricacao() {
		return anofabricacao;
	}
	
	public void setAnofabricacao(int anofabricacao) {
		this.anofabricacao = anofabricacao;
	}
}
