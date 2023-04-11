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
	private JTextField textField; //textâ 
	JLabel pointscore; //���� ����Ʈ
	JLabel pointscore2; // �� ����Ʈ
	public int psum; // �� ���� �ݾ�
	public static int sumend; // ���� �����Ҷ� ��� �� �� ���� �ݾ�
	public int pointsum; //������ ����Ʈ
	public String clients [] = new String[100]; //�� ��ȭ��ȣ ���ڸ� �迭
	public static int clientsPoint[] = new int[100]; //�� ����Ʈ �迭
	MyModalDialog4 dialogafter3; //dialogafter3 �˾�â
	
	public MyModalDialog3(ActionListener actionListener,int psum) { //MyModalDialog3 ������
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		this.psum=psum;
		sumend=psum;
	    
		pointsum+=psum*(0.1); //�����ݾ� 10% ����Ʈ ����
		
		clients = new String[] {"9805","9476","2468","0511"}; //������ ��ϵ� �� ����

		textField = new JTextField(); //textField ��ü ����
		textField.setBounds(38, 88, 131, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel id = new JLabel("��ȭ��ȣ ���ڸ��� �Է����ּ���."); //id ��ü ����
		id.setFont(new Font("���� ���", Font.BOLD, 14));
		id.setBounds(45, 52, 284, 21);
		getContentPane().add(id);
		
		JLabel point = new JLabel("<����Ʈ ����>"); //point ��ü ����
		point.setFont(new Font("���� ���", Font.BOLD, 14));
		point.setBounds(111, 15, 125, 21);
		getContentPane().add(point);

		RoundedButton idButton = new RoundedButton(); //����Ʈ ���� Ȯ�� ��ư ��ü ����
		idButton.setText("Ȯ��");
		idButton.setBounds(174, 89, 68, 27);
		getContentPane().add(idButton);
		
		RoundedButton xButton = new RoundedButton(); //�������� ��ư ��ü ����
		xButton.addActionListener(new ActionListener() { //��ư Ŭ���� ���� �˾�â ������� ���� Ȯ�� �˾�â ��Ÿ���� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dialogafter3= new MyModalDialog4(this,psum);
				dialogafter3.setVisible(true);
			}
		});
		xButton.setText("��������");
		xButton.setBounds(244, 88, 68, 27);
		getContentPane().add(xButton);
		
		RoundedButton bb = new RoundedButton(); //����Ʈ ���� �� Ȯ�� ��ư ��ü ����
		bb.setBounds(192, 87, 68, 29);
		bb.setText("Ȯ��");
		getContentPane().add(bb);
		bb.setVisible(false);
		bb.addActionListener(new ActionListener() { //��ư Ŭ���� ���� �˾�â ������� ���� Ȯ�� �˾�â ��Ÿ���� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dialogafter3= new MyModalDialog4(this,psum); //���� �Ϸ� �Ǿ��ٴ� �˾�â ��ü ����
				dialogafter3.setVisible(true);
			}
		});
		
		
		idButton.addActionListener(new ActionListener() {//��ư Ŭ���� ���� �˾�â ������� ����Ʈ ���� ��� �˾�â ��Ÿ���� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				String input2;
				input2=textField.getText(); //�ؽ�Ʈ â�� �Է��� ���ڿ� 
				//������ ���۳�Ʈ ������� �ϱ�
				idButton.setVisible(false);
				id.setVisible(false);
				point.setVisible(false);
				textField.setVisible(false);
				xButton.setVisible(false);
				
				
					for(int i=0;i<clients.length;i++) { //�迭�� ũ�⸸ŭ for�� �ݺ�
						if(input2.equals(clients[i])) { // �Է��� ���� �迭�ȿ� �ִٸ�
							pointscore = new JLabel(input2+" ���� ���� ����Ʈ ������ "+ pointsum +"�Դϴ�."); // ���� ����Ʈ ���� label ��ü ����
							pointscore.setFont(new Font("���� ���", Font.BOLD, 14));
							pointscore.setBounds(40, 5, 280, 55);
							getContentPane().add(pointscore);
							
							clientsPoint[i]+=pointsum;
							
							pointscore2 = new JLabel(input2+"���� �� ����Ʈ�� "+clientsPoint[i]+"�Դϴ�."); // �� ����Ʈ ���� label ��ü ����
							pointscore2.setFont(new Font("���� ���", Font.BOLD, 14)); 
							pointscore2.setBounds(65, 28, 255, 80);
							getContentPane().add(pointscore2);
							
							bb.setVisible(true); 
							
							RoundedButton aa = new RoundedButton(); //����Ʈ ����ϱ� ��ư ��ü ����
							aa.setBounds(72, 87, 110, 29);
							aa.setText("����Ʈ ����ϱ�");
							getContentPane().add(aa);
							aa.addActionListener(new ActionListener() { //��ư Ŭ���� ����Ʈ���� �A ��ŭ �� ���� �ݾ� ����
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
							//�� ������ ��ϵǾ����� ���� ��� ��� �˾�â ����
							JOptionPane.showMessageDialog(null,input2+"���� ��ϵǾ����� �ʽ��ϴ�.","����Ʈ ���� ����",JOptionPane.ERROR_MESSAGE); 
							setVisible(false);
							dialogafter3= new MyModalDialog4(this,psum); //���� �Ϸ� �Ǿ��ٴ� �˾�â ��ü ����
							dialogafter3.setVisible(true);	
							break;
						}
				       
					}
						}
					});
		

		setLocation(new Point(300,200)); //ȭ�� ������ ȭ�� ��ġ ����
	    setSize(new Dimension(351, 186));
	    setTitle("����Ʈ ����");
	
	}
}
