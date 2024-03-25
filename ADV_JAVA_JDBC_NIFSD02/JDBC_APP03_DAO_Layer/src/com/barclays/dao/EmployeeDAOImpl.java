package com.barclays.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.barclays.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int createEmployeeRecord(Employee employee) {
		int id = employee.getEmpId();
		String name = employee.getEmpName();
		int age = employee.getAge();
		int aadhar = employee.getAadha();
		String salary = employee.getSalary();
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully..!");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
			System.out.println("Establish the connection");

			System.out.println("Perform the operation with DB");
			// step3 create the statement object
			Statement stmt = con.createStatement();

			String query = "INSERT INTO " + "EMP (ID,NAME,AGE,AADHAR,SALARY)" + "VALUES (" + id + "," + "'" + name + "'"
					+ "," + age + "," + aadhar + "," + salary + ")";
			System.out.println(query);
			// step4 execute query
			int res = stmt.executeUpdate(query);
			System.out.println(res + " Record insert succesfully");

			System.out.println("Close the connection");
			// step5 close the connection object
			con.close();
			return res;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteEmployeeRecord(int id) {
		int res = 0;
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully..!");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
			System.out.println("Establish the connection");

			System.out.println("Perform the operation with DB");
			// step3 create the statement object
			Statement stmt = con.createStatement();
			String query = "DELETE  EMP WHERE ID=" + id;
			System.out.println(query);
			// step4 execute query
			res = stmt.executeUpdate(query);
			System.out.println(res + " Record delete succesfully");

			System.out.println("Close the connection");
			// step5 close the connection object
			con.close();
			return res;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateEmployeeRecord(Employee employee) {
		int id = employee.getEmpId();
		String salary = employee.getSalary();
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully..!");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
			System.out.println("Establish the connection");
			System.out.println("Perform the operation with DB");
			// step3 create the statement object
			Statement stmt = con.createStatement();

			String query = "UPDATE  EMP SET SALARY =" + "'" + salary + "'" + " WHERE ID=" + id;
			System.out.println(query);
			// step4 execute query
			// int res = stmt.executeUpdate(query);
			int rs = stmt.executeUpdate(query);
			System.out.println(rs + " Record Updated succesfully");

			System.out.println("Close the connection");
			// step5 close the connection object
			con.close();
			return rs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Employee getEmployeeRecord(int id) {
		Employee emp = null;
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully..!");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
			System.out.println("Establish the connection");
			System.out.println("Perform the operation with DB");
			// step3 create the statement object
			Statement stmt = con.createStatement();

			String query = "SELECT *  FROM EMP WHERE ID=" + id;
			System.out.println(query);
			// step4 execute query
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				Integer id1 = rs.getInt("ID");
				String name = rs.getString("NAME");
				Integer age = rs.getInt("AGE");
				Integer aadhar = rs.getInt("AADHAR");
				String salary = rs.getString("SALARY");
				emp = new Employee(id1, name, age, aadhar, salary);
			} else {
				System.out.println("No Record Found");
			}

			System.out.println("Close the connection");
			// step5 close the connection object
			rs.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> getEmployeeRecord() {

		List<Employee> listEmployee = new ArrayList<>();
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully..!");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "manish", "manish");
			System.out.println("Establish the connection");
			System.out.println("Perform the operation with DB");
			// step3 create the statement object
			Statement stmt = con.createStatement();

			String query = "SELECT *  FROM EMP";
			System.out.println(query);
			// step4 execute query
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Integer id = rs.getInt("ID");
				String name = rs.getString("NAME");
				Integer age = rs.getInt("AGE");
				Integer aadhar = rs.getInt("AADHAR");
				String salary = rs.getString("SALARY");
				Employee emp = new Employee(id, name, age, aadhar, salary);
				listEmployee.add(emp);
			}

			System.out.println("Close the connection");
			// step5 close the connection object
			rs.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEmployee;
	}

}
