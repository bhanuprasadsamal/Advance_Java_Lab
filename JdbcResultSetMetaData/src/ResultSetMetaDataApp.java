import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataApp {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs =null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/company","root","T#9758@qlph");
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCount =rsmd.getColumnCount();
		System.out.println("Number of columns: "+colCount);
		System.out.println("Column details: ");
		
		for(int counter=1; counter<=colCount;counter++) {
			String colName = rsmd.getColumnName(counter);
			String colType =rsmd.getColumnTypeName(counter);
			System.out.println(colName+"is of type"+colType);
		}

		
	}
}
