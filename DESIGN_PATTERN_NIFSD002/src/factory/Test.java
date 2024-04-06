package factory;

public class Test {

	public static void main(String[] args) {

		Shape circle = ShapeFactory.getFactoryObject("CIR");
		circle.draw();
		
		Shape square = ShapeFactory.getFactoryObject("REC");
		square.draw();
		
		Shape rectangle = ShapeFactory.getFactoryObject("SQR");
		rectangle.draw();

	}

}
