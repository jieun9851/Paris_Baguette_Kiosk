package menu;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import button.RoundedButton;//��Ű�� button�� �ִ� RoundedButton Ŭ���� ��θ�
import product.*;//��Ű�� product�� �ִ� ProductContent Ŭ���� ��θ�
import mydilog.*;
import clock.*;

public class PbMenu extends JFrame{ //��ü ȭ���� �����ϴ� ������ Ŭ���� 
	
	private RoundedButton jButton1 = new RoundedButton();//����ǰ ��ư
    private RoundedButton jButton2 = new RoundedButton();//�� ��ư
    private RoundedButton jButton3 = new RoundedButton();//����ũ ��ư
    private RoundedButton jButton4 = new RoundedButton();//������ġ ��ư
    private RoundedButton jButton5 = new RoundedButton();//����Ʈ ��ư
    private RoundedButton jButton6 = new RoundedButton();//����� ��ư
    
    private JPanel jPanel1 = new JPanel (); //����ǰ �޴���
    private JPanel jPanel2 = new JPanel(); //�� �޴���
    private JPanel jPanel3 = new JPanel(); //����ũ �޴���
    private JPanel jPanel4 = new JPanel(); //������ġ �޴���
    private JPanel jPanel5 = new JPanel(); //����Ʈ �޴���
    private JPanel jPanel6 = new JPanel(); //����� �޴���
    
    private JPanel jCount = new JPanel(); //�ֹ�â
    private JLabel cost1; //��ǰ�� label
    private JLabel cost2; //�ݾ� label
    private JLabel cost3; //���� label
    public  JPanel p; //�ֹ�â�� ��ũ�ѹٸ� ��ġ�� panel

    //����ǰ �޴��� ��ư
    private ProductContent new1 = new ProductContent("��ġ��Ÿ��Ʈ",1500,"image/new1.jpg","image/cnew1.jpg");
    private ProductContent new2= new ProductContent("�ٻ���̽���",1800,"image/new2.jpg","image/cnew2.jpg");
    private ProductContent new3 = new ProductContent("��纣������",18000,"image/new3.jpg","image/cnew3.jpg");
    private ProductContent new4 = new ProductContent("��� ī���׶�",2500,"image/new4.jpg","image/cnew4.jpg");
    private ProductContent new5 = new ProductContent("��继",1200,"image/new5.jpg","image/cnew5.jpg");
    private ProductContent new6 = new ProductContent("���������ݶ�",8000,"image/new6.jpg","image/cnew6.jpg");
    private ProductContent new7 = new ProductContent("����ĳ��",7500,"image/new7.jpg","image/cnew7.jpg");
    private ProductContent new8 = new ProductContent("�ղʹ��",2300,"image/new8.jpg","image/cnew8.jpg");
   
    //�� �޴��� ��ư
    private ProductContent bread1 = new ProductContent("���ڻ�",2000,"image/bread1.jpg","image/cbread1.jpg"); 
    private ProductContent bread2 = new ProductContent("�ٻ�����",1500,"image/bread2.jpg","image/cbread2.jpg");
    private ProductContent bread3 = new ProductContent("��ȿ��",2100,"image/bread3.jpg","image/cbread3.jpg");
    private ProductContent bread4 = new ProductContent("�ӹ���",2500,"image/bread4.jpg","image/cbread4.jpg");
    private ProductContent bread5 = new ProductContent("���ϻ���",1800,"image/bread5.jpg","image/cbread5.jpg");
    private ProductContent bread6 = new ProductContent("���ڼҶ�",1700,"image/bread6.jpg","image/cbread6.jpg");
    private ProductContent bread7 = new ProductContent("���ڹٰԶ�",2500,"image/bread7.jpg","image/cbread7.jpg");
    private ProductContent bread8 = new ProductContent("ũ�οͻ�",800,"image/bread8.jpg","image/cbread8.jpg");
    
