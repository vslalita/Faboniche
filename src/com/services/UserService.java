package com.services;

import com.dao.ClientDAOImpl;
import com.dao.StylistDAOImpl;
import com.dao.UserDAOImpl;
import com.model.User;

public class UserService {

	public void login(String userName,String password){
		
	}
	
	public boolean signUp(String firstName,String lastName,String userName,String password, String role){
		User user=new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setRole(role);
		user.setUserName(userName);
		user.setPassword(password);
		UserDAOImpl createUser=new UserDAOImpl();
		if(createUser.create(user)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public void getAppointments(int id){
		
	}
	
}