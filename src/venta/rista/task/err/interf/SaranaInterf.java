package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Sarana;

public interface SaranaInterf {
	void masukin(Sarana rana)throws SQLException;

    Sarana getSarana() throws SQLException;

}
