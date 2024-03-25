import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class INSERTDemo {

	public static void main(String[] args) throws Exception {

		// step1 load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully..!");

		// step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
		System.out.println("Establish the connection");

		System.out.println("Perform the operation with DB");
		// step3 create the statement object
		Statement stmt = con.createStatement();
	

		String query = "INSERT INTO " + "EMP (ID,NAME,AGE,Aadhar)" + "VALUES (111,'Sourabh',36,555566)";
		// step4 execute query
		int res = stmt.executeUpdate(query);
		System.out.println(res + " Record insert succesfully");

		System.out.println("Close the connection");
		// step5 close the connection object
		con.close();
	}

}
