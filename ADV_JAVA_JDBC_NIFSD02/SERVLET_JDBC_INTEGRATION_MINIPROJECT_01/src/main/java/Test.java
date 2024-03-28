import com.congnizant.dao.LoginDAO;
import com.congnizant.dao.LoginDAOImpl;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginDAO ld = LoginDAOImpl.getInstace();
		boolean b = ld.getLogin("mani", "12334");
		System.out.println(b);
	}

}
