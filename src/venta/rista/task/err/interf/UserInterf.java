package venta.rista.task.err.interf;

import java.sql.SQLException;
import venta.rista.task.err.mais.User;

public interface UserInterf {
	
	void masukin(User user)throws SQLException;

    User getUser() throws SQLException;
}
