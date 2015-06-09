package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaKipasAnginInterf;
import venta.rista.task.err.mais.SaranaKipasAngin;
import venta.rista.task.err.mais.SaranaSteker;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaKipasAnginImpl implements SaranaKipasAnginInterf{
	
	
	@Override
	public void masukin(SaranaKipasAngin kip) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into kipas_angin values (?,?,?,?,?)");
	    ps.setInt(1, kip.getJmlKipas());
	    ps.setInt(2, kip.getKondisiKipas());
	    ps.setString(3, kip.getStatusKonKipas());
	    ps.setInt(4, kip.getPosisiKipas());
	    ps.setString(5, kip.getStatusPosKipas());
	    ps.executeUpdate();	
		
	}

	@Override
	public SaranaKipasAngin getSaranaKipas() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from kipas_angin");
        SaranaKipasAngin ip = new SaranaKipasAngin();
        while(rs.next()){
            ip.setJmlKipas(rs.getInt("JmlKipas"));
            ip.setPosisiKipas(rs.getInt("PosisiKipas"));
            ip.setStatusKonKipas(rs.getString("StatusKonKipas"));
            ip.setKondisiKipas(rs.getInt("KondisiKipas"));
            ip.setStatusPosKipas(rs.getString("StatusPosKipas"));
        }
		return ip;
	}

}
