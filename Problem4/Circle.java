package Problem4;

// Circle is an ellipse with equal axes.
public class Circle extends Ellipse {
	public Circle(String name, double radius) {
		super(name, radius, radius);
	}
}