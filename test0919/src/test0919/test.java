package test0919;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		
	try {
		System.out.println("2/0은 : ");
		int div = b / a;
	}
	catch ( RuntimeException ex) {
		System.out.println("RuntimeException 예외 발생");
	}
	catch ( Exception ex) {
		System.out.println("Exception 예외 발생");
	}
		
	}

}
