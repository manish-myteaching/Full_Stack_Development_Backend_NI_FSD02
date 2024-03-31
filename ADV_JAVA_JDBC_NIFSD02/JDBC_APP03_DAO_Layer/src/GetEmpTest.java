import com.barclays.dao.EmployeeDAO;
import com.barclays.dao.EmployeeDAOImpl;
import com.barclays.dto.Employee;

public class GetEmpTest {

	public static void main(String[] args) {
		//EmployeeDAO empDAO = new EmployeeDAOImpl();
		
		EmployeeDAO empDAO=EmployeeDAOImpl.getInstance();
		
		Employee emp = empDAO.getEmployeeRecord(104);
		System.out.println(emp);

	}

}
