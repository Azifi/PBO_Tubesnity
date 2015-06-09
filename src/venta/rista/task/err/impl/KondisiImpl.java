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
	public String masukin(Kondisi kond) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Kondisi values (?,?,?,?,?,?,?)");
	    ps.setInt(1, kond.getPanjang());
	    ps.setInt(2, kond.getLebar());
	    ps.setInt(3, kond.getLuas());
	    ps.setInt(4, kond.getRasio());
	    ps.setInt(5, kond.getJmlKursi());
	    ps.setInt(6, kond.getJmlJendela());
	    ps.setInt(7, kond.getJmlPintu());
	    ps.executeUpdate();
		return null;
	}

	@Override
	public Kondisi getKondisi() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Kondisi");
        Kondisi ko=new Kondisi();
        while(rs.next()){
        	ko.setPanjang(rs.getInt("Panjang"));
        	ko.setLebar(rs.getInt("Lebar"));
        	ko.setLuas(rs.getInt("Luas"));
        	ko.setRasio(rs.getInt("Rasio"));
        	ko.setJmlKursi(rs.getInt("Kursi"));
        	ko.setJmlJendela(rs.getInt("Jendela"));
        	ko.setJmlPintu(rs.getInt("Pintu"));
        }
        return ko;
	}
	
}
