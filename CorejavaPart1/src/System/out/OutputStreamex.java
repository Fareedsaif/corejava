package System.out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamex {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:/file15.txt");
		String s="Hlo , Welcome to java fullstack course";
		byte t[]=s.getBytes(); //string into byte array because only byte will work to write
		fos.write(t);
		System.out.println("content written successfully"); 
		

	}

}
