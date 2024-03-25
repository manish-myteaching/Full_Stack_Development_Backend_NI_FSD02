import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCAPP01_Oracle {

	public static void main(String[] args) throws Exception {

		// step1 load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully..!");

		// step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
		System.out.println("Establish the connection");
        System.out.println(con);
		
		System.out.println("Perform the operation with DB");
		// step3 create the statement object
		Statement stmt = con.createStatement();
		System.out.println(stmt);
		
		// step4 execute query
		ResultSet rs = stmt.executeQuery("select * from emp");
		System.out.println(rs);
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));

		System.out.println("Close the connection");
		// step5 close the connection object
		rs.close();
		con.close();
	
	}

}
