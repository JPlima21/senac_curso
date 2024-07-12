package OitoDeJulho;

import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		String nomeCachorro = JOptionPane.showInputDialog(
				null,
				"Digite o nome do seu cachorro:",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
				);
		
		Mamifero cachorro = new Mamifero(nomeCachorro, 0.45, 2);
//		cachorro.apresentarNomeAnimal();
//		cachorro.clasificandoAnimal(0);
//		cachorro.classificandoAnimalPorIdade(10);
		
		int resposta = JOptionPane.showConfirmDialog(
				null,
				"Você quer manter o nome " + nomeCachorro,
				"confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION
				);
		if (resposta == 0) {
			JOptionPane.showConfirmDialog(
					null, 
					"Cuidado com o " + cachorro.getNome(),
					"Cuidado com o cão",
					JOptionPane.WARNING_MESSAGE
					);
		}
//		System.out.println();
//		
//		Mamifero gato = new Mamifero("Marri", 0.45, 10);
//		gato.apresentarNomeAnimal();
//		gato.clasificandoAnimal(0);
//		gato.classificandoAnimalPorIdade(10);
		

	}

}
