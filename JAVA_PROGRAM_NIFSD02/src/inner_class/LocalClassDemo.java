package inner_class;

public class LocalClassDemo {

	void print() {
		class Test {
			void show() {
				System.out.println("Local class");
			}
		}
		Test test=new Test();
		test.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClassDemo lcd=new LocalClassDemo();
		lcd.print();

	}

}
