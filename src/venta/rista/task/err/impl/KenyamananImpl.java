package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.IdentifiInterf;
import venta.rista.task.err.interf.KenyamananInterf;
import venta.rista.task.err.mais.Identifi;
import venta.rista.task.err.mais.Kenyamanan;
import venta.rista.task.goeys.sqliteConeken;

public class KenyamananImpl implements KenyamananInterf{
	
	@Override
	public void masukin(Kenyamanan nyaman) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into inventaris values (?,?,?,?,?)");
	    ps.setString(1, nyaman.getKeBisingan());
	    ps.setString(2, nyaman.getBau());
	    ps.setString(3, nyaman.getBocor());
	    ps.setString(4, nyaman.getKeRusakan());
	    ps.setString(5, nyaman.getKeAusan());
	    ps.executeUpdate();
		
	}

	@Override
	public Kenyamanan getKenyamanan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from kenyamanan");
        Kenyamanan id=new Kenyamanan();
        while(rs.next()){
            id.setKeBisingan(rs.getString("Kebisingan"));
            id.setBau(rs.getString("Bau"));
            id.setBocor(rs.getString("Bocor"));
            id.setKeRusakan(rs.getString("Kerusakan"));
            id.setKeAusan(rs.getString("AUS"));
        }
        return id;
	}

}
