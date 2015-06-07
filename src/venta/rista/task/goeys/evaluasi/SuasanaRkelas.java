package venta.rista.task.goeys.evaluasi;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class SuasanaRkelas extends JPanel {
	private JTextField textFieldCahaya;
	private JTextField textFieldLembab;
	private JTextField textFieldSuhu;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public SuasanaRkelas() {
		setLayout(null);
		JCheckBox checkBox_2 = new JCheckBox("Bising");
		checkBox_2.setBounds(6, 20, 74, 23);
		add(checkBox_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(86, 21, 50, 20);
		add(textField_6);
		
		JCheckBox checkBox_3 = new JCheckBox("Bau");
		checkBox_3.setBounds(6, 48, 74, 23);
		add(checkBox_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(86, 49, 50, 20);
		add(textField_7);
		
		JCheckBox checkBox_4 = new JCheckBox("Bocor");
		checkBox_4.setBounds(6, 74, 73, 23);
		add(checkBox_4);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(86, 75, 50, 20);
		add(textField_8);
		
		JCheckBox checkBox_5 = new JCheckBox("Rusak");
		checkBox_5.setBounds(6, 100, 74, 23);
		add(checkBox_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(86, 101, 50, 20);
		add(textField_9);
		
		JCheckBox checkBox_6 = new JCheckBox("Aus");
		checkBox_6.setBounds(6, 126, 74, 23);
		add(checkBox_6);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(86, 127, 50, 20);
		add(textField_10);
		
		JLabel label_29 = new JLabel("Kebersihan lantai");
		label_29.setBounds(13, 179, 100, 14);
		add(label_29);
		
		JRadioButton radioButton_7 = new JRadioButton("Baik");
		radioButton_7.setBounds(132, 175, 78, 23);
		add(radioButton_7);
		
		JRadioButton radioButton_9 = new JRadioButton("Tidak Baik");
		radioButton_9.setBounds(212, 175, 109, 23);
		add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("Baik");
		radioButton_10.setBounds(132, 204, 78, 23);
		add(radioButton_10);
		
		JLabel label_30 = new JLabel("Kebersihan lantai");
		label_30.setBounds(13, 208, 100, 14);
		add(label_30);
		
		JRadioButton radioButton_11 = new JRadioButton("Tidak Baik");
		radioButton_11.setBounds(212, 204, 109, 23);
		add(radioButton_11);
		
		JLabel label_31 = new JLabel("Kebersihan lantai");
		label_31.setBounds(13, 236, 100, 14);
		add(label_31);
		
		JRadioButton radioButton_12 = new JRadioButton("Baik");
		radioButton_12.setBounds(132, 232, 78, 23);
		add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("Tidak Baik");
		radioButton_13.setBounds(212, 232, 109, 23);
		add(radioButton_13);
		
		JLabel label_32 = new JLabel("Kebersihan lantai");
		label_32.setBounds(13, 263, 100, 14);
		add(label_32);
		
		JRadioButton radioButton_14 = new JRadioButton("Baik");
		radioButton_14.setBounds(132, 259, 78, 23);
		add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("Tidak Baik");
		radioButton_15.setBounds(212, 259, 109, 23);
		add(radioButton_15);
		
		JButton btnSimvan_1 = new JButton("Simvan");
		btnSimvan_1.setBounds(234, 369, 152, 23);
		add(btnSimvan_1);
		
		JLabel lblSsidUmmHotspot = new JLabel("SSID UMM Hotspot");
		lblSsidUmmHotspot.setBounds(13, 298, 123, 14);
		add(lblSsidUmmHotspot);
		
		JRadioButton rdbtnAda = new JRadioButton("Ada");
		rdbtnAda.setBounds(132, 294, 78, 23);
		add(rdbtnAda);
		
		JRadioButton rdbtnTidakAda = new JRadioButton("Tidak Ada");
		rdbtnTidakAda.setBounds(212, 294, 109, 23);
		add(rdbtnTidakAda);
		
		JLabel lblTerkoneksi = new JLabel("Terkoneksi");
		lblTerkoneksi.setBounds(13, 323, 123, 14);
		add(lblTerkoneksi);
		
		JRadioButton rdbtnBisa = new JRadioButton("Bisa");
		rdbtnBisa.setBounds(132, 319, 78, 23);
		add(rdbtnBisa);
		
		JRadioButton rdbtnTidakBisa = new JRadioButton("Tidak Bisa");
		rdbtnTidakBisa.setBounds(212, 319, 109, 23);
		add(rdbtnTidakBisa);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 165, 422, 8);
		add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 288, 422, 4);
		add(separator_4);
	}

}
