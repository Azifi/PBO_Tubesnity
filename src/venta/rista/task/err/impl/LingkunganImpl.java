package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.LingkunganInterf;
import venta.rista.task.err.mais.Lingkungan;
import venta.rista.task.goeys.sqliteConeken;

public class LingkunganImpl implements LingkunganInterf {

	@Override
	public void masukin(Lingkungan disi) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Lingkungan values (?,?,?,?,?,?,?)");
	    ps.setString(1, disi.getKondisiLante());
	    ps.setString(2, disi.getKondisiDinding());
	    ps.setString(3, disi.getKondisiAtap());
	    ps.setString(4, disi.getKondisiJendela());
	    ps.setString(5, disi.getKondisiPintu());
	    ps.setString(6, disi.getHotspot());
	    ps.setString(7, disi.getKonek());
	    ps.executeUpdate();
	}

	@Override
	public Lingkungan getLingkungan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from Lingkungan");
        Lingkungan is=new Lingkungan();
        while(rs.next()){
            is.setKondisiLante(rs.getString("Lante"));
            is.setKondisiDinding(rs.getString("Dinding"));
            is.setKondisiAtap(rs.getString("Atap"));
            is.setKondisiJendela(rs.getString("Jendela"));
            is.setKondisiPintu(rs.getString("Pintu"));
            is.setHotspot(rs.getString("Hotspot"));
            is.setKonek(rs.getString("Konek"));
        }
        return is;
	}
	
}
