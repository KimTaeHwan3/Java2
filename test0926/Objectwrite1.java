package test0926;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class PersonInfo implements Serializable {
	String name;
	String city;
	int age;

 public PersonInfo(String name, String city, int age ) {
	 this.name = name;
		this.city = city;
		this.age = age;
 }

public PersonInfo(String name2, String city2, String string) {
	// TODO Auto-generated constructor stub
}


}
public class Objectwrite1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("출력 파일명을 입력하세요 : ");
		String fileName = stdin.next();
		
		String s1 = "***고객 정보***";
		
		PersonInfo p1 = new PersonInfo("김태환", "부산", "23");
		PersonInfo p2 = new PersonInfo("홍길동", "한국", "20");
		//직렬화 된 객체를 2진수로 기록할 파일 ㅈ지명
		//객체를 기록할 수 있는 ObjectoutputStream객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName + "파일명으로 개게 파일을 생성하였습니다.");
		}
	}

