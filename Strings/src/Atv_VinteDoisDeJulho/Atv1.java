package Atv_VinteDoisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Atv1 {
	String nome;
	
	//Atividade 1
	public int retornarTamanhoString(String nome) {
		int tamanho = nome.length();
		System.out.println("O tamanho da String é " + tamanho);
		return tamanho;
	}
	
	//Atividade 2
	public String inverterString(String nome) {
		String palavras[] = nome.split(" ");
		String finalizacao = "";
		
		for (String palavra : palavras) {
			String invert = "";
			for (int i = palavra.length()-1; i >= 0; i--) {
				invert += palavra.charAt(i);
			}
			finalizacao += invert + " "; 
		}
		
		System.out.println(finalizacao);
		return finalizacao.trim();	
	}
	
	//Atividade 3
	public String removerString(String nome, String Stringremover) {
		//List<String> lista_remover = new ArrayList<>(List.of(Stringremover));
		String parts[] = Stringremover.split(",");
		String fraseFinal = "";
		for (String palavra : parts) { 
			fraseFinal = nome.replaceAll(palavra.trim(), "");
				
		} 
		System.out.println(fraseFinal);
		return fraseFinal; 
	}
	public static void main(String[] args) {
		
	}
}
