package mydilog;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import button.RoundedButton;
import mydilog2.MyModalDialog2;

public class MyModalDialog extends JDialog {
	
	private MyModalDialog2 dialogafter; //dialogafter �˾�â
	public int psum; //�� ���� �ݾ� 
	
	public MyModalDialog(ActionListener actionListener,int psum) { //MyModalDialog ������
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		this.psum=psum;
		
		JLabel lblNewLabel = new JLabel("�����Ͻðڽ��ϱ�?"); //���� �ǻ� label ��ü ����
		lblNewLabel.setFont(new Font("����", Font.BOLD, 22));
		lblNewLabel.setBounds(81, 31, 209, 43);
		getContentPane().add(lblNewLabel);
		
		RoundedButton yes = new RoundedButton(); //yes��ư ��ü ����
		yes.addActionListener(new ActionListener() { //��ư Ŭ���� ������� �˾�â ������ ���� �˾�â ������� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				dialogafter = new MyModalDialog2(this,psum); //dialogafter �˾�â ��ü ����
				dialogafter.setVisible(true);
			    setVisible(false);
			}
		});
		yes.setText("yes");
		yes.setBounds(38, 89, 129, 35);
		getContentPane().add(yes);
		
		RoundedButton no = new RoundedButton(); //no ��ư ��ü ����
		no.addActionListener(new ActionListener() { // ���p Ŭ���� ���� ���� �Ǵ� �̺�Ʈ
			public void actionPerformed(ActionEvent arg0) {
	        	setVisible(false);
			}
		});
		
		no.setText("no");
		no.setBounds(196, 89, 129, 35);
		getContentPane().add(no);
		
	    setLocation(new Point(300,200)); //ȭ�� ������ ȭ�� ��ġ ����
	    setSize(new Dimension(375, 200)); //ȭ�� ũ�� ����
	    setTitle("����â"); 
	
	}
}
