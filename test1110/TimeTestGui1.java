package test1110;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
	                                 //리스너 이벤트 종류 선택
class TimeGui extends JFrame implements ActionListener{
	JTextField jtf;
	JTextArea jta1;
	JTextArea jta2;
	
	public TimeGui() {
		JLabel jl1 = new JLabel("당신의 생일을 공백으로 구분하여 입력(예:2020 10 10)");
		JButton jb1 = new JButton("현재");
		JButton jb2 = new JButton("100살");
		jtf = new JTextField(20);
		jta1 = new JTextArea(4, 20);
		jta2 = new JTextArea(3, 20);
		jta1.setEditable(false);
		jta2.setEditable(false);
		
		//컨테이너 생성
		Container ct = getContentPane();
		//객체 관리자 성향 (FlowLayout)
		ct.setLayout(new FlowLayout());
		//판넬 생성
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		//판넬1에 JLabel JTextField 추가
		jp1.add(jl1);
		jp1.add(jtf);
		//판넬2에 JButton JTextArea 추가
		jp2.add(jb1);
		jp2.add(jta1);
		//판넬3에 JButton2 JtextArea2 추가
		jp3.add(jb2);
		jp3.add(jta2);
		//컨테이너에 판넬추가
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		//JButton에 액션리스너 적용
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		///화면에 보이기 사이즈는 500에 400
		setTitle("JButton Test2");
				
		setSize(550,400);
				
				
		//화면에 출력
		setVisible(true);
	}
	//리스터 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String birth = jtf.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		LocalDate my_birth = LocalDate.of(year, month, month);
		LocalDate current = LocalDate.now();
		LocalDate hunderd = my_birth.plusYears(100);
		
		if(e.getActionCommand() == "현재") {
			jta1.append("당신의 생일 : " + toString(my_birth)+"\n");
			jta1.append("오늘 날짜는 : " + toString(current)+"\n");
			jta1.append("생일붜 오늘까지의 일 : " + my_birth.until(current, ChronoUnit.DAYS)+ "\n");
			jta1.append("생일부터 오늘까지의 년 : " + my_birth.until(current, ChronoUnit.YEARS));
		}
		else {
			jta2.append("당신이 100살이 되는 날은 : " + toString(hunderd)+ "\n");
			jta2.append("100살까지 남은 주(week)의 수 : " + current.until(hunderd, ChronoUnit.WEEKS)+"\n");
			jta2.append("100살까지 남은 일(day)의 수 : " + current.until(hunderd, ChronoUnit.DAYS));
			jtf.setEditable(false);
		}
	}
	private String toString(LocalDate d) {
		// TODO Auto-generated method stub
		return d.getYear()+"년" + d.getMonthValue()+"월" + d.getDayOfMonth()+"일";
	}
	
}

public class TimeTestGui1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimeGui();
	}

}
