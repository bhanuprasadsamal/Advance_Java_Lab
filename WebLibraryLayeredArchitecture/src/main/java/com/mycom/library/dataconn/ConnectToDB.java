package com.mycom.library.dataconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	//New instance of connection
	private static Connection connection=null;
	public static Connection createConnection() throws ClassNotFoundException,
	SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//if error occure type the following code;
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql","root","T#9758@qlph");
		return connection;
	}
	public static void closeConnection() throws SQLException{
		connection.close();
	}

}
