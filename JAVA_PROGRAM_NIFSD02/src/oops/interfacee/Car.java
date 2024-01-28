package oops.interfacee;

public interface Car {
	public static final int gear = 5;
	public static final int speed = 500;
	
	public abstract void gear(String carName);
	public abstract String engine(String carName);
	public abstract String speed(String carName);
}
