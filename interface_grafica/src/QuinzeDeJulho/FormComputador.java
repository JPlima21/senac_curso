package QuinzeDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class FormComputador extends JFrame {

	private JTextField modelField;
	private JToggleButton typeToggleButton;
	private JTextField systemField;
	private JTextField processorField;
	private JTextField videoField;
	private JTextField ramField;
	private JButton submitButton;
	
	private DefaultTableModel tableModel;

	public FormComputador() {
		setTitle("Formulário de Computadores");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
		
		JLabel modelLabel = new JLabel("Modelo:");
		modelField = new JTextField();
		JLabel typeLabel = new JLabel("Tipo de computador:");
		typeToggleButton = new JToggleButton("PC");
		typeToggleButton.addItemListener(e -> {
			if (typeToggleButton.isSelected()) {
				typeToggleButton.setText("Notebook");
			} else {
				typeToggleButton.setText("PC");
			}
		});
		JLabel systemLabel = new JLabel("Sistema Operacional:");
		systemField = new JTextField();
		JLabel processorLabel = new JLabel("Processador:");
		processorField = new JTextField();
		JLabel videoLabel = new JLabel("Placa de Video:");
		videoField = new JTextField();
		JLabel ramLabel = new JLabel("Memoria Ram:");
		ramField = new JTextField();
		
		formPanel.add(modelLabel);
		formPanel.add(modelField);
		formPanel.add(typeLabel);
		formPanel.add(typeToggleButton);
		formPanel.add(systemLabel);
		formPanel.add(systemField);
		formPanel.add(processorLabel);
		formPanel.add(processorField);
		formPanel.add(videoLabel);
		formPanel.add(videoField);
		formPanel.add(ramLabel);
		formPanel.add(ramField);
		
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());
		
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);
		
		add(mainPanel);
		
		setVisible(true);
		
		tableModel = new DefaultTableModel(new String[] {
				"Modelo", "Tipo", "Sistema Operacional", "Processador", "Placa de Video", "Memoria Ram"
		}, 0);
	}
	
public class SubmitButtonListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String model = modelField.getText();
		String type = typeToggleButton.isSelected() ? "Notebook" : "PC";
		String system = systemField.getText();
		String processor = processorField.getText();
		String video = videoField.getText();
		String ram = ramField.getText();
		
		String mensage = String.format(
				"Modelo: %s\nTipo: %s\nSistema Operacional "
				+"%s\nProcessador: %s\nPlaca de Video: %s\nMemoria Ram",
				model, type, system, processor, video, ram
				);
		
		tableModel.addRow(new Object[] {
				model, type, system, processor, video, ram
		});
		
		new InfoFrame(tableModel);
	}
}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FormComputador();
				
			}
		});
		
	}

}

class InfoFrame extends JFrame{
	
	public InfoFrame(DefaultTableModel tableModel) {
		setTitle("Informações do Formulário");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);
		
		
	}
}

