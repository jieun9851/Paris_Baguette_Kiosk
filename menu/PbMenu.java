package menu;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import button.RoundedButton;//패키지 button에 있는 RoundedButton 클래스 경로명
import product.*;//패키지 product에 있는 ProductContent 클래스 경로명
import mydilog.*;
import clock.*;

public class PbMenu extends JFrame{ //전체 화면을 생성하는 프레임 클래스 
	
	private RoundedButton jButton1 = new RoundedButton();//신제품 버튼
    private RoundedButton jButton2 = new RoundedButton();//빵 버튼
    private RoundedButton jButton3 = new RoundedButton();//케이크 버튼
    private RoundedButton jButton4 = new RoundedButton();//샌드위치 버튼
    private RoundedButton jButton5 = new RoundedButton();//디저트 버튼
    private RoundedButton jButton6 = new RoundedButton();//음료수 버튼
    
    private JPanel jPanel1 = new JPanel (); //신제품 메뉴판
    private JPanel jPanel2 = new JPanel(); //빵 메뉴판
    private JPanel jPanel3 = new JPanel(); //케이크 메뉴판
    private JPanel jPanel4 = new JPanel(); //샌드위치 메뉴판
    private JPanel jPanel5 = new JPanel(); //디저트 메뉴판
    private JPanel jPanel6 = new JPanel(); //음료수 메뉴판
    
    private JPanel jCount = new JPanel(); //주문창
    private JLabel cost1; //상품명 label
    private JLabel cost2; //금액 label
    private JLabel cost3; //수량 label
    public  JPanel p; //주문창에 스크롤바를 설치할 panel

    //신제품 메뉴들 버튼
    private ProductContent new1 = new ProductContent("앙치즈타르트",1500,"image/new1.jpg","image/cnew1.jpg");
    private ProductContent new2= new ProductContent("바삭라이스볼",1800,"image/new2.jpg","image/cnew2.jpg");
    private ProductContent new3 = new ProductContent("블루베리쉬폰",18000,"image/new3.jpg","image/cnew3.jpg");
    private ProductContent new4 = new ProductContent("흑당 카스테라",2500,"image/new4.jpg","image/cnew4.jpg");
    private ProductContent new5 = new ProductContent("흑당빵",1200,"image/new5.jpg","image/cnew5.jpg");
    private ProductContent new6 = new ProductContent("가나슈쇼콜라",8000,"image/new6.jpg","image/cnew6.jpg");
    private ProductContent new7 = new ProductContent("리얼캐롯",7500,"image/new7.jpg","image/cnew7.jpg");
    private ProductContent new8 = new ProductContent("왕꽈배기",2300,"image/new8.jpg","image/cnew8.jpg");
   
    //빵 메뉴들 버튼
    private ProductContent bread1 = new ProductContent("피자빵",2000,"image/bread1.jpg","image/cbread1.jpg"); 
    private ProductContent bread2 = new ProductContent("바삭파이",1500,"image/bread2.jpg","image/cbread2.jpg");
    private ProductContent bread3 = new ProductContent("발효빵",2100,"image/bread3.jpg","image/cbread3.jpg");
    private ProductContent bread4 = new ProductContent("앙버터",2500,"image/bread4.jpg","image/cbread4.jpg");
    private ProductContent bread5 = new ProductContent("포켓샌드",1800,"image/bread5.jpg","image/cbread5.jpg");
    private ProductContent bread6 = new ProductContent("초코소라",1700,"image/bread6.jpg","image/cbread6.jpg");
    private ProductContent bread7 = new ProductContent("피자바게뜨",2500,"image/bread7.jpg","image/cbread7.jpg");
    private ProductContent bread8 = new ProductContent("크로와상",800,"image/bread8.jpg","image/cbread8.jpg");
    
    //케이크 메뉴들 버튼
    private ProductContent cake1 = new ProductContent("딸기케이크",24000,"image/cake1.jpg","image/ccake1.jpg");
    private ProductContent cake2 = new ProductContent("티라미수",5600,"image/cake2.jpg","image/ccake2.jpg");
    private ProductContent cake3 = new ProductContent("가나케이크",5800,"image/cake3.jpg","image/ccake3.jpg");
    private ProductContent cake4 = new ProductContent("과일케이크",26000,"image/cake4.jpg","image/ccake4.jpg");
    private ProductContent cake5 = new ProductContent("치즈케이크",4800,"image/cake5.jpg","image/ccake5.jpg");
    private ProductContent cake6 = new ProductContent("브라운케이크",18000,"image/cake6.jpg","image/ccake6.jpg");
    private ProductContent cake7 = new ProductContent("코니케이크",18000,"image/cake7.jpg","image/ccake7.jpg");
    
