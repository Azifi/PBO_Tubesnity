package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Keamanan;
import venta.rista.task.err.mais.Kenyamanan;

public interface KeamananInterf {
	String masukin(Keamanan aman)throws SQLException; 

    Keamanan getKeamanan() throws SQLException;
}
