package product;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import button.RoundedButton;

public class ProductContent extends JButton{//상품의 정보를 설정한 버튼 클래스 생성
     String name;
     int cost;
     public JLabel productl,product2;//상품의 이름,가격 라벨
     public JTable jtable;
     public RoundedButton b1;
 	 public RoundedButton b2;
 	 public JLabel l;
 	 public RoundedButton check;
 	 public JPanel countButton;

     
     public ProductContent(String name,int cost,String image1,String image2) {//ProductContent 생성자,변수로  name,cost,image1,image2를 받아온다.
        
    	 productl= new JLabel();
         product2= new JLabel();

         ImageIcon icon = new ImageIcon(image1);//icon 객체 생성 
         ImageIcon rolloverIcon = new ImageIcon(image2);
         setIcon(icon);//icon 설정하기
         setRolloverIcon(rolloverIcon);//버튼을 커서 위에 올리면 rolloverIcon로 버튼 이미지가 바뀐다.
         
         productl.setText(cost+"원");//가격 설정하기
         productl.setFont(new Font("맑은 고딕", Font.BOLD, 10));
         add(productl,0);//버튼에 가격 부착
         
         product2.setText(name);//이름 설정하기
         add(product2,0);//버튼에 이름 부착
         product2.setFont(new Font("맑은 고딕", Font.BOLD, 10));
         
         setLayout(new FlowLayout(FlowLayout.CENTER,5,115));//버튼 위치 배치
         setBackground(Color.WHITE);//버튼 배경색 설정 
         

     
     }
     
}
