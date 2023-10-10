package test1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Event2 extends JFrame{
	//JLabel 객체를 송석으로 등록
	JLabel j1;
	//JButton 객체를 속성으로 2개 등록
	JButton jb1, jb2;
	
	//생성자
	public Event2() {
		Container ct = getContentPane();
		//객체 관리자 성향 (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		jb1 = new JButton("안녕하세요.");
		jb2 = new JButton("행복한 하루입니다.");
		
		j1 = new JLabel("버튼을 눌러주세요.");
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(j1);
		
		jb1.addActionListener(new EventProcess()); //버튼 객체에 리스너 등록
		jb2.addActionListener(new EventProcess()); //버튼 객체에 리스너 등록
		
		setTitle("Event Test");
		
		setSize(300,200);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);
	}
	//이벤트를 처리할 클래스 작성
	//1. 처리할 이벤트 종류 ActionEvent
	//2.이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성
	private class EventProcess implements ActionListener {
		//4.리스너 인터페잇스에 선정된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			j1.setText(e.getActionCommand());
		}
	}
}
public class EventTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event2();
	}

}
