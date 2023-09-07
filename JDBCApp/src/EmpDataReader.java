import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmpDataReader {
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		Connection connection =null;
		Statement stmt = null;
		ResultSet rs = null;
		//1. Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Establish the connection
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/company","root","T#9758@qlph");
		//3. Create a statement Object
		stmt = connection.createStatement();
		System.out.println("Statement created");
		//4. Create a ResultSet Object
		rs= stmt.executeQuery("Select empno,ename,job from emp");
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			System.out.println(empno + "\t" +ename +"\t"+job);
		}// ends of while
		connection.close();
		
	}

}
