package venta.rista.task.goeys.Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import venta.rista.task.err.impl.UserImpl;
import venta.rista.task.err.interf.UserInterf;
import venta.rista.task.err.mais.User;

public class PanelLovin extends JPanel {
	
	/**
	 * 
	 */
	private JTextField textFieldUser;
	private JButton buttonLogin;
	private JPasswordField passwordField;
	UserInterf user;

	/**
	 * Create the panel.
	 */
	public PanelLovin() {
		setLayout(null);
		user = new UserImpl();
		JLabel labelPerintah = new JLabel("Silahkan Login Dahulu");
		labelPerintah.setBounds(68, 104, 138, 19);
		add(labelPerintah);
		labelPerintah.setBackground(Color.LIGHT_GRAY);
		labelPerintah.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel labelUser = new JLabel("User Name ");
		labelUser.setBounds(147, 180, 70, 14);
		add(labelUser);
		
		textFieldUser = new JTextField();
		textFieldUser.setColumns(10);
		textFieldUser.setBounds(227, 177, 137, 20);
		add(textFieldUser);
		
		JLabel labelPass = new JLabel("Password");
		labelPass.setBounds(147, 211, 70, 14);
		add(labelPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 208, 137, 20);
		add(passwordField);
		
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
						
						
					}catch(SQLException ex){
						//Logger.getLogger(PanelLovin.class.getName()).log(Level.SEVERE, null, ex);
						ex.printStackTrace();
					}
				}
			                
		});
		add(buttonLogin);
	}

}
