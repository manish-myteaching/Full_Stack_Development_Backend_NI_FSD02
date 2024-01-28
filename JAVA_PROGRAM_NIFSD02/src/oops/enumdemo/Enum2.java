package oops.enumdemo;

public enum Enum2 {
	JAN(1), FEB(2), MARACH(3), APRIL(4), JUN(5), JULY(6);

	int x;
	Enum2(int x) {
		this.x = x;
	}
	
	int get() {
		return this.x;
	}

}
