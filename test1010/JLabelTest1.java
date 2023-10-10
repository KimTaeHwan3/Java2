package test1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JLabel1 extends JFrame implements ActionListener{
	private JLabel result = new JLabel();
	public ImageIcon img1, img2;
	
	public JLabel1() {
		img1 = new ImageIcon("image/apple.jpg");
		img2 = new ImageIcon("image/pear.jpg");
		
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		Container ct = getContentPane();
		//객체 관리자 성향 (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		apple.addActionListener(this);
		pear.addActionListener(this);
		
		setTitle("버튼을 누르면 이미지 보여주기");
		
		setSize(300,200);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "사과") {
			result.setIcon(img1);
			result.setText("맛있는 사과입니다.");
		}
		if(e.getActionCommand() == "배") {
			result.setIcon(img2);
			result.setText("좋아하는 배입니다.");
		}
	}	
}

public class JLabelTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabel1();
	}

}
