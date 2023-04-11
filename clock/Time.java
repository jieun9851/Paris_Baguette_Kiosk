package clock;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;


public class Time extends JPanel //시계를 붙일 JPanel 클래스

{

        JLabel[] la = new JLabel[4]; //각 숫자를 붙이 4개의 배열 la 객체 생성
        runnable thread = new runnable(); // 타이머 스레드로 사용할 Runnable 객체 생성
        Thread th = new Thread(thread); //스레드 객체 생성

        {

                for(int i = 0; i<4; i++) 

                {
                		la[i] = new JLabel("0"); 
                        la[i].setFont(new Font("Arial", Font.PLAIN, 20));
                        la[i].setForeground(Color.BLUE);
                        this.add(la[i]);
                }

                th.start(); //스레드 시작
        }

        class runnable implements Runnable 
        {
        	public void run()
                {
                       while(true) //무한루트
                        {
                        	try
                                {
                                        Calendar c = Calendar.getInstance(); //실시간으로 시간을 받아오는 객체 c 생성
                                        int h = c.get(Calendar.HOUR_OF_DAY); //시 단위 h 생성
                                        int m = c.get(Calendar.MINUTE); //분 단위 m 생성
                                        int s = c.get(Calendar.SECOND); //초 단위 s 생성
                                        int AM_PM = c.get(Calendar.AM_PM); //오전 오후 구분 AM_PM 생성
                                        String day_night = "";
                                        if (AM_PM == 1){ //PM 과 AM 구분 하기 
                                            day_night = "PM";
                                        }else{                                                  
                                            day_night = "AM";
                                        }
 
                                        // 정수를 문자열로 교환
                                        String H = Integer.toString(h);
                                        String M = Integer.toString(m);
                                        String S = Integer.toString(s);              
                                        
                                        //label에 시계를 부착한다
                                        la[0].setText(H +":");
                                        la[1].setText(M +":");
                                        la[2].setText(S);
                                        la[3].setText(day_night);

                                        Thread.sleep(1000);//1초 동안 잠을 잔다.
                                }
                        		catch(InterruptedException e){
                                	return; //예외가 발생하면 스레드 종료
                                	} 
                             }
                          }
                        }
					}






