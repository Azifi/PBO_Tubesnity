package venta.rista.task.goeys.evaluasi;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import venta.rista.task.err.impl.KenyamananImpl;
import venta.rista.task.err.impl.LingkunganImpl;
import venta.rista.task.err.interf.KenyamananInterf;
import venta.rista.task.err.interf.LingkunganInterf;
import venta.rista.task.err.mais.Kenyamanan;
import venta.rista.task.err.mais.Lingkungan;
import venta.rista.task.err.mais.SaranaLampu;
import venta.rista.task.err.mais.SaranaLcd;
import venta.rista.task.err.mais.SaranaSteker;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

public class SuasanaRkelas extends JPanel {
	private JTextField textFieldBising;
	private JTextField textFieldBau;
	private JTextField textFieldBocor;
	private JTextField textFieldRusak;
	private JTextField textFieldAus;
	private JCheckBox checkBoxBising;
	private JCheckBox checkBoxBau;
	private JCheckBox checkBoxBocor;
	private JCheckBox checkBoxRusak;
	private JCheckBox checkBoxAus;
	private JRadioButton radioButtonLanteBaik;
	private JRadioButton radioButtonLanteTidak;
	private JRadioButton radioButtonDinBaik;
	private JRadioButton radioButtonDinTidak;
	private JRadioButton radioButtonAtapBaik;
	private JRadioButton radioButtonAtapTidak;
	private JRadioButton radioButtoJenBaik;
	private JRadioButton radioButtonJenTidak;
	private JRadioButton radioButtonPintuBaik;
	private JRadioButton radioButtonPintuTidak;
	private JRadioButton rdbtnAda;
	private JRadioButton rdbtnTidakAda ;
	private JRadioButton rdbtnBisa;
	private JRadioButton rdbtnTidakBisa;
	KenyamananInterf nyaman;
	LingkunganInterf disi;
	private final ButtonGroup buttonGroupLante = new ButtonGroup();
	private final ButtonGroup buttonGroupDinding = new ButtonGroup();
	private final ButtonGroup buttonGroupAtap = new ButtonGroup();
	private final ButtonGroup buttonGroupJendela = new ButtonGroup();
	private final ButtonGroup buttonGroupPintu = new ButtonGroup();
	private final ButtonGroup buttonGroupHotspot = new ButtonGroup();
	private final ButtonGroup buttonGroupKonesi = new ButtonGroup();
	
