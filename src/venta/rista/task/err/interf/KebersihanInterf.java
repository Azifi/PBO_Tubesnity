package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Kebersihan;

public interface KebersihanInterf {
	
	void masukin(Kebersihan keb) throws SQLException;

	Kebersihan getKebersihan() throws SQLException;

}
