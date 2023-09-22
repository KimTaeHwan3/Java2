package test0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FireWriterTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		//파일이 저장할 문자열 생성
		String source = "너를 만나 \n" + "헤어지자 말해요 \n" + "사랑하지마요 \n" + "남자를 몰라\n" + "사랑앓이 \n";
		
		//파일명으로 객체 생성.
		FileWriter fw = new FileWriter(sfile);
		
		//문자열을 파일에 출력
		fw.write(source); //객체를 통해 a.txt 파일에 source에 있는 내용을 출력(저장)
		
		//출력 스트림 닫가.
		fw.close();
		
		System.out.println("파일이 생성되었습니다.");
	}

}
