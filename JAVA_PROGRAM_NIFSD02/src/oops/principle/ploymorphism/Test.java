package oops.principle.ploymorphism;

public class Test {

	public static void main(String[] args) {
		MethodOverridingChild moc = new MethodOverridingChild();
		//moc.show();

		MethodOveridingParent mop = new MethodOverridingChild();
		mop.show();

		Car bm = new BMW();
		//bm.showSpeed();
		
		Car tata=new TATAImpl();
        // tata.showSpeed();
         
         ABParent abp=new ABChild();
         //abp.display();
         //abp.show();
	}

}
