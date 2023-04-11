package mydilog2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import button.RoundedButton;
import mydilog3.MyModalDialog3;

public class MyModalDialog2 extends JDialog {
	
	MyModalDialog3 dialogafter2; //dialogafter2 팝업창
	public int psum; //총 결제 금액
	
	public MyModalDialog2(ActionListener actionListener,int psum) {  //MyModalDialog2 생성자
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new GridLayout(0,2));
		this.psum=psum;
		
		JButton bill = new JButton(); // 현금결제 버튼 객체 생성
		bill.setBackground(Color.BLUE);
		bill.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		bill.setForeground(Color.WHITE);
		bill.addActionListener(new ActionListener() { //버튼 클릭시 기존 팝업창 사라지고 포인트 적립 팝업창 나타나는 이벤트
			public void actionPerformed(ActionEvent e) {
				dialogafter2= new MyModalDialog3(this,psum);
				dialogafter2.setVisible(true);
			    setVisible(false);
			}
		});
		bill.setText("현금결제");
		getContentPane().add(bill);
		
		JButton cash = new JButton(); // 카드결제 버튼 객체 생성
		cash.setBackground(Color.BLUE);
		cash.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		cash.setForeground(Color.WHITE);
		cash.addActionListener(new ActionListener() { //버튼 클릭시 기존 팝업창 사라지고 포인트 적립 팝업창 나타나는 이벤트
			public void actionPerformed(ActionEvent arg0) {
				dialogafter2= new MyModalDialog3(this,psum);
				dialogafter2.setVisible(true);
			    setVisible(false);
			}
		});
		cash.setText("카드결제");
		getContentPane().add(cash);
		
		JButton discount = new JButton(); //할인 적용 버튼 객체 생성
		discount.setBackground(Color.BLUE);
		discount.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		discount.setForeground(Color.WHITE);
		discount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //버튼 클릭시 할인 종류 팝업창 뜨고 기존 팝업창 사라지는 이벤트
				
			    setVisible(false);
			}
		});
	
	    setLocation(new Point(300,200)); //화면 생성시 화면 위치 설정
	    setSize(new Dimension(375, 200));
	    setTitle("결제창");

	}
}
