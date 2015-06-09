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
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Kebersihan values (?,?,?,?)");
	    ps.setString(1, keb.getSirkulaUdara());
	    ps.setInt(2, keb.getNilaiCahaya());	    
	    ps.setInt(3, keb.getKeLembapan());
	    ps.setInt(4, keb.getSuhu());	    
	    ps.executeUpdate();
	}

	@Override
	public Kebersihan getKebersihan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Kebersihan");
        Kebersihan be=new Kebersihan();
        while(rs.next()){
        	be.setSirkulaUdara(rs.getString("Sirkula_Udara"));
        	be.setNilaiCahaya(rs.getInt("Nilai_cahaya"));
        	be.setKeLembapan(rs.getInt("Kelembapan"));
        	be.setSuhu(rs.getInt("Suhu"));        	
        }
        return be;
	}

}
