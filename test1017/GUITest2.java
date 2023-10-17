package test1017;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2 extends JFrame implements ActionListener{
	 //텍스트 필드 객체 선언 //이벤트 처리하기 위해 속성으로 생성자 바깥에 생성.
	private JTextField input;
	
	//텍스트 에어리어 객체 생성 //이벤트 처리하기 위해 속성으로 생성자 바깥에 생성.
	private JTextArea output;
	public GUI2() {
		JButton jb = new JButton("파일 읽어오기");
		//20자 입력 가능한 텍스트 필드 객체 생성.
		input = new JTextField("파일이름을 입력하세요.",20);
		//10줄 20자칸 텍스트 에어리어 객체 생성.
		output = new JTextArea(10, 20);
		output.setEditable(false);
		//컨테이너 생성
		Container ct = getContentPane();
				
		//FlowLayout 객체관리자 생성
		ct.setLayout(new FlowLayout());
		//판넬 생성
		JPanel jp = new JPanel();
		//버튼 생성
		jp.add(input);
		jp.add(jb);
		ct.add(jp);
		ct.add(output);
		//3. 이벤트 받아들일 버튼에 리스너 등록.
		jb.addActionListener(this);
		setTitle("GUI Test2");
		
		setSize(500,500);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try {
			String s = input.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			output.setText(dis.readUTF());
			//파일닫기
			fis.close();
			System.out.println(s + "파일을 읽었습니다..");
		}
		catch(Exception e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

	
}

public class GUITest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI2();
	}

}
