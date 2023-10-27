package test1027;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl;
	//체크박스 5개 생성
	JCheckBox[] jc = new JCheckBox[5];
	String[] hobby = {"걷기","둥산","골프","스킨스쿠버","페러글라이딩"};
	public JRadioButton1() {
		//JLabel객체 선언
		jl = new JLabel();
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		JRadioButton[] jr = new JRadioButton[5];
		String[] age = {"20","30","40","50","60"};
		//판넬 생성
		JPanel jp = new JPanel();
		JPanel jp2 = new JPanel();
		ButtonGroup gb = new ButtonGroup();
		for(int i = 0; i < 5; i++) {
			jc[i] = new JCheckBox(hobby[i]);
			jr[i] = new JRadioButton(age[i]);
			jp.add(jc[i]);
			jp2.add(jr[i]);
			jr[i].addActionListener(this);
			gb.add(jr[i]);
		}
		
		//컨테이너 생성
		Container ct = getContentPane();
				
		//GridLayout 객체 관리자 생성
		ct.setLayout(new GridLayout(3, 1));
		//판넬1에 라벨  체크박스추가
		JPanel jp3 = new JPanel();
		jp3.add(jl1);
		jp3.add(jp);
		JPanel jp4 = new JPanel();
		jp4.add(jl2);
		jp4.add(jp2);
		JPanel jp5 = new JPanel();
		jp5.add(jl1);
		ct.add(jp3);
		ct.add(jp4);
		ct.add(jp5);
		setTitle("JRadioButton 테스트");
		
		setSize(500,300);
				
		//화면에 출력
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "당신의 취미 : " ;
		for(int i = 0 ; i < 5 ; i++) {
			if(jc[i].isSelected()==true)
				s=s+hobby[i]+" ";
		}
		s=s+" 당신의 나이 : ";
		jl.setText(s+e.getActionCommand());
	}
	
}
public class JRadioButtonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButton1();
	}

}
