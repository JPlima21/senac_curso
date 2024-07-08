package aula10_programação_de_sistemas;

import javax.swing.JOptionPane;

public class Main0507 {

	public static void main(String[] args) {
//		Pessoa eduardo = new Pessoa("Eduardo", 18, 1.75);
//		System.out.println(eduardo.getNome());
//		eduardo.setNome("Eduardo Saverim");
//		System.out.println(eduardo.getNome());
//		
//		Pessoa joaoPaulo = new Pessoa("João Paulo", 19, 1.73);
//		System.out.println(joaoPaulo.getNome());
//		joaoPaulo.apresentarSalario(7000);

//		Pessoa luan = new Pessoa("Luan", 23, 1.74, 62.5);
//		JOptionPane.showMessageDialog(
//				null,
//				"nome: " + luan.getNome() + "\n" +
//				"Idade: " + luan.getIdade() + "\n" +
//				"Altura: "+ luan.getAltura() + "\n",
// 				"Informações da pessoa",
//				JOptionPane.WARNING_MESSAGE);

		String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Entrada de dados",
				JOptionPane.QUESTION_MESSAGE);

		String idade = JOptionPane.showInputDialog(null, "Qual o sua idade?", "Entrada de dados",
				JOptionPane.QUESTION_MESSAGE);
		int idadefinal = Integer.parseInt(idade);

		String altura = JOptionPane.showInputDialog(null, "Qual o seu altura?", "Entrada de dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double alturafinal = Double.parseDouble(altura);
		int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (resposta == 0) {
			Pessoa maria = new Pessoa(nome, idadefinal, alturafinal, 57);
			JOptionPane.showMessageDialog(null, "Nome: " + maria.getNome() + "\n" + "Idade: " + maria.getIdade() + "\n"
					+ "Altura;" + maria.getAltura() + "\n", "Informações da pessoa", JOptionPane.WARNING_MESSAGE);
		}
		
		String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
		int escolha = JOptionPane.showOptionDialog(
				null, "Escolha um opção: ", "Seleção", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

	}
}
