package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaLampuInterf;
import venta.rista.task.err.mais.SaranaLampu;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaLampuImpl implements SaranaLampuInterf {

	@Override
	public void masukin(SaranaLampu alam) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Lampu values (?,?,?,?,?)");
	    ps.setInt(1, alam.getJmlLampu());
	    ps.setInt(2, alam.getKondisiLampu());
	    ps.setString(3, alam.getStatusKonLampu());
	    ps.setInt(4, alam.getPosisiLampu());
	    ps.setString(5, alam.getStatusPosLampu());
	    ps.executeUpdate();		
	}

	@Override
	public SaranaLampu getSaranaLampu() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Lampu");
        SaranaLampu amp=new SaranaLampu();
        while(rs.next()){
            amp.setJmlLampu(rs.getInt("JmlLampu"));
            amp.setKondisiLampu(rs.getInt("KondisiLampu"));
            amp.setStatusKonLampu(rs.getString("StatusLampu"));
            amp.setPosisiLampu(rs.getInt("PosisiLampu"));
            amp.setStatusPosLampu(rs.getString("StatusPosLampu"));
        }
        return amp;
	}

}
