package Problem2;

public class Demo {
	public static void main(String[] args) {
		Point point = new Point(1.5f, 2.5f);
		System.out.println(point);

		MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 0.5f, 1.0f);
		System.out.println(movablePoint);
		movablePoint.move();
		System.out.println("After move: " + movablePoint);
	}
}
