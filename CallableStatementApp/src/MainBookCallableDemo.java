import java.sql.SQLException;
public class MainBookCallableDemo {
	public static void main(String[] args)throws SQLException {
		BookCallableStatementApp bcsa = new BookCallableStatementApp();
		bcsa.getBookDetails();
	}

}
