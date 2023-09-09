package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e=null;
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		e=(Employee) ois.readObject();
		System.out.println(e.name);
		System.out.println(e.id);
		
		e.display();
		ois.close();
		
		
}
}