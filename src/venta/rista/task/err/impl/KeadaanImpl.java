package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.KeadaanInterf;
import venta.rista.task.err.mais.Identifi;
import venta.rista.task.err.mais.Keadaan;
import venta.rista.task.goeys.sqliteConeken;

public class KeadaanImpl implements KeadaanInterf {

	@Override
	public void masukin(Keadaan adan) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Keadaan values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	    ps.setInt(1, adan.getPanjang());
	    ps.setInt(2, adan.getLebar());
	    ps.setInt(3, adan.getJmlKursi());
	    ps.setInt(4, adan.getJmlJendela());
	    ps.setInt(5, adan.getKunciPintu());
	    ps.setInt(6, adan.getKunciJendela());
	    ps.setString(7, adan.getSirkulaUdara());
	    ps.setInt(8, adan.getNilaiCahaya());
	    ps.setInt(9, adan.getKeLembapan());
	    ps.setInt(10, adan.getSuhu());
	    ps.setString(11, adan.getBahaya());
	    ps.setString(12, adan.getKeKokohan());
	    ps.setInt(13, adan.getLuas());
	    ps.setInt(14, adan.getRasio());
	    ps.executeUpdate();
		
	}

	@Override
	public Keadaan getKeadaan() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Keadaan");
        Keadaan ad=new Keadaan();
        while(rs.next()){
            ad.setPanjang(rs.getInt("Panjang"));
            ad.setLebar(rs.getInt("lebar"));
            ad.setJmlKursi(rs.getInt("Kursi"));
            ad.setJmlJendela(rs.getInt("Jendela"));
            ad.setKunciPintu(rs.getInt("Kunci_Pintu"));
            ad.setKunciJendela(rs.getInt("Kuncu_Jendela"));
            ad.setSirkulaUdara(rs.getString("Sirkula_Udara"));
            ad.setNilaiCahaya(rs.getInt("Cahaya"));
            ad.setKeLembapan(rs.getInt("Lembab"));
            ad.setSuhu(rs.getInt("Suhu"));
            ad.setBahaya(rs.getString("Bahaya"));
            ad.setKeKokohan(rs.getString("Kokoh"));
            ad.setLuas(rs.getInt("Luas"));
            ad.setRasio(rs.getInt("Rasio"));
        }
        return ad;
	}
	
}
