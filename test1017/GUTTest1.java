package test1017;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.*;
//1.처리할 이벤트 종류 결정. 버튼
//2.이벤트에 적합한 이벤트 리스터 인터페이스를 사용하여 클래스 작성.
class GUI1 extends JFrame implements ActionListener{
	    //텍스트 필드 객체 선언 //이벤트 처리하기 위해 속성으로 생성자 바깥에 생성.
		private JTextField input;
		
		//텍스트 에어리어 객체 생성 //이벤트 처리하기 위해 속성으로 생성자 바깥에 생성.
		private JTextArea output;
	public GUI1() {
		//20자 입력 가능한 텍스트 필드 객체 생성.
		input = new JTextField("파일이름을 입력하세요.",20);
		
		//10줄 20자칸 텍스트 에어리어 객체 생성.
		output = new JTextArea("파일의 내용을 입력하세요.",10, 20);
		//컨테이너 생성
		Container ct = getContentPane();
		
		//FlowLayout 객체관리자 생성
		ct.setLayout(new FlowLayout());
		//판넬 생성
		JPanel jp = new JPanel();
		//버튼 생성
		JButton jb = new JButton("파일로 저장");
		//판넬에 텍스트 필드 추가
		jp.add(input);
		jp.add(jb);
		//컨테리너에 텍스트 에리어 추가
		ct.add(output);
		//컨테이너에 판넬 추가
		ct.add(jp);
		//3. 이벤트 받아들일 버튼에 리스너 등록.
		jb.addActionListener(this);
		setTitle("GUI Test1");
		
		setSize(500,500);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면에 출력
		setVisible(true);	
	}
	//4.리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try {
			//입출력을 위한 예외처리
			//파일 이름으로 출력 객체 생성.
			String s = input.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			//텍스트 에어리어의 내용을 파일로 출력
			dos.writeUTF(output.getText());
			//파일닫기
			fos.close();
			System.out.println(s + "파일이 생성되었습니다.");
			
		}
		catch(Exception e){
			
		}
	}
	
}

public class GUTTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI1();
	}

}
