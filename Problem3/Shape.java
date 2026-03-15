package Problem3;

// Abstract base class for all shapes in Problem 3.
public abstract class Shape {
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double getPerimeter();

	public abstract double getArea();

	@Override
	public String toString() {
		return "Name: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
	}
}