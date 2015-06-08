package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.KeamananInterf;
import venta.rista.task.err.mais.Keamanan;
import venta.rista.task.err.mais.Kenyamanan;
import venta.rista.task.goeys.sqliteConeken;

public class KeamananImpl implements KeamananInterf{
	
	@Override
	public void masukin(Keamanan aman) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into inventaris values (?,?,?,?)");
	    ps.setString(1, aman.getKeKokohan());
	    ps.setInt(2, aman.getKunciJendela());
	    ps.setInt(3, aman.getKunciPintu());
	    ps.setString(4, aman.getBahaya());
	    ps.executeUpdate();
		
	}

	@Override
	public Keamanan getKeamanan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from kenyamanan");
        Keamanan id=new Keamanan();
        while(rs.next()){
            id.setKeKokohan(rs.getString("Kekokohan"));
            id.setKunciJendela(rs.getInt("Kunci Jendela"));
            id.setKunciPintu(rs.getInt("Kunci Pintu"));
            id.setBahaya(rs.getString("Bahaya"));
           
        }
        return id;
	}
}
