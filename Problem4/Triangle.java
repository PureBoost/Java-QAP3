package Problem4;

// Triangle stores three validated side lengths.
public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(String name, double side1, double side2, double side3) {
		super(name);
		if (!isValidTriangle(side1, side2, side3)) {
			System.out.println("Error: invalid triangle sides.");
			System.exit(1);
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	private boolean isValidTriangle(double side1, double side2, double side3) {
		return side1 > 0 && side2 > 0 && side3 > 0
			&& side1 + side2 > side3
			&& side2 + side3 > side1
			&& side3 + side1 > side2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public double getArea() {
		double s = getPerimeter() / 2.0;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override
	public void scale(double scaleFactor) {
		side1 *= scaleFactor;
		side2 *= scaleFactor;
		side3 *= scaleFactor;
	}
}