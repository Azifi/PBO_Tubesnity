package venta.rista.task.goeys.evaluasi;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;













import venta.rista.task.err.impl.SaranaACImpl;
import venta.rista.task.err.impl.SaranaCCTVImpl;
import venta.rista.task.err.impl.SaranaKipasAnginImpl;
import venta.rista.task.err.impl.SaranaLampuImpl;
import venta.rista.task.err.impl.SaranaLcdImpl;
import venta.rista.task.err.impl.SaranaStekerImpl;


import venta.rista.task.err.interf.SaranaACInterf;
import venta.rista.task.err.interf.SaranaCCTVInterf;
import venta.rista.task.err.interf.SaranaKipasAnginInterf;
import venta.rista.task.err.interf.SaranaLampuInterf;
import venta.rista.task.err.interf.SaranaLcdInterf;
import venta.rista.task.err.interf.SaranaStekerInterf;
import venta.rista.task.err.mais.SaranaAC;
import venta.rista.task.err.mais.SaranaCCTV;
import venta.rista.task.err.mais.SaranaKipasAngin;
import venta.rista.task.err.mais.SaranaLampu;
import venta.rista.task.err.mais.SaranaLcd;
import venta.rista.task.err.mais.SaranaSteker;

public class PropertiRkelas extends JPanel {
	private JSpinner spinnerJmlSteker;
	private JSpinner spinnerKonSteker;
	private JSpinner spinnerPoSteker;
	private JSpinner spinnerJmlLcd;
	private JSpinner spinnerKonLcd;
	private JSpinner spinnerPosLcd;
	private JSpinner spinnerJmlLampu;
	private JSpinner spinnerKonLampu;
	private JSpinner spinnerPosLampu;
	private JLabel lblJumlahKipasAngin;
	private JSpinner spinnerJmlKipas;
	private JSpinner spinnerKonKipas;
	private JSpinner spinnerPosKipas;
	private JSpinner spinnerJmlAc;
	private JSpinner spinnerPosAc;
	private JSpinner spinnerKonAc;
	
	private JSpinner spinnerJmlCctv;
	private JSpinner spinnerKonCctv;
	private JSpinner spinnerPosCctv;
	
	private JComboBox<String> comboBoxPosSteker;
	private JComboBox<String> comboBoxKonSteker;
	private JComboBox comboBoxPosLcd;
	private JComboBox<String> comboBoxKonLcd;
	private JComboBox comboBoxPosLampu;
	private JComboBox comboBoxKonLampu;
	private JComboBox comboBoxKonKipas;
	private JComboBox<String> comboBoxPosKipas;
	private JComboBox comboBoxKonAc;
	private JComboBox comboBoxPosAc;
	private JComboBox comboBoxKonCctv;
	private JComboBox comboBoxPosCctv;
	
	SaranaStekerInterf stek;
	SaranaLampuInterf alam;
	SaranaLcdInterf lcd;
	SaranaACInterf aac;
	SaranaKipasAnginInterf kip;
	SaranaCCTVInterf ctv;

