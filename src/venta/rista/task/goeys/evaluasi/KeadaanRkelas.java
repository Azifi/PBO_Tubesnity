package venta.rista.task.goeys.evaluasi;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


import venta.rista.task.err.impl.KeamananImpl;
import venta.rista.task.err.impl.KebersihanImpl;
import venta.rista.task.err.impl.KondisiImpl;

import venta.rista.task.err.interf.KeamananInterf;
import venta.rista.task.err.interf.KebersihanInterf;
import venta.rista.task.err.interf.KondisiInterf;

import venta.rista.task.err.mais.Keamanan;
import venta.rista.task.err.mais.Kebersihan;
import venta.rista.task.err.mais.Kondisi;



public class KeadaanRkelas extends JPanel {
	/**
	 * 
	 */
	private JTextField textFieldCahaya;
	private JTextField textFieldLembab;
	private JTextField textFieldSuhu;
	private JSlider sliderPanjang;
	private JTextField textFieldPanjang;
	private JSlider sliderLebar;
	private JTextField textFieldLebar;
	private JSpinner spinnerJmlKursi;
	private JSpinner spinnerJmlPintu;
	private JSpinner spinnerJmlJendela;
	private JSpinner spinnerkPintu;
	private JSpinner spinnerkJendela;
	private JRadioButton radioButtonLancar;
	private JRadioButton radioButtonTdkLancar;
	private JRadioButton radioButtonKokoh;
	private JRadioButton radioButtonTdkKokoh;
	private JSlider sliderCahaya;
	private JSlider sliderLembab;
	private JSlider sliderSuhu;
	private final ButtonGroup buttonGroupSirkulasi = new ButtonGroup();
	private final ButtonGroup buttonGroupKokoh = new ButtonGroup();
	KondisiInterf kond;
	KebersihanInterf keb;
	KeamananInterf aman;
	/**
	 * Create the panel.
	 */
	public KeadaanRkelas() {
		setLayout(null);
		kond = new KondisiImpl();
		keb = new KebersihanImpl();
		aman = new KeamananImpl();
		JLabel labelPanjang = new JLabel("Panjang Ruang");
		labelPanjang.setBounds(10, 22, 92, 14);
		add(labelPanjang);
		
		sliderPanjang = new JSlider();
		sliderPanjang.setValue(0);
		sliderPanjang.setPaintTicks(true);
		sliderPanjang.setPaintLabels(true);
		sliderPanjang.setBounds(10, 38, 98, 26);
		sliderPanjang.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				textFieldPanjang.setText(""+sliderPanjang.getValue());
			}
		});
		add(sliderPanjang);
		
		textFieldPanjang = new JTextField("0");
		textFieldPanjang.setColumns(10);
		textFieldPanjang.setBounds(110, 24, 36, 20);
		add(textFieldPanjang);
		
		JLabel labelmPanjang = new JLabel("meter");
		labelmPanjang.setBounds(153, 26, 36, 14);
		add(labelmPanjang);
		
		JLabel labelLebar = new JLabel("Lebar Ruang");
		labelLebar.setBounds(202, 22, 82, 14);
		add(labelLebar);
		
		sliderLebar = new JSlider();
		sliderLebar.setValue(0);
		sliderLebar.setPaintTicks(true);
		sliderLebar.setPaintLabels(true);
		sliderLebar.setBounds(196, 38, 92, 26);
		sliderLebar.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				textFieldLebar.setText(""+sliderLebar.getValue());
			}
		});
		add(sliderLebar);
		
		textFieldLebar = new JTextField("0");
		textFieldLebar.setColumns(10);
		textFieldLebar.setBounds(290, 24, 36, 20);
		add(textFieldLebar);
		
		JLabel labelmLebar = new JLabel("meter");
		labelmLebar.setBounds(334, 26, 36, 14);
		add(labelmLebar);
		
		JLabel labelJmlKursi = new JLabel("Jumlah Kursi");
		labelJmlKursi.setBounds(10, 67, 82, 14);
		add(labelJmlKursi);
		
		spinnerJmlKursi = new JSpinner();
		spinnerJmlKursi.setBounds(110, 64, 36, 20);
		add(spinnerJmlKursi);
		
		JLabel labelBuahKursi = new JLabel("buah");
		labelBuahKursi.setBounds(153, 67, 36, 14);
		add(labelBuahKursi);
		
		JLabel labelJmlPintu = new JLabel("Jumlah Pintu");
		labelJmlPintu.setBounds(10, 98, 82, 14);
		add(labelJmlPintu);
		
		spinnerJmlPintu = new JSpinner();
		spinnerJmlPintu.setBounds(110, 95, 36, 20);
		add(spinnerJmlPintu);
		
		JLabel labelBuahPintu = new JLabel("buah");
		labelBuahPintu.setBounds(153, 98, 36, 14);
		add(labelBuahPintu);
		
		JLabel labelJmlJendela = new JLabel("Jumlah Jendela");
		labelJmlJendela.setBounds(10, 130, 92, 14);
		add(labelJmlJendela);
		
		spinnerJmlJendela = new JSpinner();
		spinnerJmlJendela.setBounds(110, 127, 36, 20);
		add(spinnerJmlJendela);
		
		JLabel labelBuahJendela = new JLabel("buah");
		labelBuahJendela.setBounds(153, 130, 46, 14);
		add(labelBuahJendela);
		
		JLabel labelJmlKunci = new JLabel("Jumlah Kunci :");
		labelJmlKunci.setBounds(202, 67, 98, 14);
		add(labelJmlKunci);
		
		JLabel labelPintu = new JLabel("Pintu");
		labelPintu.setBounds(202, 98, 46, 14);
		add(labelPintu);
		
		spinnerkPintu = new JSpinner();
		spinnerkPintu.setBounds(248, 95, 36, 20);
		add(spinnerkPintu);
		
		JLabel labelKeyPintu = new JLabel("buah");
		labelKeyPintu.setBounds(296, 98, 30, 14);
		add(labelKeyPintu);
		
		JLabel labelJendela = new JLabel("Jendela");
		labelJendela.setBounds(202, 130, 46, 14);
		add(labelJendela);
		
		spinnerkJendela = new JSpinner();
		spinnerkJendela.setBounds(248, 127, 36, 20);
		add(spinnerkJendela);
		
		JLabel labelKeyJendela = new JLabel("buah");
		labelKeyJendela.setBounds(296, 130, 30, 14);
		add(labelKeyJendela);
		
		JSeparator separatorKondisi = new JSeparator();
		separatorKondisi.setBounds(0, 162, 422, 8);
		add(separatorKondisi);
		
		JLabel labelSirkulasi = new JLabel("Sirkulasi Udara");
		labelSirkulasi.setBounds(10, 178, 106, 14);
		add(labelSirkulasi);
		
		radioButtonLancar = new JRadioButton("Lancar");
		radioButtonLancar.setBounds(100, 174, 67, 23);
		buttonGroupSirkulasi.add(radioButtonLancar);
		add(radioButtonLancar);
		
		radioButtonTdkLancar = new JRadioButton("Tidak Lancar");
		buttonGroupSirkulasi.add(radioButtonTdkLancar);
		radioButtonTdkLancar.setBounds(169, 174, 109, 23);
		add(radioButtonTdkLancar);
		
		JLabel labelCahaya = new JLabel("Pencahayaan");
		labelCahaya.setBounds(10, 215, 82, 14);
		add(labelCahaya);
		
		sliderCahaya = new JSlider();
		sliderCahaya.setMaximum(400);
		sliderCahaya.setPaintTicks(true);
		sliderCahaya.setPaintLabels(true);
		sliderCahaya.setBounds(3, 240, 183, 26);
		sliderCahaya.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				textFieldCahaya.setText(""+sliderCahaya.getValue());
			}
		});
		
		textFieldCahaya = new JTextField("0");
		textFieldCahaya.setColumns(10);
		textFieldCahaya.setBounds(95, 212, 36, 20);
		add(textFieldCahaya);
		add(sliderCahaya);
		
		JLabel labelLembab = new JLabel("Kelembapan");
		labelLembab.setBounds(10, 269, 82, 14);
		add(labelLembab);
		
		textFieldLembab = new JTextField("0");
		textFieldLembab.setColumns(10);
		textFieldLembab.setBounds(95, 266, 36, 20);
		add(textFieldLembab);
		
		sliderLembab = new JSlider();
		sliderLembab.setPaintTicks(true);
		sliderLembab.setPaintLabels(true);
		sliderLembab.setBounds(3, 294, 183, 26);
		sliderLembab.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				textFieldLembab.setText(""+sliderLembab.getValue());
			}
		});
		add(sliderLembab);
		
		JLabel labelSuhu = new JLabel("Suhu Udara");
		labelSuhu.setBounds(10, 324, 73, 14);
		add(labelSuhu);
		
		textFieldSuhu = new JTextField();
		textFieldSuhu.setText("0");
		textFieldSuhu.setColumns(10);
		textFieldSuhu.setBounds(95, 321, 36, 20);
		add(textFieldSuhu);
		
		sliderSuhu = new JSlider();
		sliderSuhu.setPaintTicks(true);
		sliderSuhu.setPaintLabels(true);
		sliderSuhu.setBounds(3, 349, 183, 26);
		sliderSuhu.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				textFieldSuhu.setText(""+sliderSuhu.getValue());
			}
		});
		add(sliderSuhu);
		
		JSeparator separatorSuasana = new JSeparator();
		separatorSuasana.setBounds(0, 385, 422, 8);
		add(separatorSuasana);
		
		radioButtonKokoh = new JRadioButton("Kokoh");
		buttonGroupKokoh.add(radioButtonKokoh);
		radioButtonKokoh.setBounds(196, 352, 67, 23);
		add(radioButtonKokoh);
		
		radioButtonTdkKokoh = new JRadioButton("Tidak Kokoh");
		buttonGroupKokoh.add(radioButtonTdkKokoh);
		radioButtonTdkKokoh.setBounds(265, 352, 109, 23);
		add(radioButtonTdkKokoh);
		
		JLabel labelKokoh = new JLabel("Tingkat Kekokohan");
		labelKokoh.setBounds(196, 331, 130, 14);
		add(labelKokoh);
		
		JCheckBox checkBoxBendaGantung = new JCheckBox("Ada benda menggantung diatap");
		checkBoxBendaGantung.setBounds(197, 301, 213, 23);
		add(checkBoxBendaGantung);
		
		JCheckBox checkBoxBendaTajam = new JCheckBox("Ada benda tajam");
		checkBoxBendaTajam.setBounds(196, 275, 126, 23);
		add(checkBoxBendaTajam);
		
		JLabel lblYangMembahayakan = new JLabel("yang membahayakan");
		lblYangMembahayakan.setBounds(218, 257, 126, 14);
		add(lblYangMembahayakan);
		
		JCheckBox chckbxAdaKabelListrik = new JCheckBox("Ada kabel listrik");
		chckbxAdaKabelListrik.setBounds(196, 236, 126, 23);
		add(chckbxAdaKabelListrik);
		
		JLabel labelBahaya = new JLabel("Tiangkat Kebahayaan");
		labelBahaya.setBounds(196, 215, 136, 14);
		add(labelBahaya);
		
		JSeparator separatorKeamanan = new JSeparator();
		separatorKeamanan.setOrientation(SwingConstants.VERTICAL);
		separatorKeamanan.setBounds(190, 204, 9, 183);
		add(separatorKeamanan);
		
		JButton btnSimvan = new JButton("Simvan");
		btnSimvan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
	                Kondisi ko = new Kondisi();
	                Keamanan ke = new Keamanan();
	                Kebersihan be = new Kebersihan();
	                ko.setPanjang((int) sliderPanjang.getValue());
	                ko.setLebar((int) sliderLebar.getValue());
	                ko.setJmlKursi((int) spinnerJmlKursi.getValue());
	                ko.setJmlPintu((int) spinnerJmlPintu.getValue());
	                ko.setJmlJendela((int) spinnerJmlJendela.getValue());
	                ke.setKunciPintu((int) spinnerkPintu.getValue());
	                ke.setKunciJendela((int) spinnerkJendela.getValue());
	                ke.setKeKokohan( radioButtonKokoh.getText());
	                ke.setKeKokohan( radioButtonTdkKokoh.getName());
	                be.setSirkulaUdara(radioButtonLancar.getText());
	                be.setSirkulaUdara(radioButtonTdkLancar.getText());
	                be.setNilaiCahaya((int) sliderCahaya.getValue());
	                be.setKeLembapan((int) sliderLembab.getValue());
	                be.setSuhu((int) sliderSuhu.getValue());
	                
	                kond.masukin(ko);
	                aman.masukin(ke);
	                keb.masukin(be);
	                JOptionPane.showMessageDialog(null, "Data Tersimpan");
	            } catch (SQLException ex) {
	            	JOptionPane.showMessageDialog(null, ex);
	            }
			}
		});
		btnSimvan.setBounds(233, 395, 152, 23);
		add(btnSimvan);

	}
}