    //����ũ �޴��� ��ư
    private ProductContent cake1 = new ProductContent("��������ũ",24000,"image/cake1.jpg","image/ccake1.jpg");
    private ProductContent cake2 = new ProductContent("Ƽ��̼�",5600,"image/cake2.jpg","image/ccake2.jpg");
    private ProductContent cake3 = new ProductContent("��������ũ",5800,"image/cake3.jpg","image/ccake3.jpg");
    private ProductContent cake4 = new ProductContent("��������ũ",26000,"image/cake4.jpg","image/ccake4.jpg");
    private ProductContent cake5 = new ProductContent("ġ������ũ",4800,"image/cake5.jpg","image/ccake5.jpg");
    private ProductContent cake6 = new ProductContent("��������ũ",18000,"image/cake6.jpg","image/ccake6.jpg");
    private ProductContent cake7 = new ProductContent("�ڴ�����ũ",18000,"image/cake7.jpg","image/ccake7.jpg");
    
    //������ġ �޴��� ��ư
    private ProductContent sandwitch1 = new ProductContent("��׻���",5600,"image/sandwitch1.jpg","image/csandwitch1.jpg");
    private ProductContent sandwitch2 = new ProductContent("��ä�佺Ʈ",4800,"image/sandwitch2.jpg","image/csandwitch2.jpg");
    private ProductContent sandwitch3 = new ProductContent("ȣ���佺Ʈ",6300,"image/sandwitch3.jpg","image/csandwitch3.jpg");
    private ProductContent sandwitch4 = new ProductContent("��ġ�÷���",5000,"image/sandwitch4.jpg","image/csandwitch4.jpg");
    private ProductContent sandwitch5 = new ProductContent("ġŲ��",4500,"image/sandwitch5.jpg","image/csandwitch5.jpg");
    private ProductContent sandwitch6 = new ProductContent("����Ÿ������",7000,"image/sandwitch6.jpg","image/csandwitch6.jpg");
    private ProductContent sandwitch7 = new ProductContent("��ġ��ٰԶ�",6900,"image/sandwitch7.jpg","image/csandwitch7.jpg");

    
    //����Ʈ �޴��� ��ư
    private ProductContent desert1 = new ProductContent("�丶�����",1800,"image/desert1.jpg","image/cdesert1.jpg");
    private ProductContent desert2 = new ProductContent("���ڸ�",1500,"image/desert2.jpg","image/cdesert2.jpg");
    private ProductContent desert3 = new ProductContent("�����м�����",1500,"image/desert3.jpg","image/cdesert3.jpg");
    private ProductContent desert4 = new ProductContent("����",1200,"image/desert4.jpg","image/cdesert4.jpg");
    private ProductContent desert5 = new ProductContent("����",1200,"image/desert5.jpg","image/cdesert5.jpg");
    private ProductContent desert6 = new ProductContent("�ٴҶ�",1200,"image/desert6.jpg","image/cdesert6.jpg");
    private ProductContent desert7 = new ProductContent("���ڳӸӷ�",4000,"image/desert7.jpg","image/cdesert7.jpg");
    private ProductContent desert8 = new ProductContent("����ӷ�",4000,"image/desert8.jpg","image/cdesert8.jpg");
    
    //����� �޴��� ��ư
    private ProductContent drink1 = new ProductContent("����տ���",2000,"image/drink1.jpg","image/cdrink1.jpg");
    private ProductContent drink2 = new ProductContent("����յ���",2000,"image/drink2.jpg","image/cdrink2.jpg");
    private ProductContent drink3 = new ProductContent("�����",1800,"image/drink3.jpg","image/cdrink3.jpg");
    private ProductContent drink4 = new ProductContent("ī���",3600,"image/drink4.jpg","image/cdrink4.jpg");
    private ProductContent drink5 = new ProductContent("�ѿ���",1800,"image/drink5.jpg","image/cdrink5.jpg");
    private ProductContent drink6 = new ProductContent("������",2100,"image/drink6.jpg","image/cdrink6.jpg");
    private ProductContent drink7 = new ProductContent("��ũ����",1500,"image/drink7.jpg","image/cdrink7.jpg");
    
    private JPanel contentPane = (JPanel)this.getContentPane(); //����Ʈ�� ����
    
