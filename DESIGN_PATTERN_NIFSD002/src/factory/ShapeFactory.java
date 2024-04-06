package factory;

public class ShapeFactory {

	public static Shape getFactoryObject(String s) {
		if (s.equalsIgnoreCase("CIR")) {
			return new Circle();
		} else if (s.equalsIgnoreCase("REC")) {
			return new Rectangle();
		} else if (s.equalsIgnoreCase("SQR")) {
			return new Square();
		}
		return null;
	}

}
