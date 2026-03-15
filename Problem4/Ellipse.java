package Problem4;

// Ellipse stores the larger axis in a and the smaller axis in b.
public class Ellipse extends Shape {
	private double a;
	private double b;

	public Ellipse(String name, double axis1, double axis2) {
		super(name);
		this.a = Math.max(axis1, axis2);
		this.b = Math.min(axis1, axis2);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
		reorderAxes();
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
		reorderAxes();
	}

	private void reorderAxes() {
		if (a < b) {
			double temp = a;
			a = b;
			b = temp;
		}
	}

	@Override
	public double getPerimeter() {
		return Math.PI * Math.sqrt((2 * (a * a + b * b)) - (((a - b) * (a - b)) / 2.0));
	}

	@Override
	public double getArea() {
		return Math.PI * a * b;
	}

	@Override
	public void scale(double scaleFactor) {
		a *= scaleFactor;
		b *= scaleFactor;
		reorderAxes();
	}
}