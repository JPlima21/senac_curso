package NoveDeJulho_atv1;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Main_atv4 {
	public static void main(String[] args) {
		String[] estados = {"Ceará - CE", "Amazonas - AM", "Alagoas - AL", "Goías - GO", "Rio de Janeiro - RJ"};
		String[] carros = {"Corsa", "Celta", "GTR", "Supra", "Skyline", "Camaro"};
		String[] cursos = {"Administração", "Ciência da cumputação", "Engenharia", "Educação Fisíca", "Fisíca"};
		String[] opc = {"Opção 1", "Opção 2", "Opção 3"};
		int escolha = JOptionPane.showOptionDialog(
				null,
				"Escolha uma opção:",
				"Seleção",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opc,
				opc[0]
				);
		
		if (escolha == 0) {
			JOptionPane.showMessageDialog(
					null,
					estados,
					"Estados Brasileiros",
					JOptionPane.WARNING_MESSAGE
					);
		} else if (escolha == 1) {
			JOptionPane.showMessageDialog(
					null,
					carros,
					"Carros",
					JOptionPane.WARNING_MESSAGE
					);
		}else {
			JOptionPane.showMessageDialog(
					null, 
					cursos,
					"Cursos",
					JOptionPane.WARNING_MESSAGE
					);
		}
		
	}

}
