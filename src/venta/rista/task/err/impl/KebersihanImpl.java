package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.KebersihanInterf;
import venta.rista.task.err.mais.Kebersihan;
import venta.rista.task.goeys.sqliteConeken;

public class KebersihanImpl implements KebersihanInterf{
	
	@Override
	public void masukin(Kebersihan keb) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into kondisi values (?,?,?,?,?)");
	    ps.setString(1, keb.getSirkulaUdara());
	    ps.setInt(2, keb.getNilaiCahaya());	    
	    ps.setInt(3, keb.getKeLembapan());
	    ps.setInt(4, keb.getSuhu());	    
	    ps.executeUpdate();
	}

	@Override
	public Kebersihan getKebersihan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from Kebersihan");
        Kebersihan ke=new Kebersihan();
        while(rs.next()){
        	ke.setSirkulaUdara(rs.getString("Sirkulasi Udara"));
        	ke.setNilaiCahaya(rs.getInt("Nilai cahaya"));
        	ke.setKeLembapan(rs.getInt("Kelembapan"));
        	ke.setSuhu(rs.getInt("Suhu"));        	
        }
        return ke;
	}

}
