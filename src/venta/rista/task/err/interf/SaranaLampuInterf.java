package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.SaranaLampu;

public interface SaranaLampuInterf {
	
	void masukin(SaranaLampu alam)throws SQLException;

    SaranaLampu getSaranaLampu() throws SQLException;

}
