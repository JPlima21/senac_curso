package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthPopupMenuUI;

public class Main {
	public static void main(String[] args) {

		// Declaração da lista
		List<String> list = new ArrayList<>();

		// Adicionar elementos na lista
		list.add("Marcos Mahalanobis");
		list.add("João Paulo II");
		list.add("Eliel");
		list.add("Luciano Cavalcante");
		list.add("Edward Snowden");
		list.add("Maria de Jesus");

		// Recupera ou apresentar o ultimo elemento da lista
//		System.out.println(list.get(5));
//		
//		//Apresentar todos os elementos da lista
//		System.out.println(list);
//		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elemento: " + list.get(i) + " Posição: " + (i));
		}
		list.add(1, "Leo");

//		for(String elemento: list) {
//			System.out.println("Elemento: " + elemento);
//		}

//		System.out.println(list);
		//Remove elemento por indice
//		list.remove(0);
//		System.out.println(list);
		//Remove ppr elemento
//		list.remove("Leo");
//		System.out.println(list);
		//Atuzliza um elemento da lista
//		list.set(1, "Loenardo");

		//Retornar o indice da primeira ocorrência
//		int primeiroValorEncontrado = list.indexOf("Leo");
//		System.out.println("Indice " + primeiroValorEncontrado);
//		//Retornar o indice da última ocorrência
//		int ultimoValorEncontrado = list.lastIndexOf("Eliel Sousa");
//		System.out.println("Ultimo: " + ultimoValorEncontrado);
		 
		//Pega o tamanho da lista
		int sizelist = list.size();
		System.out.println("O tamanho da lista é: " + sizelist);
		//Verifica se a lista esta vazia
		boolean isListEmpty = list.isEmpty();
		System.out.println("A lista esta vazia " + isListEmpty);
		//Cria uma sublista a partir de uma lista
		List<String> sublist = list.subList(2, 4);
 		System.out.println(sublist);
		//Vreifica se o valor passado está na lista
 		boolean contains = list.contains("Eliel Sousa");
 		System.out.println("Contains" + contains);
 		
	}

}
