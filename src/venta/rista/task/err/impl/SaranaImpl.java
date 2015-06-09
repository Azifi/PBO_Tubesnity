package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.interf.SaranaInterf;
import venta.rista.task.err.mais.Sarana;
import venta.rista.task.goeys.sqliteConeken;

public class SaranaImpl implements SaranaInterf {

	@Override
	public void masukin(Sarana rana) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Stop_Kontak values (?,?,?,?,?)");
	    ps.setInt(1, rana.getJmlSteker());
	    ps.setInt(2, rana.getJmlKabelLCD());
	    ps.setInt(3, rana.getJmlLampu());
	    ps.setInt(4, rana.getJmlKipas());
	    ps.setInt(5, rana.getJmlAC());
	    ps.setInt(6, rana.getJmlCCTV());
	    
	    ps.executeUpdate();
		
	}

	@Override
	public Sarana getSarana() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select * from sarana");
        Sarana na=new Sarana();
        while(rs.next()){
            na.setJmlSteker(rs.getInt("Steker"));
            na.setJmlKabelLCD(rs.getInt("LCD"));
            na.setJmlLampu(rs.getInt("Lampu"));
            na.setJmlKipas(rs.getInt("Kipas"));
            na.setJmlAC(rs.getInt("AC"));
            na.setJmlCCTV(rs.getInt("CCTV"));
        }
        return na;
	}

}