	/**
	 * Create the panel.
	 */
	public PropertiRkelas() {
		setLayout(null);
		stek = new SaranaStekerImpl();
		alam = new SaranaLampuImpl();
		lcd = new SaranaLcdImpl();
		aac = new SaranaACImpl();
		kip = new SaranaKipasAnginImpl();
		ctv = new SaranaCCTVImpl();
		
		JLabel lblJumlahStopKontak = new JLabel("Jumlah Stop Kontak");
		lblJumlahStopKontak.setBounds(10, 34, 117, 14);
		add(lblJumlahStopKontak);
		
		spinnerJmlSteker = new JSpinner();
		spinnerJmlSteker.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerJmlSteker.setBounds(124, 31, 39, 20);
		add(spinnerJmlSteker);
		
		JLabel lblKondisi = new JLabel("Kondisi");
		lblKondisi.setBounds(182, 34, 53, 14);
		add(lblKondisi);
		
		spinnerKonSteker = new JSpinner();
		spinnerKonSteker.setBounds(238, 31, 39, 20);
		add(spinnerKonSteker);
		
		comboBoxKonSteker = new JComboBox<String>();
		comboBoxKonSteker.setModel(new DefaultComboBoxModel<String>(new String[] {"Normal", "Rusak"}));
		comboBoxKonSteker.setBounds(295, 31, 70, 20);
		add(comboBoxKonSteker);
		
		JLabel lblPosisi = new JLabel("Posisi");
		lblPosisi.setBounds(182, 65, 53, 14);
		add(lblPosisi);
		
		spinnerPoSteker = new JSpinner();
		spinnerPoSteker.setBounds(238, 62, 39, 20);
		add(spinnerPoSteker);
		
		comboBoxPosSteker = new JComboBox<String>();
		comboBoxPosSteker.setModel(new DefaultComboBoxModel<String>(new String[] {"Pojok", "Dekat Dosen"}));
		comboBoxPosSteker.setBounds(295, 62, 70, 20);
		add(comboBoxPosSteker);
		
		JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD");
		lblJumlahKabelLcd.setBounds(10, 106, 117, 14);
		add(lblJumlahKabelLcd);
		
		spinnerJmlLcd = new JSpinner();
		spinnerJmlLcd.setBounds(124, 103, 39, 20);
		add(spinnerJmlLcd);
		
		JLabel labelKonLcd = new JLabel("Kondisi");
		labelKonLcd.setBounds(182, 106, 53, 14);
		add(labelKonLcd);
		
		spinnerKonLcd = new JSpinner();
		spinnerKonLcd.setBounds(238, 103, 39, 20);
		add(spinnerKonLcd);
		
		comboBoxKonLcd = new JComboBox<String>();
		comboBoxKonLcd.setModel(new DefaultComboBoxModel<String>(new String[] {"Normal", "Rusak"}));
		comboBoxKonLcd.setBounds(295, 103, 70, 20);
		add(comboBoxKonLcd);
		
		JLabel labelPosLcd = new JLabel("Posisi");
		labelPosLcd.setBounds(182, 137, 53, 14);
		add(labelPosLcd);
		
		spinnerPosLcd = new JSpinner();
		spinnerPosLcd.setBounds(238, 134, 39, 20);
		add(spinnerPosLcd);
		
		comboBoxPosLcd = new JComboBox();
		comboBoxPosLcd.setModel(new DefaultComboBoxModel(new String[] {"Dekat Dosen", "Lainnya"}));
		comboBoxPosLcd.setBounds(295, 134, 70, 20);
		add(comboBoxPosLcd);
		
		JLabel lblJumlahLampu = new JLabel("Jumlah Lampu");
		lblJumlahLampu.setBounds(10, 179, 117, 14);
		add(lblJumlahLampu);
		
		spinnerJmlLampu = new JSpinner();
		spinnerJmlLampu.setBounds(124, 176, 39, 20);
		add(spinnerJmlLampu);
		
		JLabel labelKonLampu = new JLabel("Kondisi");
		labelKonLampu.setBounds(182, 179, 53, 14);
		add(labelKonLampu);
		
		spinnerKonLampu = new JSpinner();
		spinnerKonLampu.setBounds(238, 175, 39, 20);
		add(spinnerKonLampu);
		
		comboBoxKonLampu = new JComboBox();
		comboBoxKonLampu.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Rusak"}));
		comboBoxKonLampu.setBounds(295, 176, 70, 20);
		add(comboBoxKonLampu);
		
		JLabel labelPosisiLampu = new JLabel("Posisi");
		labelPosisiLampu.setBounds(182, 210, 53, 14);
		add(labelPosisiLampu);
		
		spinnerPosLampu = new JSpinner();
		spinnerPosLampu.setBounds(238, 207, 39, 20);
		add(spinnerPosLampu);
		
		comboBoxPosLampu = new JComboBox();
		comboBoxPosLampu.setModel(new DefaultComboBoxModel(new String[] {"Atap Ruang", "Lainnya"}));
		comboBoxPosLampu.setBounds(295, 207, 70, 20);
		add(comboBoxPosLampu);
		
		lblJumlahKipasAngin = new JLabel("Jumlah Kipas Angin");
		lblJumlahKipasAngin.setBounds(10, 249, 117, 14);
		add(lblJumlahKipasAngin);
		
		spinnerJmlKipas = new JSpinner();
		spinnerJmlKipas.setBounds(124, 246, 39, 20);
		add(spinnerJmlKipas);
		
		JLabel labelKondisiKipas = new JLabel("Kondisi");
		labelKondisiKipas.setBounds(182, 249, 53, 14);
		add(labelKondisiKipas);
		
		spinnerKonKipas = new JSpinner();
		spinnerKonKipas.setBounds(238, 246, 39, 20);
		add(spinnerKonKipas);
		
		comboBoxKonKipas = new JComboBox();
		comboBoxKonKipas.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Rusak"}));
		comboBoxKonKipas.setBounds(295, 246, 70, 20);
		add(comboBoxKonKipas);
		
		JLabel labelPosisiKipas = new JLabel("Posisi");
		labelPosisiKipas.setBounds(182, 280, 53, 14);
		add(labelPosisiKipas);
		
		spinnerPosKipas = new JSpinner();
		spinnerPosKipas.setBounds(238, 277, 39, 20);
		add(spinnerPosKipas);
		
		comboBoxPosKipas = new JComboBox<String>();
		comboBoxPosKipas.setModel(new DefaultComboBoxModel<String>(new String[] {"Atap Ruangan"}));
		comboBoxPosKipas.setBounds(295, 277, 70, 20);
		add(comboBoxPosKipas);
		
		JLabel lblJumlahAc = new JLabel("Jumlah AC");
		lblJumlahAc.setBounds(10, 321, 117, 14);
		add(lblJumlahAc);
		
		spinnerJmlAc = new JSpinner();
		spinnerJmlAc.setBounds(124, 318, 39, 20);
		add(spinnerJmlAc);
		
		JLabel labelKondisiAc = new JLabel("Kondisi");
		labelKondisiAc.setBounds(182, 321, 53, 14);
		add(labelKondisiAc);
		
		spinnerKonAc = new JSpinner();
		spinnerKonAc.setBounds(238, 318, 39, 20);
		add(spinnerKonAc);
		
		comboBoxKonAc = new JComboBox();
		comboBoxKonAc.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Rusak"}));
		comboBoxKonAc.setBounds(295, 318, 70, 20);
		add(comboBoxKonAc);
		
		JLabel labelPosisiAc = new JLabel("Posisi");
		labelPosisiAc.setBounds(182, 352, 53, 14);
		add(labelPosisiAc);
		
		spinnerPosAc = new JSpinner();
		spinnerPosAc.setBounds(238, 349, 39, 20);
		add(spinnerPosAc);
		
		comboBoxPosAc = new JComboBox();
		comboBoxPosAc.setModel(new DefaultComboBoxModel(new String[] {"Belakang/Samping", "Lainnya"}));
		comboBoxPosAc.setBounds(295, 349, 70, 20);
		add(comboBoxPosAc);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV");
		lblJumlahCctv.setBounds(10, 393, 117, 14);
		add(lblJumlahCctv);
		
		spinnerJmlCctv = new JSpinner();
		spinnerJmlCctv.setBounds(124, 390, 39, 20);
		add(spinnerJmlCctv);
		
		JLabel labelKondisiCctv = new JLabel("Kondisi");
		labelKondisiCctv.setBounds(182, 393, 53, 14);
		add(labelKondisiCctv);
		
		spinnerKonCctv = new JSpinner();
		spinnerKonCctv.setBounds(238, 390, 39, 20);
		add(spinnerKonCctv);
		
		comboBoxKonCctv = new JComboBox();
		comboBoxKonCctv.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Rusak"}));
		comboBoxKonCctv.setBounds(295, 390, 70, 20);
		add(comboBoxKonCctv);
		
		JLabel labelPosisiCctv = new JLabel("Posisi");
		labelPosisiCctv.setBounds(182, 424, 53, 14);
		add(labelPosisiCctv);
		
		spinnerPosCctv = new JSpinner();
		spinnerPosCctv.setBounds(238, 421, 39, 20);
		add(spinnerPosCctv);
		
		comboBoxPosCctv = new JComboBox();
		comboBoxPosCctv.setModel(new DefaultComboBoxModel(new String[] {"Belakang/Depan", "Lainnya"}));
		comboBoxPosCctv.setBounds(295, 421, 70, 20);
		add(comboBoxPosCctv);
		
		JButton buttonSimvan = new JButton("Simvan");
		buttonSimvan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
	                SaranaSteker ker = new SaranaSteker();
	                SaranaLampu amp = new SaranaLampu();
	                SaranaLcd lc = new SaranaLcd();
	                SaranaAC ac = new SaranaAC();
	                SaranaCCTV tv = new SaranaCCTV();
	                SaranaKipasAngin ip = new SaranaKipasAngin();
	                ker.setJmlSteker((int) spinnerJmlSteker.getValue());
	                ker.setPosisiSteker((int) spinnerPoSteker.getValue());
	                ker.setStatusKonSteker((String) comboBoxPosSteker.getSelectedItem());
	                ker.setKondisiSteker((int) spinnerKonSteker.getValue());
	                ker.setStatusKonSteker((String) comboBoxKonSteker.getSelectedItem());
	                amp.setJmlLampu((int) spinnerJmlLampu.getValue());
	                amp.setKondisiLampu((int) spinnerKonLampu.getValue());
	                amp.setStatusKonLampu((String) comboBoxKonLampu.getSelectedItem());
	                amp.setPosisiLampu((int) spinnerPosLampu.getValue());
	                amp.setStatusPosLampu((String) comboBoxPosLampu.getSelectedItem());
	                lc.setJmlLcd((int) spinnerJmlLcd.getValue());
	                lc.setKondisiLcd((int) spinnerKonLcd.getValue());
	                lc.setStatusKonLcd((String) comboBoxKonLcd.getSelectedItem());
	                lc.setPosisiLcd((int) spinnerPosLcd.getValue());
	                lc.setStatusPosLcd((String) comboBoxPosLcd.getSelectedItem());
	                ac.setJmlAC((int) spinnerJmlAc.getValue());
	                ac.setKondisiAC((int) spinnerKonAc.getValue());
	                ac.setStatusKonAC((String) comboBoxKonAc.getSelectedItem());
	                ac.setPosisiAC((int) spinnerPosAc.getValue());
	                ac.setStatusPosAC((String) comboBoxPosAc.getSelectedItem());
	                tv.setJmlCCTV((int) spinnerJmlCctv.getValue());
	                tv.setKondisiCCTV((int) spinnerKonCctv.getValue());
	                tv.setStatusKonCCTV((String) comboBoxKonCctv.getSelectedItem());
	                tv.setPosisiCCTV((int) spinnerPosCctv.getValue());
	                tv.setStatusPosCCTV((String) comboBoxPosCctv.getSelectedItem());
	                ip.setJmlKipas((int) spinnerJmlKipas.getValue());
	                ip.setKondisiKipas((int) spinnerKonKipas.getValue());
	                ip.setStatusKonKipas((String) comboBoxKonKipas.getSelectedItem());
	                ip.setPosisiKipas((int) spinnerPosKipas.getValue());
	                ip.setStatusPosKipas((String) comboBoxPosKipas.getSelectedItem());
	                stek.masukin(ker);
	                alam.masukin(amp);
	                lcd.masukin(lc);
	                aac.masukin(ac);
	                ctv.masukin(tv);
	                kip.masukin(ip);
	                JOptionPane.showMessageDialog(null, "Data Tersimpan");
	            } catch (SQLException ex) {
	                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
	            }
			}
				
			
		});
		buttonSimvan.setBounds(152, 486, 152, 23);
		add(buttonSimvan);
		
	}
}