	/**
	 * Create the panel.
	 */
	public SuasanaRkelas() {
		setLayout(null);
		nyaman = new KenyamananImpl();
		disi = new LingkunganImpl();
		
		checkBoxBising = new JCheckBox("Bising");
		checkBoxBising.setBounds(6, 20, 74, 23);
		add(checkBoxBising);
		
		textFieldBising = new JTextField();
		textFieldBising.setColumns(10);
		textFieldBising.setBounds(86, 21, 50, 20);
		add(textFieldBising);
		
		checkBoxBau = new JCheckBox("Bau");
		checkBoxBau.setBounds(6, 48, 74, 23);
		add(checkBoxBau);
		
		textFieldBau = new JTextField();
		textFieldBau.setColumns(10);
		textFieldBau.setBounds(86, 49, 50, 20);
		add(textFieldBau);
		
		checkBoxBocor = new JCheckBox("Bocor");
		checkBoxBocor.setBounds(6, 74, 73, 23);
		add(checkBoxBocor);
		
		textFieldBocor = new JTextField();
		textFieldBocor.setColumns(10);
		textFieldBocor.setBounds(86, 75, 50, 20);
		add(textFieldBocor);
		
		checkBoxRusak = new JCheckBox("Rusak");
		checkBoxRusak.setBounds(6, 100, 74, 23);
		add(checkBoxRusak);
		
		textFieldRusak = new JTextField();
		textFieldRusak.setColumns(10);
		textFieldRusak.setBounds(86, 101, 50, 20);
		add(textFieldRusak);
		
		checkBoxAus = new JCheckBox("Aus");
		checkBoxAus.setBounds(6, 126, 74, 23);
		add(checkBoxAus);
		
		textFieldAus = new JTextField();
		textFieldAus.setColumns(10);
		textFieldAus.setBounds(86, 127, 50, 20);
		add(textFieldAus);
		
		JSeparator separatorKenyamanan = new JSeparator();
		separatorKenyamanan.setBounds(0, 165, 422, 8);
		add(separatorKenyamanan);
		
		JLabel labelLante = new JLabel("Kebersihan Lantai");
		labelLante.setBounds(13, 179, 100, 14);
		add(labelLante);
		
		radioButtonLanteBaik = new JRadioButton("Baik");
		buttonGroupLante.add(radioButtonLanteBaik);
		radioButtonLanteBaik.setBounds(132, 175, 78, 23);
		add(radioButtonLanteBaik);
		
		radioButtonLanteTidak = new JRadioButton("Tidak Baik");
		buttonGroupLante.add(radioButtonLanteTidak);
		radioButtonLanteTidak.setBounds(212, 175, 109, 23);
		add(radioButtonLanteTidak);
		
		JLabel labelDinding = new JLabel("Kebersihan Dinding");
		labelDinding.setBounds(13, 208, 100, 14);
		add(labelDinding);
		
		radioButtonDinBaik = new JRadioButton("Baik");
		buttonGroupDinding.add(radioButtonDinBaik);
		radioButtonDinBaik.setBounds(132, 204, 78, 23);
		add(radioButtonDinBaik);
		
		radioButtonDinTidak = new JRadioButton("Tidak Baik");
		buttonGroupDinding.add(radioButtonDinTidak);
		radioButtonDinTidak.setBounds(212, 204, 109, 23);
		add(radioButtonDinTidak);
		
		JLabel labelAtap = new JLabel("Kebersihan Atap");
		labelAtap.setBounds(13, 236, 100, 14);
		add(labelAtap);
		
		radioButtonAtapBaik = new JRadioButton("Baik");
		buttonGroupAtap.add(radioButtonAtapBaik);
		radioButtonAtapBaik.setBounds(132, 232, 78, 23);
		add(radioButtonAtapBaik);
		
		radioButtonAtapTidak = new JRadioButton("Tidak Baik");
		buttonGroupAtap.add(radioButtonAtapTidak);
		radioButtonAtapTidak.setBounds(212, 232, 109, 23);
		add(radioButtonAtapTidak);
		
		JLabel labelJendela = new JLabel("Kebersihan Jendela");
		labelJendela.setBounds(13, 263, 100, 14);
		add(labelJendela);
		
		radioButtoJenBaik = new JRadioButton("Baik");
		buttonGroupJendela.add(radioButtoJenBaik);
		radioButtoJenBaik.setBounds(132, 259, 78, 23);
		add(radioButtoJenBaik);
		
		radioButtonJenTidak = new JRadioButton("Tidak Baik");
		buttonGroupJendela.add(radioButtonJenTidak);
		radioButtonJenTidak.setBounds(212, 259, 109, 23);
		add(radioButtonJenTidak);
		
		JLabel labelPintu = new JLabel("Kebersihan Pintu");
		labelPintu.setBounds(13, 288, 100, 14);
		add(labelPintu);
		
		radioButtonPintuBaik = new JRadioButton("Baik");
		buttonGroupPintu.add(radioButtonPintuBaik);
		radioButtonPintuBaik.setBounds(132, 284, 78, 23);
		add(radioButtonPintuBaik);
		
		radioButtonPintuTidak = new JRadioButton("Tidak Baik");
		buttonGroupPintu.add(radioButtonPintuTidak);
		radioButtonPintuTidak.setBounds(212, 284, 109, 23);
		add(radioButtonPintuTidak);
		
		JSeparator separatorLingkungan = new JSeparator();
		separatorLingkungan.setBounds(0, 325, 422, 4);
		add(separatorLingkungan);
		
		JLabel lblSsidUmmHotspot = new JLabel("SSID UMM Hotspot");
		lblSsidUmmHotspot.setBounds(13, 335, 123, 14);
		add(lblSsidUmmHotspot);
		
		rdbtnAda = new JRadioButton("Ada");
		buttonGroupHotspot.add(rdbtnAda);
		rdbtnAda.setBounds(132, 331, 78, 23);
		add(rdbtnAda);
		
		rdbtnTidakAda = new JRadioButton("Tidak Ada");
		buttonGroupHotspot.add(rdbtnTidakAda);
		rdbtnTidakAda.setBounds(212, 331, 109, 23);
		add(rdbtnTidakAda);
		
		JLabel lblTerkoneksi = new JLabel("Terkoneksi");
		lblTerkoneksi.setBounds(13, 360, 123, 14);
		add(lblTerkoneksi);
		
		rdbtnBisa = new JRadioButton("Bisa");
		buttonGroupKonesi.add(rdbtnBisa);
		rdbtnBisa.setBounds(132, 356, 78, 23);
		add(rdbtnBisa);
		
		rdbtnTidakBisa = new JRadioButton("Tidak Bisa");
		buttonGroupKonesi.add(rdbtnTidakBisa);
		rdbtnTidakBisa.setBounds(212, 356, 109, 23);
		add(rdbtnTidakBisa);
		
		JButton btnSimvan = new JButton("Simvan");
		btnSimvan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
	                Kenyamanan nam = new Kenyamanan();
	                Lingkungan is = new Lingkungan();
	               
	                nam.setKeBisingan(checkBoxBising.getText());
	                nam.setBau(checkBoxBau.getText());
	                nam.setBocor(checkBoxBocor.getText());
	                nam.setKeRusakan(checkBoxRusak.getText());
	                nam.setKeAusan(checkBoxAus.getText());
	                is.setKondisiLante(radioButtonLanteBaik.getText());
	                is.setKondisiLante(radioButtonLanteTidak.getText());
	                is.setKondisiDinding(radioButtonDinBaik.getText());
	                is.setKondisiDinding(radioButtonDinTidak.getText());
	                is.setKondisiAtap(radioButtonAtapBaik.getText());
	                is.setKondisiAtap(radioButtonAtapTidak.getText());
	                is.setKondisiJendela(radioButtoJenBaik.getText());
	                is.setKondisiJendela(radioButtonJenTidak.getText());
	                is.setKondisiPintu(radioButtonPintuBaik.getText());
	                is.setKondisiPintu(radioButtonPintuTidak.getText());
	                is.setHotspot(rdbtnAda.getText());
	                is.setHotspot(rdbtnTidakAda.getText());
	                is.setKonek(rdbtnBisa.getText());
	                is.setKonek(rdbtnTidakBisa.getText());
	               
	                nyaman.masukin(nam);
	                disi.masukin(is);
	               
	                JOptionPane.showMessageDialog(null, "Data Tersimpan");
	            } catch (SQLException ex) {
	                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
	            }
			}
		});
		btnSimvan.setBounds(233, 393, 152, 23);
		add(btnSimvan);
	}
}
