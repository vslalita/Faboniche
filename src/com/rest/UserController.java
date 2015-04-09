package com.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.services.UserService;

@Path("/user")
public class UserController {
    
	@POST
	@Path("/signUp")
	public void createUser(@FormParam("firstname") String firstName,@FormParam("lastname") String lastName,@FormParam("username") String userName,@FormParam("password") String password,@FormParam("role") String role){
		UserService signUpService=new UserService();
		if(signUpService.signUp(firstName, lastName, userName, password, role)){
			System.out.println("User Created");
		}
		else{
			System.out.println("User could not be Created");
		}
	}
	
}
