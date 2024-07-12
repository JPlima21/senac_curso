package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class Seguranca extends JFrame {

	private JTextField nameFiled;
	private JTextField phoneField;
	private JTextField emailField;
	private JTextField neighborhoodFiled;
	private JTextField tecnologiaFiled;
	private JTextField patrolFiled;
	private JTextField dificultFiled;
	private JToggleButton contacPrefToggle;
	private JRadioButton maleRadio;
	private JRadioButton femaleRadio;
	private JButton submitButton;
	

	public Seguranca() {
		setTitle("Questionario");
		setSize(750, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel questPanel = new JPanel(new GridLayout(10, 2, 10, 10));

		JLabel nameLabel = new JLabel("Nome: ");
		nameFiled = new JTextField();
		JLabel phoneLabel = new JLabel("Telefone: ");
		phoneField = new JTextField();
		JLabel emailLabel = new JLabel("Email: ");
		emailField = new JTextField();
		JLabel neighborhoodLabel = new JLabel("Você acha seu bairro seguro?: ");
		neighborhoodFiled = new JTextField();
		JLabel tecnologiaLabel = new JLabel("A tecnologia tem ajudado na segurança publica?");
		tecnologiaFiled = new JTextField();
		JLabel patrolLabel = new JLabel("Você acha a ronda policial no seu bairro boas?");
		patrolFiled = new JTextField();
		JLabel dificultLabel = new JLabel("Qual a maior dificuldade para melhorar a segurança publica? ");
		dificultFiled = new JTextField();
		
		JLabel contactPrefLabel = new JLabel("Preferencia de contato");
		contacPrefToggle = new JToggleButton("Email");
		contacPrefToggle.addItemListener(e -> {
			if (contacPrefToggle.isSelected()) {
				contacPrefToggle.setText("Telefone");
			} else {
				contacPrefToggle.setText("Email");
			}
		});
		
		JLabel genderLabel = new JLabel("Gênero");
		maleRadio = new JRadioButton("Masculino");
		femaleRadio = new JRadioButton("Feminino");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);
		

		questPanel.add(nameLabel);
		questPanel.add(nameFiled);
		questPanel.add(phoneLabel);
		questPanel.add(phoneField);
		questPanel.add(emailLabel);
		questPanel.add(emailField);
		questPanel.add(neighborhoodLabel);
		questPanel.add(neighborhoodFiled);
		questPanel.add(tecnologiaLabel);
		questPanel.add(tecnologiaFiled);
		questPanel.add(patrolLabel);
		questPanel.add(patrolFiled);
		questPanel.add(dificultLabel);
		questPanel.add(dificultFiled);
		questPanel.add(contactPrefLabel);
		questPanel.add(contacPrefToggle);
		questPanel.add(genderLabel);
		JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		genderPanel.add(maleRadio);
		genderPanel.add(femaleRadio);
		questPanel.add(genderPanel);
		

		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());

		mainPanel.add(questPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);

		add(mainPanel);

		setVisible(true);

	}

	private class SubmitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = nameFiled.getText();
			String phone = phoneField.getText();
			String email = emailField.getText();
			String neighborhood = neighborhoodFiled.getText();
			String tecnologia = tecnologiaFiled.getText();
			String patrol = patrolFiled.getText();
			String dificult = dificultFiled.getText();
			String contactPref = contacPrefToggle.isSelected() ? "Telefone" : "Email";
			String gender = maleRadio.isSelected() ? "Masculino"
					: femaleRadio.isSelected() ? "Feminino" : "Não especificado";
			
			String menssage = String.format(
					"Nome: %s\n telefone: %s\n Email: %s\n "
					+ "Preferência de contato: %s\n Gênero: %s\n Você acha seu bairro seguro? %s\n "
					+ "A tecnologia tem ajudado na segurança publica? %s\n "
					+ "Você acha a ronda policial no seu bairro boa? %s\n"
					+ "Qual a maior dificultade da para melhorar a segurança publica? %s\n ",
					name, phone, email,contactPref, gender, neighborhood, tecnologia,
					patrol, dificult );

			JOptionPane.showMessageDialog(Seguranca.this, menssage, "Informações do Formulário",
					JOptionPane.INFORMATION_MESSAGE);

		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Seguranca();

			}
		});
	}

}
