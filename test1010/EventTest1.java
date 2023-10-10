/*
 *  GUI클래스에서 이벤트 처리하는 방법
 */

package test1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Event1 extends JFrame implements ActionListener{
	JLabel j1; //JLabel 객체를 속성으로 등록
	
	public Event1() {
		//컨테이너 생성
		Container ct = getContentPane();
		//객체 관리자 성향 (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		//버튼 생성
		JButton jb = new JButton("버튼");
		
		j1 = new JLabel("버튼을 눌러 주세요. ");
		
		//컨테이너 버튼과 레이블 등록
		ct.add(jb);
		ct.add(j1);
		
		// 3이벤트를 받아들일 컴포넌트에 리스너 등록
		jb.addActionListener(this); //버튼 객체에 리스너 등록
		
		setTitle("Event Test");
		
		setSize(300,200);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);

	}
	//4. 리스터 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("안녕하세요");
	}
}

public class EventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event1();
	}

}
