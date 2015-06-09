package venta.rista.task.err.interf;

import java.sql.SQLException;

import venta.rista.task.err.mais.SaranaKipasAngin;
import venta.rista.task.err.mais.SaranaSteker;

public interface SaranaKipasAnginInterf {
	
	void masukin(SaranaKipasAngin kip)throws SQLException;

    SaranaKipasAngin getSaranaKipas() throws SQLException;
}
