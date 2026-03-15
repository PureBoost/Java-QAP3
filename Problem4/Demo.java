package Problem4;

public class Demo {
	public static void scaleAll(Scalable[] scalables, double scaleFactor) {
		for (Scalable scalable : scalables) {
			scalable.scale(scaleFactor);
		}
	}

	public static void main(String[] args) {
		Shape[] shapes = {
			new Ellipse("Ellipse", 6.0, 4.0),
			new Circle("Circle", 5.0),
			new Triangle("Triangle", 3.0, 4.0, 5.0),
			new EquilateralTriangle("Equilateral Triangle", 6.0)
		};

		System.out.println("Before scaling:");
		for (Shape shape : shapes) {
			System.out.println(shape);
		}

		scaleAll(shapes, 2.0);

		System.out.println("\nAfter scaling by factor 2.0:");
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}
}