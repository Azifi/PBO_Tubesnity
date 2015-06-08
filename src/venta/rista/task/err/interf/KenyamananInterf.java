package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.Kenyamanan;

public interface KenyamananInterf {
	void masukin(Kenyamanan nyaman)throws SQLException; 

     Kenyamanan getKenyamanan() throws SQLException;
}
