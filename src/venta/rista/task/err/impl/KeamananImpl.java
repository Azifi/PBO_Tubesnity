package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.KeamananInterf;
import venta.rista.task.err.mais.Keamanan;
import venta.rista.task.goeys.sqliteConeken;

public class KeamananImpl implements KeamananInterf{
	
	@Override
	public String masukin(Keamanan aman) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into keamanan values (?,?,?,?)");
		ps.setInt(1, aman.getKunciJendela());
		ps.setInt(2, aman.getKunciPintu());
	    ps.setString(3, aman.getKeKokohan());	   
	    ps.setString(4, aman.getBahaya());
	    ps.executeUpdate();
		return null;
		
	}

	@Override
	public Keamanan getKeamanan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from keamanan");
        Keamanan ke=new Keamanan();
        while(rs.next()){
            ke.setKunciJendela(rs.getInt("Kunci_Jendela"));
            ke.setKunciPintu(rs.getInt("Kunci_Pintu"));
            ke.setKeKokohan(rs.getString("kokoh"));
            ke.setBahaya(rs.getString("Bahaya"));
           
        }
        return ke;
	}
}
