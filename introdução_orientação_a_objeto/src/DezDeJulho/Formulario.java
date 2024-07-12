package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Formulario extends JFrame{
	
	private JTextField nameFiled;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField addressField;
	private JButton submitButton;
	
	public Formulario() {
		// Informações e configurações iniciais da janela
		setTitle("Formulario de cadastro");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
		
		JLabel nameJLabel = new JLabel("Nome: ");
		nameFiled = new JTextField();
		JLabel emailJLabel = new JLabel("Email: ");
		emailField = new JTextField();
		JLabel phoneJLabel = new JLabel("Telefone: ");
		phoneField = new JTextField();
		JLabel addressJLabel = new JLabel("Endereço: ");
		addressField= new JTextField();
		
		// Adicionando label e t
		formPanel.add(nameJLabel);
		formPanel.add(nameFiled);
		formPanel.add(emailJLabel);
		formPanel.add(emailField);
		formPanel.add(phoneJLabel);
		formPanel.add(phoneField);
		formPanel.add(addressJLabel);
		formPanel.add(addressField);
		
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());
		
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);
		
		add(mainPanel);
		
		setVisible(true);
	}
	
	private class SubmitButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = nameFiled.getText();
			String email = emailField.getText();
			String phone = phoneField.getText();
			String address = addressField.getText();
			
			String message = String.format("Nome: %s\nEmail: %s\nTelefone %s\nEndereço: %s",
					name, email, phone, address);
			
			JOptionPane.showMessageDialog(
					Formulario.this,
					message,
					"Informações do Formulário",
					JOptionPane.INFORMATION_MESSAGE
					);
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Formulario();
				
			}
		});
	}
}
