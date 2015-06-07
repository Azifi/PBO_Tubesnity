package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Identifi;


public interface IdentifiInterf {
	
	void masukin(Identifi iden)throws SQLException;

    Identifi getIdentifi() throws SQLException;

}
