package button;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class RoundedButton extends JButton {//�޴��� ��ư�� �ձ۰� ����� ��ư Ŭ���� ����
	public RoundedButton() { //RoundedButto ������
		super(); 
		decorate(); //decorate ȣ��
	} 
   
	protected void decorate() { //decorate �޼ҵ� �ۼ�
		setBorderPainted(false);  
		setOpaque(false);
   	} 
	
	protected void paintComponent(Graphics g) {// paintComponent �޼ҵ�
		int width = getWidth(); //��ư �ʺ�
		int height = getHeight(); //��ư ����
		Graphics2D graphics = (Graphics2D) g;// �� ��ȯ
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//����� �簢���� �ε巴�� �׸� �� �ְ� ó��
		
		if (getModel().isArmed()) {//���콺�� ������ ���¿� ����� �� ����
			graphics.setColor(getBackground().darker());//��Ӱ�
		} 
		
		else if (getModel().isRollover()) {//���콺�� �÷��� ���¿� ����� �� ����//���
			graphics.setColor(getBackground().brighter());
		} 
		
		else { //���콺�� ��� ���¿�  ����� �� ����
			graphics.setColor(getBackground()); 
		}
		
		graphics.fillRoundRect(0, 0, width, height, 10, 10); //fillRoundRect �޼ҵ�� ����, ���� �ձ۱� ����
		FontMetrics fontMetrics = graphics.getFontMetrics(); 
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
		
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
		
		graphics.setColor(getForeground()); //������ �� ��������
		graphics.setFont(getFont()); //��Ʈ ��������
		graphics.drawString(getText(), textX, textY);//drawString�� ���� �׷��ֱ�
		graphics.dispose(); //graphics�� dispose()���ֱ�
		
		super.paintComponent(g);
		super.setBackground(Color.BLUE); //��ư ������ ����
		super.setForeground(Color.WHITE);//��ư �ȿ� �۾��� ����
		super.setFont(new Font("���� ���", Font.BOLD, 14));//08���ﳲ��ü B, 18�ȼ� ��Ʈ ����
		
		
		}
		
	}

