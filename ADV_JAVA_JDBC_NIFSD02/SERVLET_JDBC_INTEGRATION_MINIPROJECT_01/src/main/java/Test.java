import com.congnizant.service.RegistrationSevice;
import com.congnizant.service.RegistrationSeviceImpl;
import com.congnizant.vo.UserInfoVO;

public class Test {

	public static void main(String[] args) {

		RegistrationSevice rd=RegistrationSeviceImpl.getInstace();
		UserInfoVO userInfo = rd.registerUserInfo(new UserInfoVO("Dhoni", "MS", "so106", "1234"));

		System.out.println(userInfo);

	}

}
