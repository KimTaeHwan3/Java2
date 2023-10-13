package test1013;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.*;


import javax.swing.*;

class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton2() {
		jtf = new JTextField(10);
		//5개의 이미지 객체 생성
		ImageIcon apple = new ImageIcon("image/apple.jpg"); 
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		//5개의 이미지 객체 버튼 생성
		JButton j1 = new JButton("사과",apple);
		JButton j2 = new JButton("바나나",banana);
		JButton j3 = new JButton("감",persimmom);
		JButton j4 = new JButton("배",pear);
		JButton j5 = new JButton("포도",grape);
		
		//컨테이너 생성
		Container ct = getContentPane();
		//GridLayout 객체 관리자 생성
		ct.setLayout(new GridLayout(3, 2));
		//컨테이너에 버튼 추가
		ct.add(j1);
		ct.add(j2);
		ct.add(j3);
		ct.add(j4);
		ct.add(j5);
		
		//버튼에 ActionLitener 추가
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		j5.addActionListener(this);
		///화면에 보이기 사이즈는 500에 400
		setTitle("JButton Test2");
		
		setSize(550,400);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());	//에 글 내용 추가
		
	}
	
}

public class JButtonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButton2();
	}

}
