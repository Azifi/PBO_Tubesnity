package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.KondisiInterf;
import venta.rista.task.err.mais.Kondisi;
import venta.rista.task.goeys.sqliteConeken;

public class KondisiImpl implements KondisiInterf {

	@Override
	public void masukin(Kondisi disi) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into kondisi values (?,?,?,?,?)");
	    ps.setString(1, disi.getKondisiLante());
	    ps.setString(2, disi.getKondisiDinding());
	    ps.setString(3, disi.getKondisiAtap());
	    ps.setString(4, disi.getKondisiJendela());
	    ps.setString(5, disi.getKondisiPintu());
	    ps.executeUpdate();
	}

	@Override
	public Kondisi getKondisi() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from kondisi");
        Kondisi is=new Kondisi();
        while(rs.next()){
            is.setKondisiLante(rs.getString("Lante"));
            is.setKondisiDinding(rs.getString("Dinding"));
            is.setKondisiAtap(rs.getString("Atap"));
            is.setKondisiJendela(rs.getString("Jendela"));
            is.setKondisiPintu(rs.getString("Pintu"));
        }
        return is;
	}
	
}
