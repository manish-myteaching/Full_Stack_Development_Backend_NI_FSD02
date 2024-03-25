package list;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Employee> {
	@Override
	public void accept(Employee emp) {
		System.out.println(emp);
	}
}
