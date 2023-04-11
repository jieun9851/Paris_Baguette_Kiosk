package button;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class RoundedButton extends JButton {//메뉴의 버튼을 둥글게 만드는 버튼 클래스 생성
	public RoundedButton() { //RoundedButto 생성자
		super(); 
		decorate(); //decorate 호출
	} 
   
	protected void decorate() { //decorate 메소드 작성
		setBorderPainted(false);  
		setOpaque(false);
   	} 
	
	protected void paintComponent(Graphics g) {// paintComponent 메소드
		int width = getWidth(); //버튼 너비
		int height = getHeight(); //버튼 높이
		Graphics2D graphics = (Graphics2D) g;// 형 변환
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//배경의 사각형을 부드럽게 그릴 수 있게 처리
		
		if (getModel().isArmed()) {//마우스가 눌려진 상태에 배경의 색 설정
			graphics.setColor(getBackground().darker());//어둡게
		} 
		
		else if (getModel().isRollover()) {//마우스가 올려진 상태에 배경의 색 설정//밝게
			graphics.setColor(getBackground().brighter());
		} 
		
		else { //마우스의 평소 상태에  배경의 색 설정
			graphics.setColor(getBackground()); 
		}
		
		graphics.fillRoundRect(0, 0, width, height, 10, 10); //fillRoundRect 메소드로 가로, 세로 둥글기 설정
		FontMetrics fontMetrics = graphics.getFontMetrics(); 
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
		
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
		
		graphics.setColor(getForeground()); //글자의 색 가져오기
		graphics.setFont(getFont()); //폰트 가져오기
		graphics.drawString(getText(), textX, textY);//drawString을 통해 그려주기
		graphics.dispose(); //graphics을 dispose()해주기
		
		super.paintComponent(g);
		super.setBackground(Color.BLUE); //버튼 바탕색 설정
		super.setForeground(Color.WHITE);//버튼 안에 글씨색 설정
		super.setFont(new Font("맑은 고딕", Font.BOLD, 14));//08서울남산체 B, 18픽셀 폰트 설정
		
		
		}
		
	}

