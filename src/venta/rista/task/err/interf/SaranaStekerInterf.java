package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.SaranaSteker;

public interface SaranaStekerInterf {
	
	void masukin(SaranaSteker stek)throws SQLException;

    SaranaSteker getSaranaSteker() throws SQLException;
}
