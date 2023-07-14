package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class SUPUESTO_PRACTICO_1 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField txtKg;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textCantidad;
	private JRadioButton rdbtnN1;
	private JRadioButton rdbtnN2;
	private JRadioButton rdbtnN3;
	private JRadioButton rdbtnN4;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUPUESTO_PRACTICO_1 frame = new SUPUESTO_PRACTICO_1();
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
	public SUPUESTO_PRACTICO_1() {
		setTitle("Calculadora envíos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][26.00][64.00][64.00,grow]", "[][grow][grow][grow][grow][grow][grow][grow]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, "cell 0 0 5 1,grow");
		
		JLabel lblTitulo = new JLabel("Calculadora de Envíos");
		lblTitulo.setForeground(Color.WHITE);
		panel.add(lblTitulo);
		
		JLabel lblEtiqueta1 = new JLabel("Ciudad Origen:");
		contentPane.add(lblEtiqueta1, "cell 2 1,alignx leading");
		
		text1 = new JTextField();
		contentPane.add(text1, "cell 3 1 2 1,growx");
		text1.setColumns(10);
		
		rdbtnN1 = new JRadioButton("Nacional");
		rdbtnN1.setSelected(true);
		buttonGroup.add(rdbtnN1);
		contentPane.add(rdbtnN1, "cell 3 2");
		
		rdbtnN2 = new JRadioButton("Extranjero");
		buttonGroup.add(rdbtnN2);
		contentPane.add(rdbtnN2, "cell 4 2");
		
		JLabel lblNewLabel_2 = new JLabel("Ciudad Destino:");
		contentPane.add(lblNewLabel_2, "cell 2 3,alignx leading");
		
		text2 = new JTextField();
		contentPane.add(text2, "cell 3 3 2 1,growx");
		text2.setColumns(10);
		
		rdbtnN3 = new JRadioButton("Nacional");
		rdbtnN3.setSelected(true);
		buttonGroup_1.add(rdbtnN3);
		contentPane.add(rdbtnN3, "cell 3 4");
		
		rdbtnN4 = new JRadioButton("Extranjero");
		buttonGroup_1.add(rdbtnN4);
		contentPane.add(rdbtnN4, "cell 4 4");
		
		JLabel lblEtiqueta2 = new JLabel("Tipo de envío:");
		contentPane.add(lblEtiqueta2, "cell 2 5,alignx leading");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 3 5 2 1,grow");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10 H", "Paq 14 - Antes de las 14 H", "Paq 24 - Al día siguiente"}));
		scrollPane.setViewportView(comboBox);
		
		JLabel lblEtiqueta3 = new JLabel("Peso:");
		contentPane.add(lblEtiqueta3, "cell 2 6,alignx leading");
		
		textCantidad = new JTextField();
		contentPane.add(textCantidad, "flowx,cell 3 6");
		textCantidad.setColumns(10);
		
		txtKg = new JTextField();
		txtKg.setText("Kg");
		contentPane.add(txtKg, "cell 3 6");
		txtKg.setColumns(10);
		
		btnOK = new JButton("Calcular precio");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calular();
				
			}
		});
		contentPane.add(btnOK, "cell 3 7,alignx center");
	
	}
	protected void calular() {
		String texto= new String(text1.getText());
		if(text1.getText()!=null && !text1.getText().isBlank() &&
				texto!=null && !texto.isBlank()) {
			btnOK.setEnabled(true);
		} else {
			btnOK.setEnabled(false);
			JOptionPane.showMessageDialog(contentPane, 
					"Error, campo o campos vacios." , 
					"Aviso Ciudad Origen", JOptionPane.ERROR_MESSAGE);
		} btnOK.setEnabled(true);
		String texto2= new String(text2.getText());
		if(text2.getText()!=null && !text2.getText().isBlank() &&
				texto!=null && !texto.isBlank()) {
			btnOK.setEnabled(true);
		} else {
			btnOK.setEnabled(false);
			JOptionPane.showMessageDialog(contentPane, 
					"Error, campo o campos vacios" , 
					"Aviso Ciudad Destino", JOptionPane.ERROR_MESSAGE);
		} btnOK.setEnabled(true);
		
		


		
		
		
		
		int nacional_base=4;
		int extranjero_base=7;
		int recargo1=5;
		int recargo2=2;
		int recargo3=10;
		String tipo;
		
		
		
		
		
		
	}
	

	@Override
	public String toString() {
		return "SUPUESTO_PRACTICO_1 [contentPane=" + contentPane + ", text1=" + text1 + ", text2=" + text2 + ", txtKg="
				+ txtKg + ", textCantidad=" + textCantidad + "]";
	}
	}
