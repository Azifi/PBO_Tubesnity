package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Lingkungan;

public interface LingkunganInterf {
	void masukin(Lingkungan disi)throws SQLException;

    Lingkungan getLingkungan() throws SQLException;
}
