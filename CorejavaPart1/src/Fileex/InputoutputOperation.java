package Fileex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputoutputOperation {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:/test12.txt");
		int i=fis.read();
		System.out.println((char)i);
		System.out.println();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
	
		}
	fis.close();	
	}

}
