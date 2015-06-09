package venta.rista.task.goeys;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import net.proteanit.sql.DbUtils;
import venta.rista.task.err.impl.UserImpl;
import venta.rista.task.err.interf.UserInterf;
import venta.rista.task.err.mais.User;
import venta.rista.task.goeys.Login.PanelLovin;
import venta.rista.task.goeys.evaluasi.KeadaanRkelas;
import venta.rista.task.goeys.evaluasi.PropertiRkelas;
import venta.rista.task.goeys.evaluasi.SuasanaRkelas;
import venta.rista.task.goeys.identitas.TampilinID;

public class MainInventa {

	private JFrame frame;
	private JPanel panelMainApp;
	private JPanel panelLogin;
	private JPanel panelTampilin;
	private JPanel panelMenu;
	private JPanel panelData;
	private JTextField textFieldUser;
	private JButton buttonLogin;
	private JPasswordField passwordField;
	private JTextField textFieldNamaRuang;
	private JTable tableIdentitas;
	UserInterf user;
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
	private TampilinID panelID;
	private JTable tableKeadaan;
	private JTable tableKebersihan;
	private JTable tableKeamanan;
	private JTable tableSteker;
	private JTable tableLcd;
	private JTable tableLampu;
	private JTable tableKipas;
	private JTable tableAc;
	private JTable tableCctv;
	/**
	 * Create the application.
	 * @return 
	 */
	
