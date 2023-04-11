package clock;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;


public class Time extends JPanel //�ð踦 ���� JPanel Ŭ����

{

        JLabel[] la = new JLabel[4]; //�� ���ڸ� ���� 4���� �迭 la ��ü ����
        runnable thread = new runnable(); // Ÿ�̸� ������� ����� Runnable ��ü ����
        Thread th = new Thread(thread); //������ ��ü ����

        {

                for(int i = 0; i<4; i++) 

                {
                		la[i] = new JLabel("0"); 
                        la[i].setFont(new Font("Arial", Font.PLAIN, 20));
                        la[i].setForeground(Color.BLUE);
                        this.add(la[i]);
                }

                th.start(); //������ ����
        }

        class runnable implements Runnable 
        {
        	public void run()
                {
                       while(true) //���ѷ�Ʈ
                        {
                        	try
                                {
                                        Calendar c = Calendar.getInstance(); //�ǽð����� �ð��� �޾ƿ��� ��ü c ����
                                        int h = c.get(Calendar.HOUR_OF_DAY); //�� ���� h ����
                                        int m = c.get(Calendar.MINUTE); //�� ���� m ����
                                        int s = c.get(Calendar.SECOND); //�� ���� s ����
                                        int AM_PM = c.get(Calendar.AM_PM); //���� ���� ���� AM_PM ����
                                        String day_night = "";
                                        if (AM_PM == 1){ //PM �� AM ���� �ϱ� 
                                            day_night = "PM";
                                        }else{                                                  
                                            day_night = "AM";
                                        }
 
                                        // ������ ���ڿ��� ��ȯ
                                        String H = Integer.toString(h);
                                        String M = Integer.toString(m);
                                        String S = Integer.toString(s);              
                                        
                                        //label�� �ð踦 �����Ѵ�
                                        la[0].setText(H +":");
                                        la[1].setText(M +":");
                                        la[2].setText(S);
                                        la[3].setText(day_night);

                                        Thread.sleep(1000);//1�� ���� ���� �ܴ�.
                                }
                        		catch(InterruptedException e){
                                	return; //���ܰ� �߻��ϸ� ������ ����
                                	} 
                             }
                          }
                        }
					}






