package test1006;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayout1 extends JFrame {
	public GridLayout1 () {
		Container ct = getContentPane();
		
		//GridLayout 객체 관리자 객체 생성
		GridLayout gl = new GridLayout(4, 5, 10, 10);
									 //4행 5열
		
	   //컨테이너에 레이아웃 설정
		ct.setLayout(gl);
		
		//20개의 버튼 컨포넌트를 생성하여 컨테이너에 추가
		for(int i =1; i <= 20; i++) {
			ct.add(new JButton("버튼" + i));
		}
		
		setTitle("GridLayout Test");
		
		setSize(500,500);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);	
	}
}

public class GridLayoutTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayout1();
	}

}