    private JLabel sum; //�հ� �ݾ��� ��Ÿ���� label
    public int psum; //��� ���� ��ǰ�� �հ�
    public int costsum; //���� ��ǰ ������ �� �ݾ�
    public int num; //��ǰ�� ����
    public RoundedButton pay; //���� ��ư
    
    private MyModalDialog dialog; //���� ���� �ǻ� ���� �˾�â
    
    public Time now; //����ð� panel
    
    private RoundedButton startButton = new RoundedButton(); //ó��ȭ�� ��ư
    
    
    public PbMenu() //PbMenu ������ 
    {
       super("�ĸ��ٰԶ�");//�������� Ÿ��Ʋ �ޱ�
       initializeComponent(); //�ʱ�ȭ�� �ҷ�����
       getContentPane().setBackground(Color.WHITE);//ȭ�� â ���� ����
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ �����츦 ������ ���α׷� ����
 
    }
    
    public void initializeComponent() { //�ʱ�ȭ�� �޼ҵ�
    
    jButton1.setText("����ǰ"); 
    jButton1.addMouseListener(new MouseAdapter() { //����ǰ ��ư Ŭ�� �ϸ� ����ǰ �޴��� ȣ���ϴ� �̺�Ʈ
      public void mouseClicked(MouseEvent e) 
        { 
         jButton1_mouseClicked(e); 
        } 
      
       }); 
     jButton2.setText("��");  
     jButton2.addMouseListener(new MouseAdapter() { //�� ��ư Ŭ�� �ϸ� ����ǰ �޴��� ȣ���ϴ� �̺�Ʈ
      public void mouseClicked(MouseEvent e) 
      { 
       jButton2_mouseClicked(e); 
      } 
         
     }); 
     jButton3.setText("����ũ"); 
     jButton3.addMouseListener(new MouseAdapter() { //����ũ ��ư Ŭ�� �ϸ� ����ǰ �޴��� ȣ���ϴ� �̺�Ʈ
      public void mouseClicked(MouseEvent e) 
      { 
       jButton3_mouseClicked(e); 
      } 
         
     }); 
     jButton4.setText("������ġ"); 
     jButton4.addMouseListener(new MouseAdapter() { //������ġ ��ư Ŭ�� �ϸ� ����ǰ �޴��� ȣ���ϴ� �̺�Ʈ
      public void mouseClicked(MouseEvent e) 
      { 
       jButton4_mouseClicked(e); 
      } 
         
     }); 
     jButton5.setText("����Ʈ"); 
     jButton5.addMouseListener(new MouseAdapter() { //����Ʈ ��ư Ŭ�� �ϸ� ����ǰ �޴��� ȣ���ϴ� �̺�Ʈ
      public void mouseClicked(MouseEvent e) 
      { 
       jButton5_mouseClicked(e); 
      } 
         
     }); 
     jButton6.setText("����"); 
     jButton6.addMouseListener(new MouseAdapter() { //���� ��ư Ŭ�� �ϸ� ����ǰ �޴��� ȣ���ϴ� �̺�Ʈ
      public void mouseClicked(MouseEvent e) 
      { 
       jButton6_mouseClicked(e); 
      } 
         
     }); 
     
     startButton.setText("ó��ȭ��");  
     startButton.addMouseListener(new MouseAdapter() { // ȭ�� ��ü�� �ʱ�ȭ������ �ٲٴ� �̺�Ʈ
         public void mouseClicked(MouseEvent e) 
         { 
        	p.revalidate(); //�ֹ�â�� ���� ������ �޾ƿ���
        	p.repaint(); //�ֹ�â �ٽ� �׸���
        	p.removeAll(); //�ֹ�â�� �ִ� ��� ���۳�Ʈ�� ����
        	sum.setVisible(false); // sum label �Ⱥ��̰� �ϱ�
        	pay.setVisible(false); // pay��ư �Ⱥ��̰� �ϱ�
        	psum=0; //�� �ݾ� �ʱ�ȭ
        	costsum=0; //�� ��ǰ�� �Ѿ� �ʱ�ȭ
        	num=0; //�� ��ǰ ���� ���� �ʱ�ȭ
        	
        	jPanel1.setVisible(true); //jPanel1�� ���̰� �ϱ�
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jButton1.setVisible(true); //jButton1�� ���̰� �ϱ�
     	   	jButton4.setVisible(true);
     	   	jButton2.setVisible(true);
     	   	jButton3.setVisible(true);
     	   	jButton5.setVisible(true);
     	   	jButton6.setVisible(true);
         } 
            
        }); 
     
    
	jPanel1.setLayout(new GridLayout(2,4)); //����ǰ �޴��ǿ� �� ��ǰ�� �׸���� �迭
	jPanel1.setBackground(Color.WHITE);
    jPanel1.add(new1); //����ǰ�� �޴��ǿ� ����
    jPanel1.add(new2);
    jPanel1.add(new3);
    jPanel1.add(new4);
    jPanel1.add(new5);
    jPanel1.add(new6);
    jPanel1.add(new7);
    jPanel1.add(new8);
 
    
    jPanel2.setLayout(new GridLayout(2,4));//�� �޴��ǿ� �� ��ǰ�� �׸���� �迭
    jPanel2.setBackground(Color.WHITE);
    jPanel2.add(bread1); //�� ��ǰ�� �޴��ǿ� ����
    jPanel2.add(bread2);
    jPanel2.add(bread3);
    jPanel2.add(bread4);
    jPanel2.add(bread5);
    jPanel2.add(bread6);
    jPanel2.add(bread7);
    jPanel2.add(bread8);
    
    jPanel3.setLayout(new GridLayout(2,4));//����ũ �޴��ǿ� �� ��ǰ�� 2*4�׸���� �迭
    jPanel3.setBackground(Color.WHITE); 
    jPanel3.add(cake1);//����ũ ��ǰ�� �޴��ǿ� ����
    jPanel3.add(cake2);
    jPanel3.add(cake3);
    jPanel3.add(cake4);
    jPanel3.add(cake5);
    jPanel3.add(cake6);
    jPanel3.add(cake7);
    
    jPanel4.setLayout(new GridLayout(2,4)); //������ġ �޴��ǿ� �� ��ǰ�� 2*4�׸���� �迭
    jPanel4.setBackground(Color.WHITE);
    jPanel4.add(sandwitch1);//������ġ ��ǰ�� �޴��ǿ� ����
    jPanel4.add(sandwitch2);
    jPanel4.add(sandwitch3);
    jPanel4.add(sandwitch4);
    jPanel4.add(sandwitch5);
    jPanel4.add(sandwitch6);
    jPanel4.add(sandwitch7);

    
    jPanel5.setLayout(new GridLayout(2,4));//����Ʈ �޴��ǿ� �� ��ǰ�� 2*4�׸���� �迭
    jPanel5.setBackground(Color.WHITE);
    jPanel5.add(desert1);//����Ʈ ��ǰ�� �޴��ǿ� ����
    jPanel5.add(desert2);
    jPanel5.add(desert3);
    jPanel5.add(desert4);
    jPanel5.add(desert5);
    jPanel5.add(desert6);
    jPanel5.add(desert7);
    jPanel5.add(desert8);
    
    jPanel6.setLayout(new GridLayout(2,4));//����޴��ǿ� �� ��ǰ�� 2*4�׸���� �迭
    jPanel6.setBackground(Color.WHITE);
    jPanel6.add(drink1);//���� ��ǰ�� �޴��ǿ� ����
    jPanel6.add(drink2);
    jPanel6.add(drink3);
    jPanel6.add(drink4);
    jPanel6.add(drink5);
    jPanel6.add(drink6);
    jPanel6.add(drink7);
    
    p = new JPanel(); // �ǳ� p ��ü ����
    JScrollPane jp = new JScrollPane(p); //�ǳ� p�� ��ũ�ѹ� ����
    jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //���� ��ũ�ѹ� ����
    jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //���� ��ũ�ѹ� �������� ����
    jp.setBounds(80,470,630,110);
    setVisible(true);
    add(jp); //jp ��ũ�ѹ� ����
    
    
    cost1= new JLabel("��ǰ��"); 
    addComponent(contentPane, cost1, 150,430,100,40); 
    cost2= new JLabel("�ݾ�");
    addComponent(contentPane, cost2, 365,430,100,40); 
    cost3= new JLabel("����");
    addComponent(contentPane, cost3, 580,430,100,40); 
  	
    p.setBackground(Color.WHITE);
	jCount.setBackground(Color.WHITE);
	cost1.setForeground(Color.BLUE);;
	cost1.setFont(new Font("���� ���", Font.BOLD, 14));
	cost2.setForeground(Color.BLUE);
	cost2.setFont(new Font("���� ���", Font.BOLD, 14));
	cost3.setForeground(Color.BLUE);
	cost3.setFont(new Font("���� ���", Font.BOLD, 14));
	p.setLayout(new GridLayout(0,3));
	
    
    
    sum = new JLabel(); // �ֹ�â ����
    addComponent(contentPane,sum,200,600,300,21); 
	pay = new RoundedButton();
	pay.setText("����");
	addComponent(contentPane,pay,590,595,100,30);
	pay.setVisible(false);
	
	pay.addActionListener(new ActionListener() { // ������ư Ŭ���� �ֹ�â�� ����â�� �ʱ�ȭ�ϰ� dialog �˾�â�� ���� �̺�Ʈ
		public void actionPerformed(ActionEvent e) { 
			dialog = new MyModalDialog(this,psum); //dialog �˾�â ��ü ����
			dialog.setVisible(true);
			p.revalidate();
        	p.repaint();
        	p.removeAll();
			psum=0;	
			sum.setVisible(false); 
        	pay.setVisible(false); 
				}
			});
	
	now = new Time(); //now ��ü ���� 
	now.setBackground(Color.WHITE);
	addComponent(contentPane, now, 10,10,140,70);

	//����ǰ �޴��� ��ư
    new1.addMouseListener(new MyMouseListener(p,"��ġ��Ÿ��Ʈ",1500,sum,costsum));
    new2.addMouseListener(new MyMouseListener(p,"�ٻ���̽���",1800,sum,costsum));
    new3.addMouseListener(new MyMouseListener(p,"��纣������",18000,sum,costsum));
    new4.addMouseListener(new MyMouseListener(p,"��� ī���׶�",2500,sum,costsum));
    new5.addMouseListener(new MyMouseListener(p,"��继",1200,sum,costsum));
    new6.addMouseListener(new MyMouseListener(p,"���������ݶ�",8000,sum,costsum));
    new7.addMouseListener(new MyMouseListener(p,"����ĳ��",7500,sum,costsum));
    new8.addMouseListener(new MyMouseListener(p,"�ղʹ��",2300,sum,costsum));
   
    //�� �޴��� ��ư
    bread1.addMouseListener(new MyMouseListener(p,"���ڻ�",2000,sum,costsum));
    bread2.addMouseListener(new MyMouseListener(p,"�ٻ�����",1500,sum,costsum));
    bread3.addMouseListener(new MyMouseListener(p,"��ȿ��",2100,sum,costsum));
    bread4.addMouseListener(new MyMouseListener(p,"�ӹ���",2500,sum,costsum));
    bread5.addMouseListener(new MyMouseListener(p,"���ϻ���",1800,sum,costsum));
    bread6.addMouseListener(new MyMouseListener(p,"���ڼҶ�",1700,sum,costsum));
    bread7.addMouseListener(new MyMouseListener(p,"���ڹٰԶ�",2500,sum,costsum));
    bread8.addMouseListener(new MyMouseListener(p,"ũ�οͻ�",800,sum,costsum));
    
    //����ũ �޴��� ��ư
    cake1.addMouseListener(new MyMouseListener(p,"��������ũ",24000,sum,costsum));
    cake2.addMouseListener(new MyMouseListener(p,"Ƽ��̼�",5600,sum,costsum));
    cake3.addMouseListener(new MyMouseListener(p,"��������ũ",5800,sum,costsum));
    cake4.addMouseListener(new MyMouseListener(p,"��������ũ",26000,sum,costsum));
    cake5.addMouseListener(new MyMouseListener(p,"ġ������ũ",4800,sum,costsum));
    cake6.addMouseListener(new MyMouseListener(p,"��������ũ",18000,sum,costsum));
    cake7.addMouseListener(new MyMouseListener(p,"�ڴ�����ũ",18000,sum,costsum));
    
    //������ġ �޴��� ��ư
    sandwitch1.addMouseListener(new MyMouseListener(p,"��׻���",5600,sum,costsum));
    sandwitch2.addMouseListener(new MyMouseListener(p,"��ä�佺Ʈ",4800,sum,costsum));
    sandwitch3.addMouseListener(new MyMouseListener(p,"ȣ���佺Ʈ",6300,sum,costsum));
    sandwitch4.addMouseListener(new MyMouseListener(p,"��ġ�÷���",5000,sum,costsum));
    sandwitch5.addMouseListener(new MyMouseListener(p,"ġŲ��",4500,sum,costsum));
    sandwitch6.addMouseListener(new MyMouseListener(p,"����Ÿ������",7000,sum,costsum));;
    sandwitch7.addMouseListener(new MyMouseListener(p,"��ġ��ٰԶ�",6900,sum,costsum));

    //����Ʈ �޴��� ��ư
    desert1.addMouseListener(new MyMouseListener(p,"�丶�����",1800,sum,costsum));
    desert2.addMouseListener(new MyMouseListener(p,"���ڸ�",1500,sum,costsum));
    desert3.addMouseListener(new MyMouseListener(p,"�����м�����",1500,sum,costsum));
    desert4.addMouseListener(new MyMouseListener(p,"����",1200,sum,costsum));
    desert5.addMouseListener(new MyMouseListener(p,"����",1200,sum,costsum));
    desert6.addMouseListener(new MyMouseListener(p,"�ٴҶ�",1200,sum,costsum));
    desert7.addMouseListener(new MyMouseListener(p,"���ڳӸӷ�",4000,sum,costsum));
    desert8.addMouseListener(new MyMouseListener(p,"����ӷ�",4000,sum,costsum));
    
    //����� �޴��� ��ư
    drink1.addMouseListener(new MyMouseListener(p,"����տ���",2000,sum,costsum));
    drink2.addMouseListener(new MyMouseListener(p,"����յ���",2000,sum,costsum));
    drink3.addMouseListener(new MyMouseListener(p,"�����",1800,sum,costsum));
    drink4.addMouseListener(new MyMouseListener(p,"ī���",3600,sum,costsum));
    drink5.addMouseListener(new MyMouseListener(p,"�ѿ���",1800,sum,costsum));
    drink6.addMouseListener(new MyMouseListener(p,"������",2100,sum,costsum));
    drink7.addMouseListener(new MyMouseListener(p,"��ũ����",1500,sum,costsum));
    
    contentPane.setLayout(null);//����Ʈ���� ��ġ������ ����

    //��ư 
    addComponent(contentPane, jButton1, 80,100,100,40); 
    addComponent(contentPane, jButton2, 186,100,100,40);
    addComponent(contentPane, jButton3, 292,100,100,40); 
    addComponent(contentPane, jButton4, 398,100,100,40); 
    addComponent(contentPane, jButton5, 504,100,100,40); 
    addComponent(contentPane, jButton6, 610,100,100,40); 
    addComponent(contentPane, startButton, 680,10,80,40);
    
    addComponent(contentPane, jPanel1, 80,150,630,280);
    addComponent(contentPane, jPanel2, 80,150,630,280);
    addComponent(contentPane, jPanel3, 80,150,630,280);
    addComponent(contentPane, jPanel4, 80,150,630,280);
    addComponent(contentPane, jPanel5, 80,150,630,280);
    addComponent(contentPane, jPanel6, 80,150,630,280);
    
    setTitle("�ĸ��ٰԶ�"); //�������� Ÿ��Ʋ �ޱ�
    setLocation(new Point(0,0)); //ȭ�� ������ ȭ�� ��ġ ����
    setSize(new Dimension(790, 680)); //�������� ũ�� ����
    ImageIcon beauty = new ImageIcon("image/logo.png"); //�ΰ� �̹��� ��ü ����
    JLabel imageLabel = new JLabel(beauty); //�ΰ� �� ��ü ����
    addComponent(contentPane, imageLabel, 70,10,650,90);//�ΰ� ��ġ ����
    addComponent(contentPane, jCount, 80,430,630,150);//�ֹ�â ��ġ ����

    
    }  
     //��ġ ���� �ϴ� addComponent �޼ҵ� ����
     private void addComponent(Container container,Component c,int x,int y,int width,int height) 
    { 
     c.setBounds(x,y,width,height);//ũ��� ��ġ ���� ����
     container.add(c); //container�� ���� �ϱ�
    } 
    
            
    
