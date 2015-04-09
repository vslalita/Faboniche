package com.dao;

import java.sql.SQLException;
import java.sql.Statement;

import com.database.DatabaseConnection;
import com.model.Model;
import com.model.User;

public class UserDAOImpl {

	public Model get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean create(User user) {
		// TODO Auto-generated method stub
		try {
			Statement createStatement=DatabaseConnection.connectionRequest().createStatement();
			String insertQuery="Insert into users (first_name,last_name,username,password,role) "
					+ "         values ('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getUserName()+"','"+user.getPassword()+"','"+user.getRole()+"')";
			int userCreationResult=createStatement.executeUpdate(insertQuery);
			if(userCreationResult>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
