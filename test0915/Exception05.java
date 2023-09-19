package test0915;

import java.io.FileReader;

public class Exception05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader file = new FileReader(a.txt);
		int i;
		while((i = file.read) i = -1) {
			System.out.print((char)i);
		}
		file.close();
	} catch (fileNotFountException e) {
		System.out.println("파일이 존재하지 않습니다. ");
	} catch (IOException e) {
		System.out.println("파일이 없습니다.");
	}

}