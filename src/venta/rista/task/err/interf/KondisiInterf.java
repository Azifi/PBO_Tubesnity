package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Kondisi;

public interface KondisiInterf {
	String masukin(Kondisi kond) throws SQLException;

	Kondisi getKondisi() throws SQLException;
}
