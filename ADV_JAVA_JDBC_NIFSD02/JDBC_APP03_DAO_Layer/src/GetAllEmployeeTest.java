import java.util.List;

import com.barclays.dao.EmployeeDAO;
import com.barclays.dao.EmployeeDAOImpl;
import com.barclays.dto.Employee;

public class GetAllEmployeeTest {

	public static void main(String[] args) {
		// Persistance Layer
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		List<Employee> list = empDAO.getEmployeeRecord();
		list.stream().map(e -> {
			int k = -2;
			if (e.getSalary() != null && e.getSalary().length() > 10) {
				k = -3;
			} else {
				if (e.getSalary() != null) {
					k = Integer.parseInt(e.getSalary()) + 5000;
				}
			}
			return k;
		}).forEach(System.out::println);

	}

}
