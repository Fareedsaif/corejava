package oops;

abstract class Bird {
	abstract void makeSound();
}

class Duck extends Bird {
	public void makeSound() {
		System.out.println("The sound that a Duck makes : Quack Quack");
	}
}

class Owl extends Bird {
	public void makeSound() {
		System.out.println("The sound that an Owl makes: Hoot Hoot");
	}
}

public class AbstractBird {

	public static void main(String[] args) {
		Duck d=new Duck();
		d.makeSound();
		Owl o=new Owl();
		o.makeSound();
		
		Bird bref;
		bref=d;
		bref.makeSound();
	}

}