    //샌드위치 메뉴들 버튼
    private ProductContent sandwitch1 = new ProductContent("모닝샌드",5600,"image/sandwitch1.jpg","image/csandwitch1.jpg");
    private ProductContent sandwitch2 = new ProductContent("야채토스트",4800,"image/sandwitch2.jpg","image/csandwitch2.jpg");
    private ProductContent sandwitch3 = new ProductContent("호밀토스트",6300,"image/sandwitch3.jpg","image/csandwitch3.jpg");
    private ProductContent sandwitch4 = new ProductContent("런치플러스",5000,"image/sandwitch4.jpg","image/csandwitch4.jpg");
    private ProductContent sandwitch5 = new ProductContent("치킨롤",4500,"image/sandwitch5.jpg","image/csandwitch5.jpg");
    private ProductContent sandwitch6 = new ProductContent("리코타샐러드",7000,"image/sandwitch6.jpg","image/csandwitch6.jpg");
    private ProductContent sandwitch7 = new ProductContent("햄치즈바게뜨",6900,"image/sandwitch7.jpg","image/csandwitch7.jpg");

    
    //디저트 메뉴들 버튼
    private ProductContent desert1 = new ProductContent("토마토바질",1800,"image/desert1.jpg","image/cdesert1.jpg");
    private ProductContent desert2 = new ProductContent("꿀자몽",1500,"image/desert2.jpg","image/cdesert2.jpg");
    private ProductContent desert3 = new ProductContent("망고패션코코",1500,"image/desert3.jpg","image/cdesert3.jpg");
    private ProductContent desert4 = new ProductContent("딸기",1200,"image/desert4.jpg","image/cdesert4.jpg");
    private ProductContent desert5 = new ProductContent("초코",1200,"image/desert5.jpg","image/cdesert5.jpg");
    private ProductContent desert6 = new ProductContent("바닐라",1200,"image/desert6.jpg","image/cdesert6.jpg");
    private ProductContent desert7 = new ProductContent("코코넛머랭",4000,"image/desert7.jpg","image/cdesert7.jpg");
    private ProductContent desert8 = new ProductContent("레몬머랭",4000,"image/desert8.jpg","image/cdesert8.jpg");
    
    //음료수 메뉴들 버튼
    private ProductContent drink1 = new ProductContent("유산균우유",2000,"image/drink1.jpg","image/cdrink1.jpg");
    private ProductContent drink2 = new ProductContent("유산균딸기",2000,"image/drink2.jpg","image/cdrink2.jpg");
    private ProductContent drink3 = new ProductContent("흰우유",1800,"image/drink3.jpg","image/cdrink3.jpg");
    private ProductContent drink4 = new ProductContent("카페라떼",3600,"image/drink4.jpg","image/cdrink4.jpg");
    private ProductContent drink5 = new ProductContent("팩우유",1800,"image/drink5.jpg","image/cdrink5.jpg");
    private ProductContent drink6 = new ProductContent("녹차라떼",2100,"image/drink6.jpg","image/cdrink6.jpg");
    private ProductContent drink7 = new ProductContent("밀크우유",1500,"image/drink7.jpg","image/cdrink7.jpg");
    
    private JPanel contentPane = (JPanel)this.getContentPane(); //컨텐트팬 생성
    
    private JLabel sum; //합계 금액을 나타내는 label
    public int psum; //모든 선택 상품의 합계
    public int costsum; //선택 상품 각각의 총 금액
    public int num; //상품의 개수
    public RoundedButton pay; //결제 버튼
    
    private MyModalDialog dialog; //결제 구매 의사 여부 팝업창
    
    public Time now; //현재시간 panel
    
