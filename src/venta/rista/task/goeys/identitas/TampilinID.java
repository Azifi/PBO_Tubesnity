package venta.rista.task.goeys.identitas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

import venta.rista.task.err.impl.IdentifiImpl;
import venta.rista.task.err.interf.IdentifiInterf;
import venta.rista.task.err.mais.Identifi;
import venta.rista.task.err.mais.User;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TampilinID extends JPanel {
	private JTextField textFieldNamaRuang;
	private JComboBox comboBoxLokasi;
	private JComboBox comboBoxGedung;
	private JComboBox comboBoxFakultas;
	private JComboBox comboBoxProdi;
	private JButton buttonSimvan;
	IdentifiInterf iden;
	/**
	 * Create the panel.
	 */
	public TampilinID() {
		setLayout(null);
		iden = new IdentifiImpl();
		textFieldNamaRuang = new JTextField();
		textFieldNamaRuang.setColumns(10);
		textFieldNamaRuang.setBounds(154, 40, 187, 20);
		add(textFieldNamaRuang);
		
		JLabel labelNamaRuang = new JLabel("Nama Ruang");
		labelNamaRuang.setBounds(48, 43, 102, 14);
		add(labelNamaRuang);
		
		JLabel labelLokasi = new JLabel("Lokasi");
		labelLokasi.setBounds(48, 84, 102, 14);
		add(labelLokasi);
		
		comboBoxLokasi = new JComboBox();
		comboBoxLokasi.setModel(new DefaultComboBoxModel(new String[] {"Pilih Lokasi Kampus . . .", "UMM Kampus 1", "UMM Kampus 2", "UMM Kampus 3"}));
		comboBoxLokasi.setBounds(154, 80, 187, 22);
		add(comboBoxLokasi);
		
		JLabel labelGedung = new JLabel("Gedung");
		labelGedung.setBounds(48, 123, 102, 20);
		add(labelGedung);
		
		comboBoxGedung = new JComboBox();
		comboBoxGedung.setModel(new DefaultComboBoxModel(new String[] {"Pilih Lokasi Gedung . . .", "GKB 1", "GKB 2", "GKB 3"}));
		comboBoxGedung.setEditable(true);
		comboBoxGedung.setBounds(154, 123, 187, 20);
		add(comboBoxGedung);
		
		JLabel labelFakultas = new JLabel("Fakultas");
		labelFakultas.setBounds(48, 164, 102, 20);
		add(labelFakultas);
		
		comboBoxFakultas = new JComboBox();
		comboBoxFakultas.setModel(new DefaultComboBoxModel(new String[] {"Pilih Fakultas . . .", "Keguruan & Ilmu Pendidikan", "Ilmu Sosial & Ilmu Pemerintahan", "Hukum", "Teknik", "Ekonomi & Bisnis", "Agama Islam", "Ilmu Kesehatan", "Kedokteran"}));
		comboBoxFakultas.setBounds(154, 164, 187, 22);
		add(comboBoxFakultas);
		
		JLabel labelProdi = new JLabel("Program Studi");
		labelProdi.setBounds(48, 209, 102, 20);
		add(labelProdi);
		
		comboBoxProdi = new JComboBox();
		comboBoxProdi.setBounds(154, 206, 186, 22);
		add(comboBoxProdi);
		
		buttonSimvan = new JButton("Simvan");
		buttonSimvan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
	                Identifi id = new Identifi();
	                id.setNamaruang(textFieldNamaRuang.getText());
	                id.setLokasi((String)comboBoxLokasi.getSelectedItem());
	                id.setGedung((String)comboBoxGedung.getSelectedItem());
	                id.setFakultas((String)comboBoxFakultas.getSelectedItem());
	                id.setProdi((String)comboBoxProdi.getSelectedItem());
	                iden.masukin(id);
	                textFieldNamaRuang.setText("");
	                comboBoxLokasi.getSelectedItem();
	                comboBoxGedung.getSelectedItem();
	                comboBoxFakultas.getSelectedItem();
	                comboBoxProdi.getSelectedItem();
	                JOptionPane.showMessageDialog(null, "Data User anda Sudah tersimpan, Selamat menikmati Fasilitas Perpustakaan Mini");
	            } catch (SQLException ex) {
	                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
	            }
			}
		});
		buttonSimvan.setBounds(154, 270, 187, 23);
		add(buttonSimvan);
	}

}
