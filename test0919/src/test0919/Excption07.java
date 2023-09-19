package test0919;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excption07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner stdIn = new Scanner(System.in);
		
		System.out.println("나이를 입력 하세요 : ");
		int age = 0;
		try {
			 age = stdIn.nextInt();
			System.out.println("당신의 나이는 " + age + "입니다.");
		} catch (InputMismatchException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		System.out.println("나이는 정수로 입력하세요.");
		}
	
	
	}

}