    private RoundedButton startButton = new RoundedButton(); //처음화면 버튼
    
    
    public PbMenu() //PbMenu 생성자 
    {
       super("파리바게뜨");//프레임의 타이틀 달기
       initializeComponent(); //초기화면 불러오기
       getContentPane().setBackground(Color.WHITE);//화면 창 배경색 지정
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우를 닫으면 프로그램 종료
 
    }
    
    public void initializeComponent() { //초기화면 메소드
    
    jButton1.setText("신제품"); 
    jButton1.addMouseListener(new MouseAdapter() { //신제품 버튼 클릭 하면 신제품 메뉴판 호출하는 이벤트
      public void mouseClicked(MouseEvent e) 
        { 
         jButton1_mouseClicked(e); 
        } 
      
       }); 
     jButton2.setText("빵");  
     jButton2.addMouseListener(new MouseAdapter() { //빵 버튼 클릭 하면 신제품 메뉴판 호출하는 이벤트
      public void mouseClicked(MouseEvent e) 
      { 
       jButton2_mouseClicked(e); 
      } 
         
     }); 
     jButton3.setText("케이크"); 
     jButton3.addMouseListener(new MouseAdapter() { //케이크 버튼 클릭 하면 신제품 메뉴판 호출하는 이벤트
      public void mouseClicked(MouseEvent e) 
      { 
       jButton3_mouseClicked(e); 
      } 
         
     }); 
     jButton4.setText("샌드위치"); 
     jButton4.addMouseListener(new MouseAdapter() { //샌드위치 버튼 클릭 하면 신제품 메뉴판 호출하는 이벤트
      public void mouseClicked(MouseEvent e) 
      { 
       jButton4_mouseClicked(e); 
      } 
         
     }); 
     jButton5.setText("디저트"); 
     jButton5.addMouseListener(new MouseAdapter() { //디저트 버튼 클릭 하면 신제품 메뉴판 호출하는 이벤트
      public void mouseClicked(MouseEvent e) 
      { 
       jButton5_mouseClicked(e); 
      } 
         
     }); 
     jButton6.setText("음료"); 
     jButton6.addMouseListener(new MouseAdapter() { //음료 버튼 클릭 하면 신제품 메뉴판 호출하는 이벤트
      public void mouseClicked(MouseEvent e) 
      { 
       jButton6_mouseClicked(e); 
      } 
         
     }); 
     
     startButton.setText("처음화면");  
     startButton.addMouseListener(new MouseAdapter() { // 화면 전체를 초기화면으로 바꾸는 이벤트
         public void mouseClicked(MouseEvent e) 
         { 
        	p.revalidate(); //주문창에 붙은 데이터 받아오기
        	p.repaint(); //주문창 다시 그리기
        	p.removeAll(); //주문창에 있는 모든 컴퍼넌트를 삭제
        	sum.setVisible(false); // sum label 안보이게 하기
        	pay.setVisible(false); // pay버튼 안보이게 하기
        	psum=0; //총 금액 초기화
        	costsum=0; //각 상품의 총액 초기화
        	num=0; //각 상품 구매 개수 초기화
        	
        	jPanel1.setVisible(true); //jPanel1만 보이게 하기
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jButton1.setVisible(true); //jButton1만 보이게 하기
     	   	jButton4.setVisible(true);
     	   	jButton2.setVisible(true);
     	   	jButton3.setVisible(true);
     	   	jButton5.setVisible(true);
     	   	jButton6.setVisible(true);
         } 
            
        }); 
     
    
	jPanel1.setLayout(new GridLayout(2,4)); //신제품 메뉴판에 각 제품을 그리드로 배열
	jPanel1.setBackground(Color.WHITE);
    jPanel1.add(new1); //신제품들 메뉴판에 생성
    jPanel1.add(new2);
    jPanel1.add(new3);
    jPanel1.add(new4);
    jPanel1.add(new5);
    jPanel1.add(new6);
    jPanel1.add(new7);
    jPanel1.add(new8);
 
    
    jPanel2.setLayout(new GridLayout(2,4));//빵 메뉴판에 각 제품을 그리드로 배열
    jPanel2.setBackground(Color.WHITE);
    jPanel2.add(bread1); //빵 제품들 메뉴판에 생성
    jPanel2.add(bread2);
    jPanel2.add(bread3);
    jPanel2.add(bread4);
    jPanel2.add(bread5);
    jPanel2.add(bread6);
    jPanel2.add(bread7);
    jPanel2.add(bread8);
    
    jPanel3.setLayout(new GridLayout(2,4));//케이크 메뉴판에 각 제품을 2*4그리드로 배열
    jPanel3.setBackground(Color.WHITE); 
    jPanel3.add(cake1);//케이크 제품들 메뉴판에 생성
    jPanel3.add(cake2);
    jPanel3.add(cake3);
    jPanel3.add(cake4);
    jPanel3.add(cake5);
    jPanel3.add(cake6);
    jPanel3.add(cake7);
    
    jPanel4.setLayout(new GridLayout(2,4)); //샌드위치 메뉴판에 각 제품을 2*4그리드로 배열
    jPanel4.setBackground(Color.WHITE);
    jPanel4.add(sandwitch1);//샌드위치 제품들 메뉴판에 생성
    jPanel4.add(sandwitch2);
    jPanel4.add(sandwitch3);
    jPanel4.add(sandwitch4);
    jPanel4.add(sandwitch5);
    jPanel4.add(sandwitch6);
    jPanel4.add(sandwitch7);

    
    jPanel5.setLayout(new GridLayout(2,4));//디저트 메뉴판에 각 제품을 2*4그리드로 배열
    jPanel5.setBackground(Color.WHITE);
    jPanel5.add(desert1);//디저트 제품들 메뉴판에 생성
    jPanel5.add(desert2);
    jPanel5.add(desert3);
    jPanel5.add(desert4);
    jPanel5.add(desert5);
    jPanel5.add(desert6);
    jPanel5.add(desert7);
    jPanel5.add(desert8);
    
    jPanel6.setLayout(new GridLayout(2,4));//음료메뉴판에 각 제품을 2*4그리드로 배열
    jPanel6.setBackground(Color.WHITE);
    jPanel6.add(drink1);//음료 제품들 메뉴판에 생성
    jPanel6.add(drink2);
    jPanel6.add(drink3);
    jPanel6.add(drink4);
    jPanel6.add(drink5);
    jPanel6.add(drink6);
    jPanel6.add(drink7);
    
    p = new JPanel(); // 판넬 p 객체 생성
    JScrollPane jp = new JScrollPane(p); //판넬 p에 스크롤바 생성
    jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //수직 스크롤바 세팅
    jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //수평 스크롤바 세팅하지 않음
    jp.setBounds(80,470,630,110);
    setVisible(true);
    add(jp); //jp 스크롤바 부착
    
    
    cost1= new JLabel("상품명"); 
    addComponent(contentPane, cost1, 150,430,100,40); 
    cost2= new JLabel("금액");
    addComponent(contentPane, cost2, 365,430,100,40); 
    cost3= new JLabel("수량");
    addComponent(contentPane, cost3, 580,430,100,40); 
  	
    p.setBackground(Color.WHITE);
	jCount.setBackground(Color.WHITE);
	cost1.setForeground(Color.BLUE);;
	cost1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
	cost2.setForeground(Color.BLUE);
	cost2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
	cost3.setForeground(Color.BLUE);
	cost3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
	p.setLayout(new GridLayout(0,3));
	
    
    
    sum = new JLabel(); // 주문창 생성
    addComponent(contentPane,sum,200,600,300,21); 
	pay = new RoundedButton();
	pay.setText("결제");
	addComponent(contentPane,pay,590,595,100,30);
	pay.setVisible(false);
	
	pay.addActionListener(new ActionListener() { // 결제버튼 클릭시 주문창과 결제창을 초기화하고 dialog 팝업창을 여는 이벤트
		public void actionPerformed(ActionEvent e) { 
			dialog = new MyModalDialog(this,psum); //dialog 팝업창 객체 생성
			dialog.setVisible(true);
			p.revalidate();
        	p.repaint();
        	p.removeAll();
			psum=0;	
			sum.setVisible(false); 
        	pay.setVisible(false); 
				}
			});
	
	now = new Time(); //now 객체 생성 
	now.setBackground(Color.WHITE);
	addComponent(contentPane, now, 10,10,140,70);

	//신제품 메뉴들 버튼
    new1.addMouseListener(new MyMouseListener(p,"앙치즈타르트",1500,sum,costsum));
    new2.addMouseListener(new MyMouseListener(p,"바삭라이스볼",1800,sum,costsum));
    new3.addMouseListener(new MyMouseListener(p,"블루베리쉬폰",18000,sum,costsum));
    new4.addMouseListener(new MyMouseListener(p,"흑당 카스테라",2500,sum,costsum));
    new5.addMouseListener(new MyMouseListener(p,"흑당빵",1200,sum,costsum));
    new6.addMouseListener(new MyMouseListener(p,"가나슈쇼콜라",8000,sum,costsum));
    new7.addMouseListener(new MyMouseListener(p,"리얼캐롯",7500,sum,costsum));
    new8.addMouseListener(new MyMouseListener(p,"왕꽈배기",2300,sum,costsum));
   
    //빵 메뉴들 버튼
    bread1.addMouseListener(new MyMouseListener(p,"피자빵",2000,sum,costsum));
    bread2.addMouseListener(new MyMouseListener(p,"바삭파이",1500,sum,costsum));
    bread3.addMouseListener(new MyMouseListener(p,"발효빵",2100,sum,costsum));
    bread4.addMouseListener(new MyMouseListener(p,"앙버터",2500,sum,costsum));
    bread5.addMouseListener(new MyMouseListener(p,"포켓샌드",1800,sum,costsum));
    bread6.addMouseListener(new MyMouseListener(p,"초코소라",1700,sum,costsum));
    bread7.addMouseListener(new MyMouseListener(p,"피자바게뜨",2500,sum,costsum));
    bread8.addMouseListener(new MyMouseListener(p,"크로와상",800,sum,costsum));
    
    //케이크 메뉴들 버튼
    cake1.addMouseListener(new MyMouseListener(p,"딸기케이크",24000,sum,costsum));
    cake2.addMouseListener(new MyMouseListener(p,"티라미수",5600,sum,costsum));
    cake3.addMouseListener(new MyMouseListener(p,"가나케이크",5800,sum,costsum));
    cake4.addMouseListener(new MyMouseListener(p,"과일케이크",26000,sum,costsum));
    cake5.addMouseListener(new MyMouseListener(p,"치즈케이크",4800,sum,costsum));
    cake6.addMouseListener(new MyMouseListener(p,"브라운케이크",18000,sum,costsum));
    cake7.addMouseListener(new MyMouseListener(p,"코니케이크",18000,sum,costsum));
    
    //샌드위치 메뉴들 버튼
    sandwitch1.addMouseListener(new MyMouseListener(p,"모닝샌드",5600,sum,costsum));
    sandwitch2.addMouseListener(new MyMouseListener(p,"야채토스트",4800,sum,costsum));
    sandwitch3.addMouseListener(new MyMouseListener(p,"호밀토스트",6300,sum,costsum));
    sandwitch4.addMouseListener(new MyMouseListener(p,"런치플러스",5000,sum,costsum));
    sandwitch5.addMouseListener(new MyMouseListener(p,"치킨롤",4500,sum,costsum));
    sandwitch6.addMouseListener(new MyMouseListener(p,"리코타샐러드",7000,sum,costsum));;
    sandwitch7.addMouseListener(new MyMouseListener(p,"햄치즈바게뜨",6900,sum,costsum));

    //디저트 메뉴들 버튼
    desert1.addMouseListener(new MyMouseListener(p,"토마토바질",1800,sum,costsum));
    desert2.addMouseListener(new MyMouseListener(p,"꿀자몽",1500,sum,costsum));
    desert3.addMouseListener(new MyMouseListener(p,"망고패션코코",1500,sum,costsum));
    desert4.addMouseListener(new MyMouseListener(p,"딸기",1200,sum,costsum));
    desert5.addMouseListener(new MyMouseListener(p,"초코",1200,sum,costsum));
    desert6.addMouseListener(new MyMouseListener(p,"바닐라",1200,sum,costsum));
    desert7.addMouseListener(new MyMouseListener(p,"코코넛머랭",4000,sum,costsum));
    desert8.addMouseListener(new MyMouseListener(p,"레몬머랭",4000,sum,costsum));
    
    //음료수 메뉴들 버튼
    drink1.addMouseListener(new MyMouseListener(p,"유산균우유",2000,sum,costsum));
    drink2.addMouseListener(new MyMouseListener(p,"유산균딸기",2000,sum,costsum));
    drink3.addMouseListener(new MyMouseListener(p,"흰우유",1800,sum,costsum));
    drink4.addMouseListener(new MyMouseListener(p,"카페라떼",3600,sum,costsum));
    drink5.addMouseListener(new MyMouseListener(p,"팩우유",1800,sum,costsum));
    drink6.addMouseListener(new MyMouseListener(p,"녹차라떼",2100,sum,costsum));
    drink7.addMouseListener(new MyMouseListener(p,"밀크우유",1500,sum,costsum));
    
    contentPane.setLayout(null);//컨텐트팬의 배치관리자 제거

    //버튼 
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
    
    setTitle("파리바게뜨"); //프레임의 타이틀 달기
    setLocation(new Point(0,0)); //화면 생성시 화면 위치 설정
    setSize(new Dimension(790, 680)); //프레임의 크기 설정
    ImageIcon beauty = new ImageIcon("image/logo.png"); //로고 이미지 객체 생성
    JLabel imageLabel = new JLabel(beauty); //로고 라벨 객체 생성
    addComponent(contentPane, imageLabel, 70,10,650,90);//로고 배치 설정
    addComponent(contentPane, jCount, 80,430,630,150);//주문창 배치 설정

    
    }  
     //배치 관리 하는 addComponent 메소드 생성
     private void addComponent(Container container,Component c,int x,int y,int width,int height) 
    { 
     c.setBounds(x,y,width,height);//크기와 위치 동시 설정
     container.add(c); //container에 부착 하기
    } 
    
            
    
