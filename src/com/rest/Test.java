package com.rest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.database.DatabaseConnection;



@Path("/test1")
public class Test{

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getStylists() {
		try {
			Statement s=DatabaseConnection.connectionRequest().createStatement();
			String sql="Select * from users";
			ResultSet rs=s.executeQuery(sql);
			if(rs.next()){
				System.out.println("Has next");
			}
			else{
				System.out.println("Has No Next");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text="Hello Jersey Testing";
		String l="<html> " + "<title>" + text + "</title>"
				+ "<body><h1>" + text + "</body></h1>" + "</html> ";
		int x=10;
		return l;
	}
}
