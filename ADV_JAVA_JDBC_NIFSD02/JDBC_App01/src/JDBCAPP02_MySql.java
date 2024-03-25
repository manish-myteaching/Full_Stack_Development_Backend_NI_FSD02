import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCAPP02_MySql {

	public static void main(String[] args) throws Exception {

		// step1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded successfully..!");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");
		System.out.println("Establish the connection");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPL");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
		}

		con.close();
		System.out.println("close the connection");

	}

}
