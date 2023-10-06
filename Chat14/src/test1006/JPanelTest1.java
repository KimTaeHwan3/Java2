package test1006;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class JPanel1 extends JFrame {
	public JPanel1 () {
		Container ct = getContentPane();
		
		//객체 관리자 설정 FlowLayout
		ct.setLayout(new FlowLayout());
		
		//컨테이너에 컨포넌트 추가 (쟁반)
		ct.add(new JRadioButton("자바"));
		ct.add(new JRadioButton("C언어"));
		ct.add(new JRadioButton("JAVA Script"));
		ct.add(new JRadioButton("JSP"));
		ct.add(new JRadioButton("C#"));
		
		ct.add(new JButton("자바"));
		ct.add(new JButton("C언어"));
		ct.add(new JButton("JAVA Script"));
		ct.add(new JButton("JSP"));
		ct.add(new JButton("C#"));
		
		setTitle("jpANEL Test");
		
		setSize(300,200);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);	
	}
}
public class JPanelTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanel1();
	}

}
