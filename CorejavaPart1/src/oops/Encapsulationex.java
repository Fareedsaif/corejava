package oops;

public class Encapsulationex {
private int rno;

	public static void main(String[] args) {
		
	}

}......


public class EncapExample {
	private int value;

	public EncapExample(int value) {
	this.value = value;
	}

	public int getValue() {
	return value;
	}

	public void setValue(int value) {
	this.value = value;
	}

	public static void main(String[] args) {
	EncapExample example = new EncapExample(42);

	System.out.println("Initial Value: " + example.getValue());

	example.setValue(99);

	System.out.println("Updated Value: " + example.getValue());
	}
	}