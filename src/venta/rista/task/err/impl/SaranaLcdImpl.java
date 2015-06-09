package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaLcdInterf;
import venta.rista.task.err.mais.SaranaLcd;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaLcdImpl implements SaranaLcdInterf {

	@Override
	public void masukin(SaranaLcd lcd) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Lcd values (?,?,?,?,?)");
	    ps.setInt(1, lcd.getJmlLcd());
	    ps.setInt(2, lcd.getKondisiLcd());
	    ps.setString(3, lcd.getStatusKonLcd());
	    ps.setInt(4, lcd.getPosisiLcd());
	    ps.setString(5, lcd.getStatusPosLcd());
	    ps.executeUpdate();		
	}

	@Override
	public SaranaLcd getSaranaLcd() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from Lcd");
        SaranaLcd lc=new SaranaLcd();
        while(rs.next()){
        	lc.setJmlLcd(rs.getInt("JmlLcd"));
            lc.setKondisiLcd(rs.getInt("KondisiLcd"));
            lc.setStatusKonLcd(rs.getString("StatusKonLcd"));
            lc.setPosisiLcd(rs.getInt("PosisiLcd"));
            lc.setStatusPosLcd(rs.getString("StatusPosLcd"));
        }
        return lc;
	}

}
