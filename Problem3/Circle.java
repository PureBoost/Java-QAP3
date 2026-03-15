package Problem3;

// Circle is a special ellipse with equal axes.
public class Circle extends Ellipse {
	public Circle(String name, double radius) {
		super(name, radius, radius);
	}
}