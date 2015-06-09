package venta.rista.task.goeys;

import java.sql.*;

import javax.swing.*;

public class sqliteConeken {
	
	public static Connection dbConnector(){
		Connection connek = null;
		try{
			Class.forName("org.sqlite.JDBC");
			connek = DriverManager.getConnection("jdbc:sqlite:Resources\\Rkelas.sqlite");
			JOptionPane.showMessageDialog(null,"Connection Succesful");
			return connek;
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}

}
