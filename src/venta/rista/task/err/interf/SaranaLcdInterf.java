package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.SaranaLcd;

public interface SaranaLcdInterf {
	void masukin(SaranaLcd lcd)throws SQLException;

    SaranaLcd getSaranaLcd() throws SQLException;
}
