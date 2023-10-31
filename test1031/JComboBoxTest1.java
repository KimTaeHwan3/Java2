package test1031;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBox1 extends JFrame implements ItemListener{
	//이미지 표지될 영역
	JLabel fruitLabel;
	public JComboBox1() {
		//콤보박스 객체 생성
		JComboBox<String> fruitCombo = new JComboBox<String>();
		//이ㅣ미지 표시 영역 객체 생성
		fruitLabel = new JLabel();
		//과일 배열 생성.
		String fruitList[] = {"persimmon","banana","pear","apple","cherry","grape"};
		//컨테이너 생성
		Container ct = getContentPane();
		
		//객체 관리자 성향 (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		//콤보박스에 과일 리스트 추가
		for(int i=0; i<fruitList.length; i++) {
			fruitCombo.addItem(fruitList[i]);
		}
		//컨테이너에 콤보박스 추가
		ct.add(fruitCombo);
		//컨테이너에 레이블 추가
		ct.add(fruitLabel);
		
		//콤보박스에 이벤트 리스너 등록
		fruitCombo.addItemListener(this);
		
		setTitle("제이콤보박스 Test");
		
		setSize(500,500);
		
		
		//화면에 출력
		setVisible(true);	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
	
}

public class JComboBoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBox1();
	}

}
