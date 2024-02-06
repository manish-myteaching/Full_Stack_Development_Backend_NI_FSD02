package exception;

public class ChildExDemo extends ParentExDemo {

	void show() throws ArrayIndexOutOfBoundsException {
		System.out.println("child-show");
	}

}
