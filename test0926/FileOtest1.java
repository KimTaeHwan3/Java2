package test0926;

import java.io.FileWriter;

public class FileOtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "Have a good day. Hava a nice dy! Have good? Have fun?";
		intxt() = new char(source.length());
		
		source.(0, source.length(), intxt, 0);
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt);
		
		fw.colse();
	}

}
