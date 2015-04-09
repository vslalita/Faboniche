

import java.sql.*;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {

	private static Connection conn;
	private static DatabaseConnection  databaseInstance=null;
	private DatabaseConnection(){
	}

	public static DatabaseConnection getDatabaseConnectionInstance(){
		if(databaseInstance==null){
			databaseInstance=new DatabaseConnection();
			return databaseInstance;
		}
		else{
			return databaseInstance;
		}
	}

	public static  Connection connectionRequest(){
		getDatabaseConnectionInstance();
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "faboric_development";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root"; 
		String password = "sridatta";

		if(conn!=null){
			return conn;
		}
		else{
			try { 
				Class.forName(driver).newInstance(); 
				conn = (Connection) DriverManager.getConnection(url+dbName,userName,password); 
				return conn;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}