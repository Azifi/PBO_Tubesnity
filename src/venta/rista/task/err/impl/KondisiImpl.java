package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.KondisiInterf;
import venta.rista.task.err.mais.Kondisi;
import venta.rista.task.err.mais.Lingkungan;
import venta.rista.task.goeys.sqliteConeken;

public class KondisiImpl implements KondisiInterf {
	
	@Override
	public void masukin(Kondisi kond) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into kondisi values (?,?,?,?,?)");
	    ps.setInt(1, kond.getPanjang());
	    ps.setInt(2, kond.getLebar());
	    ps.setDouble(3, kond.getLuas());
	    ps.setDouble(4, kond.getRasio());
	    ps.setLong(5, kond.getJmlJendela());
	    ps.setLong(6, kond.getJmlKursi());
	    ps.setLong(7, kond.getJmlPintu());
	    ps.executeUpdate();
	}

	@Override
	public Kondisi getKondisi() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from kondisi");
        Kondisi ko=new Kondisi();
        while(rs.next()){
        	ko.setPanjang(rs.getInt("Panjang"));
        	ko.setLebar(rs.getInt("Lebar"));
        	ko.setJmlKursi(rs.getInt("Jumlah Kursi"));
        	ko.setJmlJendela(rs.getInt("Jumlah Jendela"));
        	ko.setJmlPintu(rs.getInt("Jumlah Pintu"));
        }
        return ko;
	}

}
