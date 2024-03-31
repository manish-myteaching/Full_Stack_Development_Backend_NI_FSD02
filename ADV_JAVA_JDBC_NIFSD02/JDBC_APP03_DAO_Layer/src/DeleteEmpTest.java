import com.barclays.dao.EmployeeDAO;
import com.barclays.dao.EmployeeDAOImpl;

public class DeleteEmpTest {

	public static void main(String[] args) {

		// Persistance Layer
		//EmployeeDAO empDAO = new EmployeeDAOImpl();
		
		EmployeeDAO empDAO = EmployeeDAOImpl.getInstance();	
		int i = empDAO.deleteEmployeeRecord(106);
		System.out.println(i + "Record Delete  successfully");

	}

}
