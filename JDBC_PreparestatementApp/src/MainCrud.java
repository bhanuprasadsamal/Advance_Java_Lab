import java.util.Scanner;
import java.text.ParseException;
import java.sql.SQLException;
public class MainCrud {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		CURD curd = new CURD();
		Scanner scnr = new Scanner(System.in);
		int rollNo;
		
		curd.establishConnection();
		curd.insertData();
		
	}
}
