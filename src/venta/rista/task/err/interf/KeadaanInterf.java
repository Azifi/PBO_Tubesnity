package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Keadaan;

public interface KeadaanInterf {
	
	void masukin(Keadaan adan)throws SQLException;

    Keadaan getKeadaan() throws SQLException;
}
