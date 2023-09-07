import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CURD {
	Connection connection;
	PreparedStatement pstmt;
	ResultSet rs;
	//1. Establish Connection
	public void establishConnection()throws SQLException, ClassNotFoundException{
		//Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		connection =
				DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql","root","T#9758@qlph");
		System.out.println("Connection Establish");
	}



// Insert data into book table
public void insertData()throws SQLException {
	int bookId;
	String bookname,author,dop;
	float price=0.0f;
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter the Book Id: ");
	bookId = scnr.nextInt();
	scnr.nextLine();
	System.out.println("Enter the Book Name: ");
	bookname=scnr.nextLine();
	System.out.println("Enter the Author name: ");
	author = scnr.nextLine();
	System.out.println("Enter the Price: ");
	price = scnr.nextFloat();
	scnr.nextLine();
	System.out.println("Enter the Date of Publication: ");
	dop=scnr.nextLine();
	pstmt=
			connection.prepareStatement(
					"insert into book(bookId,bookname,author,price,dop) values(?,?,?,?,?)");
	pstmt.setInt(1, bookId);
	pstmt.setString(2, bookname);
	pstmt.setString(3, author);
	pstmt.setFloat(4, price);
	pstmt.setString(5, dop);
	pstmt.executeUpdate();
	connection.close();
	System.out.println("Data has been inserted..");
	
	
	
	}
//Read data from student table
	public void updateData()throws SQLException{
		PreparedStatement pstmt;
		pstmt = connection.prepareStatement("Update book set price = pricr + price *0.10");
		pstmt.executeUpdate();
		System.out.println("Book price has been updated..");
	}
	
}