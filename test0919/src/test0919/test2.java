package test0919;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
			System.out.println("메소드호출 후");
		}
		catch (ArrayStoreException ex) {
			System.out.println("ArrayStoreException 예외 발생");
		}
		catch(ArithmeticException ec) {
			System.out.println("ArithmeticException 예외 발생");
		}
		
	}
	static void method1() throws RuntimeException {
		int a = 0;
		int b = 2 / a;
		System.out.println("나눗셈후");
		//메인 메소드 밖에 작성
	}

	

}
