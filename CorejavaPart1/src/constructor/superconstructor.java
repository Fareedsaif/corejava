package constructor;

class rectangle {
	private double breadth;
	private double width;

	public rectangle() {
		breadth = 0;
		width = 0;
	}

	public rectangle(double breadth, double width) {
		this.breadth = breadth;
		this.width = width;
	}

	double getArea() {
		return breadth * width;

	}
}

class Volume extends rectangle {
	double height;

	public Volume() {
		super();
		this.height = 0;
	}

	public Volume(double breadth, double width, double height) {
		super(breadth, width);
		this.height = height;
	}

	double getVolume() {
		return getArea() * height;
	}

}

public class superconstructor {

	public static void main(String[] args) {
		Volume v = new Volume();
		System.out.println(v.getVolume());
		Volume v1 = new Volume(2, 3, 5);
		System.out.println(v1.getVolume());
	}

}
