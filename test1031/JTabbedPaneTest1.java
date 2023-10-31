package test1031;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

// 성별 판넬 클래스 만들기
class  RadioPanel1 extends JPanel implements ActionListener{
	//성별을 나타내는 라디오 버튼 그룹 만들기
	ButtonGroup gb = new ButtonGroup();
	JLabel jl1 = new JLabel(" 당신의 성별은? ");
	JLabel jl2 = new JLabel();
	
	//라디오 버튼 생성
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"남자", "여자"};
	public RadioPanel1() {
		//성별을 라디오버튼 객체로 배열 생성
		for(int i = 0; i < 2; i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]);
			//버튼 그룹에 추가
			gb.add(jr[i]);
			//리스너 등록
			jr[i].addActionListener(this);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		jl2.setText(s);
	}
	
}

//혈액형 판넬 클래스 만들기
class ComboBoxPanel1 extends JPanel	implements ItemListener{
	//레이블 생성
	JLabel jl1 = new JLabel( "당신의 성별은? ");
	JLabel jl2 = new JLabel();
	public ComboBoxPanel1() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("AB형");
		jcb.addItem("O형");
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		//리스너등록
		jcb.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object s = e.getItem();
		jl2.setText(s.toString());
	}	
}
//GUI
class JTabPanel1 extends JFrame{
	public JTabPanel1() {
		//컨테이너 생성
		Container ct = getContentPane();
		
		//JTabPanel 객체생성
		JTabbedPane jtb = new JTabbedPane();
		
		//라디오버튼판넬,콤보 판넬 객체를 생성
		RadioPanel1 rp = new RadioPanel1();
		ComboBoxPanel1 cp = new ComboBoxPanel1();
		
		//JTabbedPanel에 판넬 추가
		jtb.addTab("성별",rp);
		jtb.addTab("혈액형",cp);
		
		//컨테이너에 추가
		ct.add(jtb);
		
		setTitle("Jtab Test");
		
		setSize(500,500);
		
		
		//화면에 출력
		setVisible(true);	
	}
}
public class JTabbedPaneTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabPanel1();
	}

}
