package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaStekerInterf;
import venta.rista.task.err.mais.SaranaSteker;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaStekerImpl implements SaranaStekerInterf {

	@Override
	public void masukin(SaranaSteker stek) throws SQLException {
			PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Stop_Kontak values (?,?,?,?,?)");
		    ps.setInt(1, stek.getJmlSteker());
		    ps.setInt(2, stek.getKondisiSteker());
		    ps.setString(3, stek.getStatusKonSteker());
		    ps.setInt(4, stek.getPosisiSteker());
		    ps.setString(5, stek.getStatusPosSteker());
		    ps.executeUpdate();		
	}

	@Override
	public SaranaSteker getSaranaSteker() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Stop_kontak");
        SaranaSteker ker=new SaranaSteker();
        while(rs.next()){
            ker.setJmlSteker(rs.getInt("JmlSteker"));
            ker.setKondisiSteker(rs.getInt("KondisiSteker"));
            ker.setStatusKonSteker(rs.getString("StatusKonSteker"));
            ker.setPosisiSteker(rs.getInt("PosisiSteker"));
            ker.setStatusPosSteker(rs.getString("StatusPosSteker"));
        }
        return ker;
	}
	
}
