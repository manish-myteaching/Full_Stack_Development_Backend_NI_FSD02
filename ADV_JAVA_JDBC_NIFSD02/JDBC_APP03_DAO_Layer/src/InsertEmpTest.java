import com.barclays.dao.EmployeeDAO;
import com.barclays.dao.EmployeeDAOImpl;
import com.barclays.dto.Employee;

public class InsertEmpTest {

	public static void main(String[] args) {

		// Business Layer
		Employee emp = new Employee(1122, "SMITH", 44, 55555, "899899");

		// Persistance Layer
		//EmployeeDAO empDAO = new EmployeeDAOImpl();
		
		EmployeeDAO empDAO=EmployeeDAOImpl.getInstance();
		int i = empDAO.createEmployeeRecord(emp);
		System.out.println(i + "Record successfully");

	}

}