     private void jButton1_mouseClicked(MouseEvent e) //jButton1을 마우스로 클릭 할때 jPanel1만 보이게 하는 이벤트 메소드 
     { 
       //jPanel1만 보이게 한다.
       jPanel1.setVisible(true);
       jPanel2.setVisible(false);
       jPanel3.setVisible(false);
       jPanel4.setVisible(false);
       jPanel5.setVisible(false);
       jPanel6.setVisible(false);
       
       //jButton1만 보이게 한다.
       jButton1.setVisible(false);
	   jButton4.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);
   
      }   
	  private void jButton2_mouseClicked(MouseEvent e) //jButton2을 마우스로 클릭 할때 jPanel2만 보이게 하는 이벤트 메소드 
	  { 
		//jPanel2만 보이게 한다.
	   jPanel2.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel5.setVisible(false);
	   jPanel6.setVisible(false);
	   
	   //jButton2만 보이게 한다.
	   jButton2.setVisible(false);
	   jButton1.setVisible(true);
	   jButton4.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);

	  }
	 
	  private void jButton3_mouseClicked(MouseEvent e) //jButton3을 마우스로 클릭 할때 jPanel3만 보이게 하는 이벤트 메소드 
	  {
		//jPanel3만 보이게 한다.  
	   jPanel3.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel5.setVisible(false);
	   jPanel6.setVisible(false);
	   
	  //jButton3만 보이게 한다.
	   jButton3.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton4.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);
	  }
	  

	  private void jButton4_mouseClicked(MouseEvent e) //jButton4을 마우스로 클릭 할때 jPanel4만 보이게 하는 이벤트 메소드 
	  { 
		//jPanel4만 보이게 한다.  
	   jPanel4.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel5.setVisible(false);
	   jPanel6.setVisible(false);
	   
	   //jButton4만 보이게 한다.
	   jButton4.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton6.setVisible(true);

	  }

	  private void jButton5_mouseClicked(MouseEvent e) //jButton5을 마우스로 클릭 할때 jPanel5만 보이게 하는 이벤트 메소드 
	  { 
		//jPanel5만 보이게 한다.  
	   jPanel5.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel6.setVisible(false);
	   
	   //jButton5만 보이게 한다.
	   jButton5.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton4.setVisible(true);
	   jButton6.setVisible(true);


	  }

	  private void jButton6_mouseClicked(MouseEvent e) //jButton6을 마우스로 클릭 할때 jPanel6만 보이게 하는 이벤트 메소드 
	  {
		//jPanel6만 보이게 한다.  
	   jPanel6.setVisible(true);
	   jPanel1.setVisible(false);
	   jPanel2.setVisible(false);
	   jPanel3.setVisible(false);
	   jPanel4.setVisible(false);
	   jPanel5.setVisible(false);
	   
	   //jButton6만 보이게 한다.
	   jButton6.setVisible(false);
	   jButton1.setVisible(true);
	   jButton2.setVisible(true);
	   jButton3.setVisible(true);
	   jButton5.setVisible(true);
	   jButton4.setVisible(true);
	  }    
    	  class MyMouseListener extends MouseAdapter { // 상품 클릭시 일어나는 이벤트를 담고 있는 MyMouseListener 클래스 
    			public JLabel jlabel1; //주문창에 뜰 제품명
    			public JLabel jlabel2; //주문창에 뜰 상품 가격
    			public JPanel countButton; //수량 관련 버튼 부착 할 panel
    			public RoundedButton b1; // - 버튼
    			public RoundedButton b2; //+ 버튼
    			public JLabel l; //수량 나타내는 label
    			public RoundedButton check; // 개수 확정 버튼
    			public JLabel sum; //결제 완료 금액 
    			
    			//다른 클래스에서 받아올 정보
    			String cname;//상품명 문자열
    			JPanel jpanel;//주문창 panel
    			int ccost;//가격 정수 
    		    int costsum;//각 상품 총금액
    		    
      		    int i=1;// 상품 개수 
    
    			public MyMouseListener(JPanel jpanel,String cname,int ccost,JLabel sum,int costsum) { //MyMouseListener 생성자
    				this.ccost=ccost;
    				this.cname=cname;
    				this.jpanel=jpanel;
    				this.sum=sum;
    				this.costsum=costsum;

    			}
    			
    			public void mousePressed(MouseEvent e) { 
    				
    				jlabel1 = new JLabel(); // 상품명 객체 생성
    				jlabel1.setText(cname);
    				jpanel.add(jlabel1);
    				jlabel1.setHorizontalAlignment(JLabel.CENTER);
    				jlabel1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    			     
    				jlabel2 = new JLabel(); // 가격 객체 생성
    				jlabel2.setText(ccost+"원");
    				jpanel.add(jlabel2);
    				jlabel2.setHorizontalAlignment(JLabel.CENTER);
    				jlabel2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    				
    				countButton = new JPanel(); // 수량 panel 객체 생성
    				countButton.setSize(30,20);
    				jpanel.add(countButton);
    				countButton.setBackground(Color.WHITE);
    				
    				b1 = new RoundedButton(); //- 버튼 생성
    				b1.setText("-");
    				
    				b1.addMouseListener(new MouseAdapter() { //- 버튼 클릭시 수량 -1하는 이벤트
    					public void mousePressed(MouseEvent arg0) {
    						i--;
    						if(i<0) {
    							i=0;
    						}
    						l.setText(i+"개");
    					}
    				});
    				countButton.add(b1);
    				
    				
    				l = new JLabel(i+"개"); //수량 label 객체 생성
    				l.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    				countButton.add(l);
    				
    				b2 = new RoundedButton(); //+ 버튼 생성
    				b2.setText("+");
    				
    				b2.addMouseListener(new MouseAdapter() { //+ 버튼 클릭시 수량 +1하는 이벤트
    					public void mousePressed(MouseEvent arg0) {
    						i++;
    						l.setText(i+"개");
    					}
    				});	
    				
    				countButton.add(b2);
    				
    				check = new RoundedButton(); //선택 버튼 객체 생성
    				check.setText("선택");
    				
    				check.addMouseListener(new MouseAdapter() { //선택 버튼 클릭시 수량 변화 버튼  삭제 및 총 상품금액과 결제 버튼 나타나게 하는 이벤트
    					public void mousePressed(MouseEvent arg0) {
    						costsum+=ccost*i;
    						psum+=costsum;
    					    sum.setText("총 상품금액:     "+psum+"원");
    					    sum.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
    					    sum.setVisible(true);
    					    check.setVisible(false);
    					    b1.setVisible(false);
    					    b2.setVisible(false);
    					    pay.setVisible(true);
    					}
    				});	
    				countButton.add(check);
    				costsum=0; //각 상품 총금액 초기화
    				psum=0; //총 금액 초기화
    				
    			}
    			
    		}
    	     public static void main (String[] args) {//main 메소드
    	  	   new PbMenu();
    	     }
    	  }


