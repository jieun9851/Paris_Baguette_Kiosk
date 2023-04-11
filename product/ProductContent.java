package product;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import button.RoundedButton;

public class ProductContent extends JButton{//��ǰ�� ������ ������ ��ư Ŭ���� ����
     String name;
     int cost;
     public JLabel productl,product2;//��ǰ�� �̸�,���� ��
     public JTable jtable;
     public RoundedButton b1;
 	 public RoundedButton b2;
 	 public JLabel l;
 	 public RoundedButton check;
 	 public JPanel countButton;

     
     public ProductContent(String name,int cost,String image1,String image2) {//ProductContent ������,������  name,cost,image1,image2�� �޾ƿ´�.
        
    	 productl= new JLabel();
         product2= new JLabel();

         ImageIcon icon = new ImageIcon(image1);//icon ��ü ���� 
         ImageIcon rolloverIcon = new ImageIcon(image2);
         setIcon(icon);//icon �����ϱ�
         setRolloverIcon(rolloverIcon);//��ư�� Ŀ�� ���� �ø��� rolloverIcon�� ��ư �̹����� �ٲ��.
         
         productl.setText(cost+"��");//���� �����ϱ�
         productl.setFont(new Font("���� ���", Font.BOLD, 10));
         add(productl,0);//��ư�� ���� ����
         
         product2.setText(name);//�̸� �����ϱ�
         add(product2,0);//��ư�� �̸� ����
         product2.setFont(new Font("���� ���", Font.BOLD, 10));
         
         setLayout(new FlowLayout(FlowLayout.CENTER,5,115));//��ư ��ġ ��ġ
         setBackground(Color.WHITE);//��ư ���� ���� 
         

     
     }
     
}
