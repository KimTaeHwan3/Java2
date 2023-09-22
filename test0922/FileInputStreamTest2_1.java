package test0922;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c.txt");
		
		//FileInputStream 객체생성
		try {
			FileInputStream fr = new FileInputStream(file);
			int i;
			try {
				while((i = fr.read()) != -1) {
					System.out.print((char)i);}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
