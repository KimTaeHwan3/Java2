package test0915;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x();
	}
	static void x() {
		y();
	}
	static void y() {
		z();
	}
	static void z() {
		int i =1;
		int j =0;
		System.out.println(i/j);
	}

}
//에러 이유 : 0을 나눌 수 없기 때문에 에러가 난다.