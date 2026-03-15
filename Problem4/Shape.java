package Problem4;

// Abstract superclass for all shapes.
public abstract class Shape implements Scalable {
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