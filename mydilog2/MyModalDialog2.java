package mydilog2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import button.RoundedButton;
import mydilog3.MyModalDialog3;

public class MyModalDialog2 extends JDialog {
	
	MyModalDialog3 dialogafter2; //dialogafter2 �˾�â
	public int psum; //�� ���� �ݾ�
	
	public MyModalDialog2(ActionListener actionListener,int psum) {  //MyModalDialog2 ������
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new GridLayout(0,2));
		this.psum=psum;
		
		JButton bill = new JButton(); // ���ݰ��� ��ư ��ü ����
		bill.setBackground(Color.BLUE);
		bill.setFont(new Font("���� ���", Font.BOLD, 14));
		bill.setForeground(Color.WHITE);
		bill.addActionListener(new ActionListener() { //��ư Ŭ���� ���� �˾�â ������� ����Ʈ ���� �˾�â ��Ÿ���� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				dialogafter2= new MyModalDialog3(this,psum);
				dialogafter2.setVisible(true);
			    setVisible(false);
			}
		});
		bill.setText("���ݰ���");
		getContentPane().add(bill);
		
		JButton cash = new JButton(); // ī����� ��ư ��ü ����
		cash.setBackground(Color.BLUE);
		cash.setFont(new Font("���� ���", Font.BOLD, 14));
		cash.setForeground(Color.WHITE);
		cash.addActionListener(new ActionListener() { //��ư Ŭ���� ���� �˾�â ������� ����Ʈ ���� �˾�â ��Ÿ���� �̺�Ʈ
			public void actionPerformed(ActionEvent arg0) {
				dialogafter2= new MyModalDialog3(this,psum);
				dialogafter2.setVisible(true);
			    setVisible(false);
			}
		});
		cash.setText("ī�����");
		getContentPane().add(cash);
		
		JButton discount = new JButton(); //���� ���� ��ư ��ü ����
		discount.setBackground(Color.BLUE);
		discount.setFont(new Font("���� ���", Font.BOLD, 14));
		discount.setForeground(Color.WHITE);
		discount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //��ư Ŭ���� ���� ���� �˾�â �߰� ���� �˾�â ������� �̺�Ʈ
				
			    setVisible(false);
			}
		});
	
	    setLocation(new Point(300,200)); //ȭ�� ������ ȭ�� ��ġ ����
	    setSize(new Dimension(375, 200));
	    setTitle("����â");

	}
}
