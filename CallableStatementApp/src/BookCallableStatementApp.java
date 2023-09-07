import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
public class BookCallableStatementApp {
	public static void getBookDetails()throws SQLException{
		String query = "{call display_book()}";
		ResultSet rs;
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql","root","T#9758@qlph");
		try {
			CallableStatement stmt = conn.prepareCall(query);   
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Book Id: "+ rs.getInt("bookId")+"\t\t");
				//System.out.println(rs.getInt(1)+"\t\t");
				System.out.println("Book name: "+rs.getString("bookname")+"\t\t");
				//System.out.println(rs.getString(2)+"\t\t");
				System.out.println("Book Author: "+rs.getString("author")+"\t\t");
				//System.out.println(rs.getString(3)+"\t\t");
				System.out.println("Book Price: "+rs.getFloat("price")+"\t\t");
				//System.out.println(rs.getFloat(4)+"\t\t");
			}
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			conn.close();
		}
	}

}
