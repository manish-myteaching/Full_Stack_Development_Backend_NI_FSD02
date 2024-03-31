import com.barclays.dao.EmployeeDAO;
import com.barclays.dao.EmployeeDAOImpl;
import com.barclays.dto.Employee;

public class UpdateEmpTest {

	public static void main(String[] args) {

		// Business Layer
		Employee emp = new Employee(105, "", 0, 0, "69000");

		// Persistance Layer
		// EmployeeDAO empDAO = new EmployeeDAOImpl();

		EmployeeDAO empDAO = EmployeeDAOImpl.getInstance();

		int i = empDAO.updateEmployeeRecord(emp);
		System.out.println(i + "Record Update successfully");

	}

}
