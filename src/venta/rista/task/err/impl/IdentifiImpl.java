package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.IdentifiInterf;
import venta.rista.task.err.mais.Identifi;
import venta.rista.task.goeys.sqliteConeken;

public class IdentifiImpl implements IdentifiInterf {

	@Override
	public void masukin(Identifi iden) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into inventaris values (?,?,?,?,?)");
	    ps.setString(1, iden.getNamaruang());
	    ps.setString(2, iden.getLokasi());
	    ps.setString(3, iden.getGedung());
	    ps.setString(4, iden.getFakultas());
	    ps.setString(5, iden.getProdi());
	    ps.executeUpdate();
		
	}

	@Override
	public Identifi getIdentifi() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from inventaris");
        Identifi id=new Identifi();
        while(rs.next()){
            id.setNamaruang(rs.getString("Ruang"));
            id.setLokasi(rs.getString("Lokasi"));
            id.setGedung(rs.getString("Gedung"));
            id.setFakultas(rs.getString("Fakultas"));
            id.setProdi(rs.getString("Prodi"));
        }
        return id;
	}

}
