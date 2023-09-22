/*
 * 파일이 저장된 내용 가져오기.9출력)
 */
package test0922;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileLReaderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.println("파일명을 입력해주세요 :");
			String sfile = stdIn.next();
			
			FileReader fr = new FileReader(sfile);
			
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}

}
