package singleton;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		SingletonDemo sd=	SingletonDemo.getInstace();
		System.out.println(sd.hashCode());
		
		SingletonDemo sd1=	SingletonDemo.getInstace();
		System.out.println(sd1.hashCode());
		
		SingletonDemo sd2=(SingletonDemo)sd1.clone();
		System.out.println(sd2.hashCode());
		
	
		

	}

}
