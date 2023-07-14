package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class SUPUESTO_PRACTIO_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUPUESTO_PRACTIO_2 frame = new SUPUESTO_PRACTIO_2();
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
	public SUPUESTO_PRACTIO_2() {
		setTitle("Gestion autocares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][63.00][][][grow]", "[28px][][][][41.00][grow]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, "cell 0 0 5 1,grow");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblNewLabel = new JLabel("Gestión autocares");
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("Matricula:");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 1 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marca:");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 1 2 2 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo:");
		contentPane.add(lblNewLabel_4, "cell 3 2,alignx trailing");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 4 2,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Kilómetros:");
		contentPane.add(lblNewLabel_3, "cell 0 3,alignx trailing");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 1 3 2 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Plazas");
		contentPane.add(lblNewLabel_5, "cell 3 3,alignx trailing");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 4 3,growx");
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Insertar");
		contentPane.add(btnNewButton, "cell 2 4");
		
		JButton btnNewButton_1 = new JButton("Mostrar Datos");
		contentPane.add(btnNewButton_1, "cell 3 4");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 5 5 1,grow");
	}

}
