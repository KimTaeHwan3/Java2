package test1027;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener{
	//텍스트 필드 객체 선언
	 JTextField input; //텍스트 필드에 이벤트 처리를 야 하는데 이벤트 처리하는 부분을 생성자 안에 처리하면 오류가 나와서 생성자 밖에다가 텍스트 필드를 선언한다.
	public JCheckBox1 () {
		//20자 입력 가능한 텍스트 필드 객체 생성.
		input = new JTextField(10);
		//JCheckBox 생성
		JCheckBox jc1 = new JCheckBox("JSP");
									
		JCheckBox jc2 = new JCheckBox("PHP");
										
		JCheckBox jc3 = new JCheckBox("ASP");
										
		JCheckBox jc4 = new JCheckBox("Servlet");
				
		//컨테이너 생성
		Container ct = getContentPane();
				
		//객체 관리자 성향 (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		//컨테이너에 체크박스 추가
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		//체크박스에 리스너 등록
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		//화면에 보이도록 사이즈 500,300
		setTitle("JCheckBox 테스트");
						
		setSize(250,100);
				
		//화면에 출력
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		input.setText(((JCheckBox)e.getItem()).getText());
	}
	
}

public class JCheckBoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckBox1();
	}

}
