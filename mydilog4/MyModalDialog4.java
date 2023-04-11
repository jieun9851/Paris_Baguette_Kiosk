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
	public int psum;//�� ���� �ݾ� 
	public MyModalDialog4(ActionListener actionListener,int psum) { //MyModalDialog4 ������
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);		
		this.psum=psum;
		
		JLabel lb = new JLabel("������ �Ϸ�Ǿ����ϴ�. �����մϴ�."); //lb label��ü ����
		lb.setFont(new Font("���� ���", Font.BOLD, 14));
		lb.setBounds(35, 15, 264, 21);
		getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("�� ���� �ݾ��� "+psum+"�� �Դϴ�."); //lb2 label ��ü ����
		lb2.setFont(new Font("���� ���", Font.BOLD, 14));
		lb2.setBounds(56, 40, 252, 21);
		getContentPane().add(lb2);
		
		RoundedButton okayButton = new RoundedButton(); //Ȯ�� ��ư ��ü ����
		okayButton.setText("Ȯ��");
		okayButton.addActionListener(new ActionListener() { //��ư Ŭ���� �˾�â ������� �ϱ�
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		okayButton.setBounds(86, 76, 129, 29);
		getContentPane().add(okayButton);
		
		setLocation(new Point(300,200)); //ȭ�� ������ ȭ�� ��ġ ����
	    setSize(new Dimension(320, 167));
	    setTitle("�����Ϸ�");
	}
}
