package test1006;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame2 extends JFrame{	//JFrame을 상속받아 클래스 생성.
	public FirstFrame2() {
		Container ct = getContentPane();
		
	    JButton jb = new JButton("테스트 버튼2");
		//컨테이너에 버튼 추가
		ct.add(jb);
		
		//프레임 제목 생성
		setTitle("두 번째 GUI 프로그램 - JFrame 상속");
		
		 //프레임 크기
	    setSize(400,300);
	    //프레임을 화면에 출력
	    setVisible(true);
	}
}

public class FrameTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstFrame2(); //클래스 호출
	}
}
