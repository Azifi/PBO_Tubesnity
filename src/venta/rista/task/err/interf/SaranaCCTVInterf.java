package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.SaranaAC;
import venta.rista.task.err.mais.SaranaCCTV;

public interface SaranaCCTVInterf {
	void masukin(SaranaCCTV ctv)throws SQLException;

    SaranaCCTV getSaranaCCTV() throws SQLException;
}
