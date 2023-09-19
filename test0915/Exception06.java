package test0915;

import java.io.FileReader;
import java.io.InvalidObjectException;
import java.io.IOException;

public class Exception06 {
										//드로우 정확한 처리 불가능
	public static void main(String[] args) throws fileNotFoundException, IOException{ 
		// TODO Auto-generated method stub
		FileReader file = new FileReader(a.txt);
		int i;
		while((i = file.read) i = -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}
