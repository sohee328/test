package 구현실습;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return String.format("Rectagle{%d, %d}", width, height);
	}
}

class RectangleAreaComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if (o1 == o2)
			return 0;
		if (o1 == null)
			return -1;
		if (o2 == null)
			return 1;
		return o1.getArea() - o2.getArea();
	};
}

public class Example06 {
	public static void main(String[] args) {
		Rectangle a[] = new Rectangle[] { new Rectangle(5, 7), new Rectangle(3, 2), new Rectangle(7, 2),
				new Rectangle(4, 5), new Rectangle(8, 2), new Rectangle(6, 3) };
		Comparator<Rectangle> comparator = new RectangleAreaComparator();
		Arrays.sort(a, comparator);
		System.out.println(Arrays.toString(a));
	}
}
