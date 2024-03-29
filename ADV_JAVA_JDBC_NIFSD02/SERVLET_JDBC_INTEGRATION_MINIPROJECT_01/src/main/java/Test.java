import com.congnizant.dao.LoginDAO;
import com.congnizant.dao.LoginDAOImpl;

public class Test {
	public static void main(String[] args) {
		LoginDAO ld = LoginDAOImpl.getInstace();
		boolean b = ld.getLogin("mani", "1234");
		System.out.println(b);
	}

}
