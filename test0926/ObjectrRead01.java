package test0926;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectrRead01 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("입력 파일명을 입력하세요 :");
		String fileName = stdin.next();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		// 직렬화된 객체 읽어오기
		Object s2 = ois.readObject();
		
		// readObject()메소드로 직렬화된 객체의 2진 데이터를 읽어서 객체 타입으로 캐스팅한다
		PersonInfo p1 = (PersonInfo)ois.readObject();
		PersonInfo p2 = (PersonInfo)ois.readObject();
		
		System.out.println(s2);
		System.out.println("이름 : " + p1.name);
		System.out.println("주소 : " + p1.city);
		System.out.println("나이 : " + p1.age);
		System.out.println("===============");
		System.out.println("이름 : " + p2.name);
		System.out.println("주소 : " + p2.city);
		System.out.println("나이 : " + p2.age);
	}

}