     private void jButton1_mouseClicked(MouseEvent e) //jButton1�� ���콺�� Ŭ�� �Ҷ� jPanel1�� ���̰� �ϴ� �̺�Ʈ �޼ҵ� 
     { 
       //jPanel1�� ���̰� �Ѵ�.
       jPanel1.setVisible(true);
       jPanel2.setVisible(false);
       jPanel3.setVisible(false);
       jPanel4.setVisible(false);
       jPanel5.setVisible(false);
       jPanel6.setVisible(false);
       
       //jButton1�� ���̰� �Ѵ�.
       jButton1.setVisible(false);
	   jButton4.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);
   
      }   
	  private void jButton2_mouseClicked(MouseEvent e) //jButton2�� ���콺�� Ŭ�� �Ҷ� jPanel2�� ���̰� �ϴ� �̺�Ʈ �޼ҵ� 
	  { 
		//jPanel2�� ���̰� �Ѵ�.
	   jPanel2.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel5.setVisible(false);
	   jPanel6.setVisible(false);
	   
	   //jButton2�� ���̰� �Ѵ�.
	   jButton2.setVisible(false);
	   jButton1.setVisible(true);
	   jButton4.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);

	  }
	 
	  private void jButton3_mouseClicked(MouseEvent e) //jButton3�� ���콺�� Ŭ�� �Ҷ� jPanel3�� ���̰� �ϴ� �̺�Ʈ �޼ҵ� 
	  {
		//jPanel3�� ���̰� �Ѵ�.  
	   jPanel3.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel5.setVisible(false);
	   jPanel6.setVisible(false);
	   
	  //jButton3�� ���̰� �Ѵ�.
	   jButton3.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton4.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);
	  }
	  

	  private void jButton4_mouseClicked(MouseEvent e) //jButton4�� ���콺�� Ŭ�� �Ҷ� jPanel4�� ���̰� �ϴ� �̺�Ʈ �޼ҵ� 
	  { 
		//jPanel4�� ���̰� �Ѵ�.  
	   jPanel4.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel5.setVisible(false);
	   jPanel6.setVisible(false);
	   
	   //jButton4�� ���̰� �Ѵ�.
	   jButton4.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);

	  }

	  private void jButton5_mouseClicked(MouseEvent e) //jButton5�� ���콺�� Ŭ�� �Ҷ� jPanel5�� ���̰� �ϴ� �̺�Ʈ �޼ҵ� 
	  { 
		//jPanel5�� ���̰� �Ѵ�.  
	   jPanel5.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel6.setVisible(false);
	   
	   //jButton5�� ���̰� �Ѵ�.
	   jButton5.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton4.setVisible(true);
	   jButton6.setVisible(true);


	  }

	  private void jButton6_mouseClicked(MouseEvent e) //jButton6�� ���콺�� Ŭ�� �Ҷ� jPanel6�� ���̰� �ϴ� �̺�Ʈ �޼ҵ� 
	  {
		//jPanel6�� ���̰� �Ѵ�.  
	   jPanel6.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel5.setVisible(false);
	   
	   //jButton6�� ���̰� �Ѵ�.
	   jButton6.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton4.setVisible(true);
	  }    
    	  class MyMouseListener extends MouseAdapter { // ��ǰ Ŭ���� �Ͼ�� �̺�Ʈ�� ��� �ִ� MyMouseListener Ŭ���� 
    			public JLabel jlabel1; //�ֹ�â�� �� ��ǰ��
    			public JLabel jlabel2; //�ֹ�â�� �� ��ǰ ����
    			public JPanel countButton; //���� ���� ��ư ���� �� panel
    			public RoundedButton b1; // - ��ư
    			public RoundedButton b2; //+ ��ư
    			public JLabel l; //���� ��Ÿ���� label
    			public RoundedButton check; // ���� Ȯ�� ��ư
    			public JLabel sum; //���� �Ϸ� �ݾ� 
    			
    			//�ٸ� Ŭ�������� �޾ƿ� ����
    			String cname;//��ǰ�� ���ڿ�
    			JPanel jpanel;//�ֹ�â panel
    			int ccost;//���� ���� 
    		    int costsum;//�� ��ǰ �ѱݾ�
    		    
      		    int i=1;// ��ǰ ���� 
    
    			public MyMouseListener(JPanel jpanel,String cname,int ccost,JLabel sum,int costsum) { //MyMouseListener ������
    				this.ccost=ccost;
    				this.cname=cname;
    				this.jpanel=jpanel;
    				this.sum=sum;
    				this.costsum=costsum;

    			}
    			
    			public void mousePressed(MouseEvent e) { 
    				
    				jlabel1 = new JLabel(); // ��ǰ�� ��ü ����
    				jlabel1.setText(cname);
    				jpanel.add(jlabel1);
    				jlabel1.setHorizontalAlignment(JLabel.CENTER);
    				jlabel1.setFont(new Font("���� ���", Font.BOLD, 14));
    			     
    				jlabel2 = new JLabel(); // ���� ��ü ����
    				jlabel2.setText(ccost+"��");
    				jpanel.add(jlabel2);
    				jlabel2.setHorizontalAlignment(JLabel.CENTER);
    				jlabel2.setFont(new Font("���� ���", Font.BOLD, 14));
    				
    				countButton = new JPanel(); // ���� panel ��ü ����
    				countButton.setSize(30,20);
    				jpanel.add(countButton);
    				countButton.setBackground(Color.WHITE);
    				
    				b1 = new RoundedButton(); //- ��ư ����
    				b1.setText("-");
    				
    				b1.addMouseListener(new MouseAdapter() { //- ��ư Ŭ���� ���� -1�ϴ� �̺�Ʈ
    					public void mousePressed(MouseEvent arg0) {
    						i--;
    						if(i<0) {
    							i=0;
    						}
    						l.setText(i+"��");
    					}
    				});
    				countButton.add(b1);
    				
    				
    				l = new JLabel(i+"��"); //���� label ��ü ����
    				l.setFont(new Font("���� ���", Font.BOLD, 14));
    				countButton.add(l);
    				
    				b2 = new RoundedButton(); //+ ��ư ����
    				b2.setText("+");
    				
    				b2.addMouseListener(new MouseAdapter() { //+ ��ư Ŭ���� ���� +1�ϴ� �̺�Ʈ
    					public void mousePressed(MouseEvent arg0) {
    						i++;
    						l.setText(i+"��");
    					}
    				});	
    				
    				countButton.add(b2);
    				
    				check = new RoundedButton(); //���� ��ư ��ü ����
    				check.setText("����");
    				
    				check.addMouseListener(new MouseAdapter() { //���� ��ư Ŭ���� ���� ��ȭ ��ư  ���� �� �� ��ǰ�ݾװ� ���� ��ư ��Ÿ���� �ϴ� �̺�Ʈ
    					public void mousePressed(MouseEvent arg0) {
    						costsum+=ccost*i;
    						psum+=costsum;
    					    sum.setText("�� ��ǰ�ݾ�:     "+psum+"��");
    					    sum.setFont(new Font("���� ���", Font.BOLD, 14)); 
    					    sum.setVisible(true);
    					    check.setVisible(false);
    					    b1.setVisible(false);
    					    b2.setVisible(false);
    					    pay.setVisible(true);
    					}
    				});	
    				countButton.add(check);
    				costsum=0; //�� ��ǰ �ѱݾ� �ʱ�ȭ
    				psum=0; //�� �ݾ� �ʱ�ȭ
    				
    			}
    			
    		}
    	     public static void main (String[] args) {//main �޼ҵ�
    	  	   new PbMenu();
    	     }
    	  }


