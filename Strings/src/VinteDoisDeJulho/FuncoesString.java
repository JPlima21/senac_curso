package VinteDoisDeJulho;

public class FuncoesString {
	String nome;
	public String iniciarStringManeiraUm(String nome) {
		String nomeFinal = nome;
		System.out.println("Maneira 1: "+ nomeFinal);
		return nomeFinal;
	}
	public String iniciarStringManeriaDois(String nome) {
		String nomeFinal = new String();
		System.out.println("Maneira 2: "+ nomeFinal);
		return nomeFinal;
	}
	//retorna o tamanho da string
	public int retornarTamanhoString(String nome) {
		int tamanho = nome.length();
		System.out.println("O tamanho da string é: " + tamanho);
		return tamanho;
	}
	public char retornarCaracterNaposicao(String nome, int i) {
		char letra = nome.charAt(i);
		System.out.println("Letra na posição " + (i+1) + " é " + letra);
		return letra;
	}
	public String retornarStringApartirDoIndice(String nome,int indice) {
		String novaString = nome.substring(indice);
		System.out.println("A nova String e "+ novaString);
		return novaString;
		}
	
	public String retornarStringApartirDoIndice(String nome, int i, int j) {
		String novaString = nome.substring(i, j);
		System.out.println("A nova String e "+ novaString);
		return novaString;
	}
	public int retornarPrimerioIndice(String nome, String letra) {
		int posicao = nome.indexOf(letra);
		System.out.println("A primeira posição é "+ (posicao + 1));
		return posicao;
	}
	public int retornarUltimoIndice(String nome, String letra) {
		int posicao = nome.lastIndexOf(letra);
		System.out.println("A ultima posição é "+ (posicao + 1));
		return posicao;
	}
	public boolean isContem(String nome, String nome2) {
		boolean contem = nome.contains(nome2);
		System.out.println("O " + nome + " contem " + nome2 + " ?");
		return contem;
	}
	public boolean isEqual(String nome1, String nome2) {
		if (nome.equals(nome2)) {
			System.out.println("OS nome são iguais");
			return true;
			
		}
		System.out.println("Os nomes saõ diferentes");
		return false;
	}
	
	
}
