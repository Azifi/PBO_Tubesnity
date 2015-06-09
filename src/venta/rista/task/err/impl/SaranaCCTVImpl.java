package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaCCTVInterf;
import venta.rista.task.err.mais.SaranaCCTV;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaCCTVImpl implements SaranaCCTVInterf{
	
	@Override
	public void masukin(SaranaCCTV ctv) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Cctv values (?,?,?,?,?)");
	    ps.setInt(1, ctv.getJmlCCTV());
	    ps.setInt(2, ctv.getKondisiCCTV());
	    ps.setString(3, ctv.getStatusKonCCTV());
	    ps.setInt(4, ctv.getPosisiCCTV());
	    ps.setString(5, ctv.getStatusPosCCTV());
	    ps.executeUpdate();	
		
	}

	@Override
	public SaranaCCTV getSaranaCCTV() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Cctv");
        SaranaCCTV tv = new SaranaCCTV();
        while(rs.next()){
            tv.setJmlCCTV(rs.getInt("JmlCCTV"));
            tv.setPosisiCCTV(rs.getInt("PosisiCCTV"));
            tv.setStatusKonCCTV(rs.getString("StatusKonCCTV"));
            tv.setKondisiCCTV(rs.getInt("KondisiCCTV"));
            tv.setStatusPosCCTV(rs.getString("StatusPosCCTV"));
        }
		return tv;
	}
}
