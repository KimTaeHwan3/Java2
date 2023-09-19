/*
 * 2개의 정수를 입력 받아 나눗셈하는 프로그램
 */
package test0915;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.println("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		
			System.out.println(num1 / num2);
	}

}
