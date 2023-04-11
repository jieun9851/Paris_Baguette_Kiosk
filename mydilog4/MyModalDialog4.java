package mydilog4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import button.RoundedButton;

public class MyModalDialog4 extends JDialog{
	public int psum;//총 결제 금액 
	public MyModalDialog4(ActionListener actionListener,int psum) { //MyModalDialog4 생성자
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);		
		this.psum=psum;
		
		JLabel lb = new JLabel("결제가 완료되었습니다. 감사합니다."); //lb label객체 생성
		lb.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lb.setBounds(35, 15, 264, 21);
		getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("총 결제 금액은 "+psum+"원 입니다."); //lb2 label 객체 생성
		lb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lb2.setBounds(56, 40, 252, 21);
		getContentPane().add(lb2);
		
		RoundedButton okayButton = new RoundedButton(); //확인 버튼 객체 생성
		okayButton.setText("확인");
		okayButton.addActionListener(new ActionListener() { //버튼 클릭시 팝업창 사라지게 하기
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		okayButton.setBounds(86, 76, 129, 29);
		getContentPane().add(okayButton);
		
		setLocation(new Point(300,200)); //화면 생성시 화면 위치 설정
	    setSize(new Dimension(320, 167));
	    setTitle("결제완료");
	}
}
