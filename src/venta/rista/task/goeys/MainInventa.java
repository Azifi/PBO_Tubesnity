package venta.rista.task.goeys;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

import venta.rista.task.err.mais.User;
import venta.rista.task.err.impl.UserImpl;
import venta.rista.task.err.interf.UserInterf;
import venta.rista.task.goeys.Login.PanelLovin;
import venta.rista.task.goeys.evaluasi.KeadaanRkelas;
import venta.rista.task.goeys.evaluasi.PropertiRkelas;
import venta.rista.task.goeys.evaluasi.SuasanaRkelas;
import venta.rista.task.goeys.identitas.TampilinID;

public class MainInventa {

	private JFrame frame;
	private JPanel panelMainApp;
	private PanelLovin panelLogin;
	private JPanel panelTampilin;
	private JPanel panelMenu;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInventa window = new MainInventa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connek = null;
	/**
	 * Create the application.
	 * @return 
	 */
	
	public MainInventa() {
		connek = sqliteConeken.dbConnector();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 547, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelLogin = new PanelLovin();
		frame.getContentPane().add(panelLogin, "name_135487267649658");
		panelLogin.setLayout(null);
	
		panelMainApp = new JPanel();
		frame.getContentPane().add(panelMainApp, "name_10643962787157");
		panelMainApp.setLayout(null);
		
		JPanel panelButton = new JPanel();
		panelButton.setBounds(0, 0, 98, 484);
		panelMainApp.add(panelButton);
		panelButton.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelLogin.add(panelMenu);
				panelTampilin.add(panelMenu);
				panelMenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 0, 98, 121);
		panelButton.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.removeAll();
				
				panelMenu.add(panelTampilin);
				panelTampilin.setVisible(true);
			}
		});
		button.setBounds(0, 121, 98, 121);
		panelButton.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(0, 242, 98, 121);
		panelButton.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(0, 363, 98, 121);
		panelButton.add(button_2);
		
		JPanel panelTempat = new JPanel();
		panelTempat.setBounds(98, 0, 433, 484);
		panelMainApp.add(panelTempat);
		panelTempat.setLayout(new CardLayout(0, 0));
		
		panelMenu = new JPanel();
		panelTempat.add(panelMenu, "name_11857961537891");
		panelMenu.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 432, 533);
		panelMenu.add(tabbedPane);
		
		TampilinID panelID = new TampilinID();
		tabbedPane.addTab("Identitas", null, panelID, null);
		panelID.setLayout(null);
		
		
		
		JPanel panelEva = new JPanel();
		tabbedPane.addTab("Evaluasi Mutu Ruang Kelas", null, panelEva, null);
		panelEva.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane_1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane_1.setBounds(0, 0, 427, 456);
		panelEva.add(tabbedPane_1);
		
		KeadaanRkelas panelKeadaan = new KeadaanRkelas();
		tabbedPane_1.addTab("Keadaan Ruang Kelas", null, panelKeadaan, null);
		panelKeadaan.setLayout(null);
		
		JPanel panelSarana = new JPanel();
		tabbedPane_1.addTab("Sarana Ruang Kelas", null, panelSarana, null);
		panelSarana.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 422, 428);
		panelSarana.add(scrollPane);
		
		PropertiRkelas Rollin = new PropertiRkelas();
		Rollin.setPreferredSize(new Dimension(421, 745));
		scrollPane.setViewportView(Rollin);
		
		SuasanaRkelas panelSuasana = new SuasanaRkelas();
		tabbedPane_1.addTab("Suasana Ruang Kelas", null, panelSuasana, null);
		panelSuasana.setLayout(null);
		
		
		/*FrameEva1 rolling = new FrameEva1();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 10, 394, 431);
		
		scrollPane.setViewportView(rolling);*/
		
		panelTampilin = new JPanel();
		panelTempat.add(panelTampilin, "name_11861392386947");
		
		JPanel panel_5 = new JPanel();
		panelTempat.add(panel_5, "name_11863648448253");
	}
}
