package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaACInterf;
import venta.rista.task.err.mais.SaranaAC;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaACImpl implements SaranaACInterf{
	
	@Override
	public void masukin(SaranaAC aac) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into ac values (?,?,?,?,?)");
	    ps.setInt(1, aac.getJmlAC());
	    ps.setInt(2, aac.getKondisiAC());
	    ps.setString(3, aac.getStatusKonAC());
	    ps.setInt(4, aac.getPosisiAC());
	    ps.setString(5, aac.getStatusPosAC());
	    ps.executeUpdate();	
		
	}

	@Override
	public SaranaAC getSaranaAC() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from ac");
        SaranaAC ac = new SaranaAC();
        while(rs.next()){
            ac.setJmlAC(rs.getInt("JmlAC"));
            ac.setPosisiAC(rs.getInt("PosisiAC"));
            ac.setStatusKonAC(rs.getString("StatusKonAC"));
            ac.setKondisiAC(rs.getInt("KondisiAC"));
            ac.setStatusPosAC(rs.getString("StatusPosAC"));
        }
		return ac;
	}
}
