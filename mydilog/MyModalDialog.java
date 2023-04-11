package mydilog;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import button.RoundedButton;
import mydilog2.MyModalDialog2;

public class MyModalDialog extends JDialog {
	
	private MyModalDialog2 dialogafter; //dialogafter 팝업창
	public int psum; //총 결제 금액 
	
	public MyModalDialog(ActionListener actionListener,int psum) { //MyModalDialog 생성자
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		this.psum=psum;
		
		JLabel lblNewLabel = new JLabel("결제하시겠습니까?"); //결제 의사 label 객체 생성
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 22));
		lblNewLabel.setBounds(81, 31, 209, 43);
		getContentPane().add(lblNewLabel);
		
		RoundedButton yes = new RoundedButton(); //yes버튼 객체 생성
		yes.addActionListener(new ActionListener() { //버튼 클릭시 결제방식 팝업창 열리고 기존 팝업창 사라지는 이벤트
			public void actionPerformed(ActionEvent e) {
				dialogafter = new MyModalDialog2(this,psum); //dialogafter 팝업창 객체 생성
				dialogafter.setVisible(true);
			    setVisible(false);
			}
		});
		yes.setText("yes");
		yes.setBounds(38, 89, 129, 35);
		getContentPane().add(yes);
		
		RoundedButton no = new RoundedButton(); //no 버튼 객체 생성
		no.addActionListener(new ActionListener() { // 버늩 클릭시 결제 종료 되는 이벤트
			public void actionPerformed(ActionEvent arg0) {
	        	setVisible(false);
			}
		});
		
		no.setText("no");
		no.setBounds(196, 89, 129, 35);
		getContentPane().add(no);
		
	    setLocation(new Point(300,200)); //화면 생성시 화면 위치 설정
	    setSize(new Dimension(375, 200)); //화면 크기 설정
	    setTitle("결제창"); 
	
	}
}
