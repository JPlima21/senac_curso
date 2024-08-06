package projetoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class view extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public view() {
		setBackground(new Color(62, 62, 62));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(26, 26, 26));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(26, 26, 26));
		panel.setBounds(10, 11, 564, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		textField.setBackground(new Color(126, 121, 134));
		textField.setBounds(158, 196, 245, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("E-mail");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblNewLabel.setBounds(242, 147, 77, 38);
		panel.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24));
		lblSenha.setBounds(247, 282, 66, 38);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(126, 121, 134));
		passwordField.setBounds(158, 331, 245, 29);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setBounds(105, 447, 124, 38);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Criar conta");
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setBounds(326, 447, 124, 38);
		panel.add(btnNewButton_1);
	}
}
