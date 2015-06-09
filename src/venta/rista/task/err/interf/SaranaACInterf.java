package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.SaranaAC;

public interface SaranaACInterf {
	void masukin(SaranaAC aac)throws SQLException;

    SaranaAC getSaranaAC() throws SQLException;
}
