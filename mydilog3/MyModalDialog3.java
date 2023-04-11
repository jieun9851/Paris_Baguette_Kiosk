package mydilog3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import button.RoundedButton;
import mydilog4.MyModalDialog4;

public class MyModalDialog3 extends JDialog {
	private JTextField textField; //text창 
	JLabel pointscore; //현재 포인트
	JLabel pointscore2; // 총 포인트
	public int psum; // 총 결제 금액
	public static int sumend; // 할인 적용할때 사용 할 총 결제 금액
	public int pointsum; //적립될 포인트
	public String clients [] = new String[100]; //고객 전화번호 뒷자리 배열
	public static int clientsPoint[] = new int[100]; //고객 포인트 배열
	MyModalDialog4 dialogafter3; //dialogafter3 팝업창
	
	public MyModalDialog3(ActionListener actionListener,int psum) { //MyModalDialog3 생성자
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		this.psum=psum;
		sumend=psum;
	    
		pointsum+=psum*(0.1); //결제금액 10% 포인트 적립
		
		clients = new String[] {"9805","9476","2468","0511"}; //기존에 등록된 고객 정보

		textField = new JTextField(); //textField 객체 생성
		textField.setBounds(38, 88, 131, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel id = new JLabel("전화번호 뒷자리를 입력해주세요."); //id 객체 생성
		id.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		id.setBounds(45, 52, 284, 21);
		getContentPane().add(id);
		
		JLabel point = new JLabel("<포인트 적립>"); //point 객체 생성
		point.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		point.setBounds(111, 15, 125, 21);
		getContentPane().add(point);

		RoundedButton idButton = new RoundedButton(); //포인트 적립 확인 버튼 객체 생성
		idButton.setText("확인");
		idButton.setBounds(174, 89, 68, 27);
		getContentPane().add(idButton);
		
		RoundedButton xButton = new RoundedButton(); //적립안함 버튼 객체 생성
		xButton.addActionListener(new ActionListener() { //버튼 클릭시 기존 팝업창 사라지고 결제 확인 팝업창 나타나는 이벤트
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dialogafter3= new MyModalDialog4(this,psum);
				dialogafter3.setVisible(true);
			}
		});
		xButton.setText("적립안함");
		xButton.setBounds(244, 88, 68, 27);
		getContentPane().add(xButton);
		
		RoundedButton bb = new RoundedButton(); //포인트 적립 후 확인 버튼 객체 생성
		bb.setBounds(192, 87, 68, 29);
		bb.setText("확인");
		getContentPane().add(bb);
		bb.setVisible(false);
		bb.addActionListener(new ActionListener() { //버튼 클릭시 기존 팝업창 사라지고 결제 확인 팝업창 나타나는 이벤트
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dialogafter3= new MyModalDialog4(this,psum); //결제 완료 되었다는 팝업창 객체 생성
				dialogafter3.setVisible(true);
			}
		});
		
		
		idButton.addActionListener(new ActionListener() {//버튼 클릭시 기존 팝업창 사라지고 포인트 적립 결과 팝업창 나타나는 이벤트
			public void actionPerformed(ActionEvent e) {
				String input2;
				input2=textField.getText(); //텍스트 창에 입력한 문자열 
				//기존의 컴퍼넌트 사라지게 하기
				idButton.setVisible(false);
				id.setVisible(false);
				point.setVisible(false);
				textField.setVisible(false);
				xButton.setVisible(false);
				
				
					for(int i=0;i<clients.length;i++) { //배열의 크기만큼 for문 반복
						if(input2.equals(clients[i])) { // 입력한 값이 배열안에 있다면
							pointscore = new JLabel(input2+" 님의 현재 포인트 적립은 "+ pointsum +"입니다."); // 현재 포인트 적립 label 객체 생성
							pointscore.setFont(new Font("맑은 고딕", Font.BOLD, 14));
							pointscore.setBounds(40, 5, 280, 55);
							getContentPane().add(pointscore);
							
							clientsPoint[i]+=pointsum;
							
							pointscore2 = new JLabel(input2+"님의 총 포인트는 "+clientsPoint[i]+"입니다."); // 총 포인트 적립 label 객체 생성
							pointscore2.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
							pointscore2.setBounds(65, 28, 255, 80);
							getContentPane().add(pointscore2);
							
							bb.setVisible(true); 
							
							RoundedButton aa = new RoundedButton(); //포인트 사용하기 버튼 객체 생성
							aa.setBounds(72, 87, 110, 29);
							aa.setText("포인트 사용하기");
							getContentPane().add(aa);
							aa.addActionListener(new ActionListener() { //버튼 클릭시 포인트에서 뺸 만큼 총 결제 금액 변경
								public void actionPerformed(ActionEvent e) {
									sumend-=clientsPoint[i];
									dialogafter3= new MyModalDialog4(this,sumend);
									dialogafter3.setVisible(true);
									setVisible(false);
									clientsPoint[i]=0;
								}
							});
							aa.setVisible(true); 
							break;
							}
						
						else {
							//고객 정보가 등록되어있지 않은 경우 경고 팝업창 띄우기
							JOptionPane.showMessageDialog(null,input2+"님은 등록되어있지 않습니다.","포인트 적립 오류",JOptionPane.ERROR_MESSAGE); 
							setVisible(false);
							dialogafter3= new MyModalDialog4(this,psum); //결제 완료 되었다는 팝업창 객체 생성
							dialogafter3.setVisible(true);	
							break;
						}
				       
					}
						}
					});
		

		setLocation(new Point(300,200)); //화면 생성시 화면 위치 설정
	    setSize(new Dimension(351, 186));
	    setTitle("포인트 적립");
	
	}
}
