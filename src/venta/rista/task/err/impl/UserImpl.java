package venta.rista.task.err.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta.rista.task.err.mais.User;
import venta.rista.task.err.interf.UserInterf;
import venta.rista.task.goeys.sqliteConeken;

public class UserImpl implements UserInterf {

	@Override
	public void masukin(User user) throws SQLException {
		PreparedStatement ps=sqliteConeken.dbConnector().prepareStatement("insert into Login values (?,?)");
	    ps.setString(1, user.getName());
	    ps.setString(2, user.getPass());
	    ps.executeUpdate();
	    
	}

	@Override
	public User getUser() throws SQLException {
		Statement st=sqliteConeken.dbConnector().createStatement();
        ResultSet rs=st.executeQuery("select *from Login");
        User us=new User();
        while(rs.next()){
            us.setName(rs.getString("nama"));
            us.setPass(rs.getString("password"));
        }
        return us;
	}

}
