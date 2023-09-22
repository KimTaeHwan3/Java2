/*
 * 바이트 단위로 파일에 저장.(파일 생성)
 */
package test0922;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutpuStreamTest2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		//파일명으로 객체를 생성.
		FileOutputStream fos = new FileOutputStream(sfile);
		
		int i;
		for(i = 1; i <=260; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println(sfile + "파일명으로 바이트 파일을 생성하였습니다.");
	}

}
