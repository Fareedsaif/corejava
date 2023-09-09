package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializedemo {

	public static void main(String[] args) throws IOException {
		Employee e=new Employee();
		e.id=21;
		e.name="fareed";
		
		FileOutputStream fo=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		oos.writeObject(e);
		System.out.println("data saved");
		fo.close();
		oos.close();
		
		

		}

}