	public MainInventa() {
		connek = sqliteConeken.dbConnector();
		user = new UserImpl();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 536, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelLogin = new JPanel();
		frame.getContentPane().add(panelLogin, "name_135487267649658");
		panelLogin.setLayout(null);
		JLabel labelPerintah = new JLabel("Silahkan Login Dahulu");
		labelPerintah.setBounds(68, 104, 138, 19);
		panelLogin.add(labelPerintah);
		labelPerintah.setBackground(Color.LIGHT_GRAY);
		labelPerintah.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel labelUser = new JLabel("User Name ");
		labelUser.setBounds(147, 180, 70, 14);
		panelLogin.add(labelUser);
		
		textFieldUser = new JTextField();
		textFieldUser.setColumns(10);
		textFieldUser.setBounds(227, 177, 137, 20);
		panelLogin.add(textFieldUser);
		
		JLabel labelPass = new JLabel("Password");
		labelPass.setBounds(147, 211, 70, 14);
		panelLogin.add(labelPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 208, 137, 20);
		panelLogin.add(passwordField);
		
		buttonLogin = new JButton("LOGIN");
		buttonLogin.setBounds(253, 264, 89, 23);
		buttonLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
					try{
						User us = new User();
		                us.setName(textFieldUser.getText());
					    us.setPass(passwordField.getText());
		                user.masukin(us);
		                textFieldUser.setText("");
		                passwordField.setText("");
		                textFieldUser.requestFocus();
		                buttonLogin.setText("Login");
						JOptionPane.showMessageDialog(null, "username dan password salah, coba lagi");
						panelLogin.removeAll();
						
						panelLogin.add(panelMainApp);
						panelMainApp.setVisible(true);
						
					}catch(SQLException ex){
						//Logger.getLogger(PanelLovin.class.getName()).log(Level.SEVERE, null, ex);
						ex.printStackTrace();
					}
				}
			                
		});
		panelLogin.add(buttonLogin);
	
		panelMainApp = new JPanel();
		frame.getContentPane().add(panelMainApp, "name_10643962787157");
		panelMainApp.setLayout(null);
		
		JPanel panelButton = new JPanel();
		panelButton.setBounds(0, 0, 98, 484);
		panelMainApp.add(panelButton);
		panelButton.setLayout(null);
		
		JButton btnNewButton = new JButton("Isi Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(true);
				panelTampilin.setVisible(false);
				panelData.setVisible(false);
			}
		});
		btnNewButton.setBounds(0, 0, 98, 121);
		panelButton.add(btnNewButton);
		
		JButton btnTampil = new JButton("Data");
		btnTampil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelTampilin.setVisible(true);
				panelMenu.setVisible(false);
				panelData.setVisible(false);
			}
		});
		btnTampil.setBounds(0, 121, 98, 121);
		panelButton.add(btnTampil);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panelData.setVisible(true);
				panelTampilin.setVisible(false);
				panelMenu.setVisible(false);
			}
		});
		btnEdit.setBounds(0, 242, 98, 121);
		panelButton.add(btnEdit);
		
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnKeluar.setBounds(0, 363, 98, 121);
		panelButton.add(btnKeluar);
		
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
		
		panelID = new TampilinID();
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
		Rollin.setPreferredSize(new Dimension(421, 537));
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
		
		panelData = new JPanel();
		panelTempat.add(panelData, "name_11863648448253");
		panelData.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 433, 484);
		panelData.add(tabbedPane_2);
		
		JPanel panel = new JPanel();
		tabbedPane_2.addTab("Identitas", null, panel, null);
		panel.setLayout(null);
		
		JButton button = new JButton("Load Identitas Data");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from inventaris";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		button.setBounds(10, 11, 127, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Edit");
		button_1.setBounds(146, 11, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Hapus");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
		        	String sql = "delete from inventaris where Ruang =?'"+textFieldNamaRuang.getText()+"' ";
		        	PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
		            JOptionPane.showMessageDialog(null, "Deleted");
		        } catch (Exception e) {
		            JOptionPane.showMessageDialog(null, e);
		        }
			}
		});
		button_2.setBounds(250, 11, 89, 23);
		panel.add(button_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 45, 408, 400);
		panel.add(scrollPane_1);
		
		tableIdentitas = new JTable();
		scrollPane_1.setViewportView(tableIdentitas);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_2.addTab("Keadaan Ruang Kelas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane_3.setBounds(10, 45, 408, 400);
		panel_1.add(tabbedPane_3);
		
		tableKeadaan = new JTable();
		tabbedPane_3.addTab("Data 1", null, tableKeadaan, null);
		
		tableKebersihan = new JTable();
		tabbedPane_3.addTab("Data 2", null, tableKebersihan, null);
		
		tableKeamanan = new JTable();
		tabbedPane_3.addTab("Data 3", null, tableKeamanan, null);
		
		JButton button_3 = new JButton("Load Data 1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from Keadaan";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableKeadaan.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		button_3.setBounds(10, 11, 127, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Load Data 2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from Kebersihan";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableKebersihan.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		button_4.setBounds(152, 11, 127, 23);
		panel_1.add(button_4);
		
		JButton btnLoadData = new JButton("Load Data 3");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from keamanan";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableKeamanan.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		btnLoadData.setBounds(291, 11, 127, 23);
		panel_1.add(btnLoadData);
		
		JPanel panelProperties = new JPanel();
		tabbedPane_2.addTab("Sarana Ruang Kelas", null, panelProperties, null);
		panelProperties.setLayout(null);
		
		JButton button_6 = new JButton("Load Data 1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from Stop_Kontak";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableSteker.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		button_6.setBounds(10, 11, 127, 23);
		panelProperties.add(button_6);
		
		JButton btnLoadData_1 = new JButton("Load Data 2");
		btnLoadData_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from Lcd";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableLcd.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		btnLoadData_1.setBounds(152, 11, 127, 23);
		panelProperties.add(btnLoadData_1);
		
		JButton btnLoadData_2 = new JButton("Load Data 3");
		btnLoadData_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from Lampu";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableLampu.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		btnLoadData_2.setBounds(291, 11, 127, 23);
		panelProperties.add(btnLoadData_2);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane_4.setBounds(10, 75, 408, 370);
		panelProperties.add(tabbedPane_4);
		
		tableSteker = new JTable();
		tabbedPane_4.addTab("Data 1", null, tableSteker, null);
		
		tableLcd = new JTable();
		tabbedPane_4.addTab("Data 2", null, tableLcd, null);
		
		tableLampu = new JTable();
		tabbedPane_4.addTab("Data 3", null, tableLampu, null);
		
		tableKipas = new JTable();
		tabbedPane_4.addTab("Data 4", null, tableKipas, null);
		
		tableAc = new JTable();
		tabbedPane_4.addTab("Data 5", null, tableAc, null);
		
		tableCctv = new JTable();
		tabbedPane_4.addTab("Data 6", null, tableCctv, null);
		
		JButton btnLoadData_3 = new JButton("Load Data 4");
		btnLoadData_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from kipas_angin";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableKipas.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		btnLoadData_3.setBounds(10, 44, 127, 23);
		panelProperties.add(btnLoadData_3);
		
		JButton btnLoadData_4 = new JButton("Load Data 5");
		btnLoadData_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from ac";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableAc.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		btnLoadData_4.setBounds(152, 44, 127, 23);
		panelProperties.add(btnLoadData_4);
		
		JButton btnLoadData_5 = new JButton("Load Data 6");
		btnLoadData_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			        String sql = "select * from Cctv";
			        PreparedStatement pst = connek.prepareStatement(sql);
			        ResultSet rs = pst.executeQuery();
			        
			        tableCctv.setModel(DbUtils.resultSetToTableModel(rs));
			        
			    } catch (Exception e) {
			        JOptionPane.showMessageDialog(null, e);   
			    }
			}
		});
		btnLoadData_5.setBounds(291, 44, 127, 23);
		panelProperties.add(btnLoadData_5);
	}
}
