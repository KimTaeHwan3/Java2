package test0915;

class TestTest{
	public String text;
	
	public TestTest(String s) {
		this.text = s;
	}
}
public class Chat12_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTest test = new TestTest("ABC");
		System.out.println(test.text.toLowerCase());
	}

}
