/*
 * 메뉴 순서작성
 * 1.JMenuBar 객체 생성 2,메뉴바에 나타낼 JMenu 객체를 생성 3.각각의 메뉴에 연결되는 서브 메뉴를 JMenuItem 객체로 생성하여 메뉴에 추가
 * 4.메뉴가 완성될 때까지 2~3번을 반복 5.메뉴가 완성되면 모든 메뉴를 JMenuBar에 추가 6.setJMenuBar() 메소드를 이용하여 메뉴바를 프레임에 추가
 */
package test1103;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf; //선택한 메뉴 출력
	
	public JMenu1() {
		//컨테이너 생성
		Container ct = getContentPane();
		//레이아웃-BoderLayout
		ct.setLayout(new BorderLayout());
		
		//1.JMenuBar()객체 생성
		JMenuBar jmb = new JMenuBar();
		//2.JMenu 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		//3 서브 메뉴를 JMenuItem 객체로 생성.
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);
		//3서브메뉴 JCheckBoxMenuItem객체 생성
		JCheckBoxMenuItem jcmi = new JCheckBoxMenuItem("눈금자");
		jcmi.addActionListener(this);
		menu2.add(jcmi);
		//3서브메뉴 JRadioButtonMenuItem 객체생성
		JRadioButtonMenuItem jrmi = new JRadioButtonMenuItem("수정가능상태");
		jrmi.addActionListener(this);
		menu2.add(jrmi);
		//5.menu1,menu2 를 jmb에 추가
		jmb.add(menu1);
		jmb.add(menu2);
		//6. setMenuBar()메소드를 이용하에 메뉴바를 프레임에 추가
		setJMenuBar(jmb);
		
		jtf = new JTextField();
		ct.add(jtf,BorderLayout.SOUTH); //JTextField를 보더레이아웃을 통하여 아래쪽에 배치
		
		setTitle("JMenu Test");
		
		setSize(500,500);
		
		
		//화면에 출력
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(e.getActionCommand());
	}
	
}
public class JMenuTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JMenu1();
	}

}
