import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GuessNumber extends JFrame implements ActionListener
{
      int number;
      JButton buttonGetNumber=new JButton("�õ�һ�������");
      JButton buttonEnter=new JButton("ȷ��");
      JTextField inputNumber=new JTextField();
      JLabel feedBack=new JLabel("�޷�����Ϣ");
      GuessNumber()
      {
           setLayout(new GridLayout(3,1));

           feedBack.setForeground(Color.blue);

           buttonGetNumber.addActionListener(this);
           buttonEnter.addActionListener(this);

           JPanel p1=new JPanel();
           p1.setLayout(new GridLayout(2,2,0,5));
           p1.add(new JLabel("��ȡ[1,10]֮����������"));
           p1.add(buttonGetNumber);
           p1.add(new JLabel("�������Ĳ²⣺"));
           p1.add(inputNumber);

           JPanel p2=new JPanel();
           p2.setLayout(new FlowLayout(FlowLayout.CENTER));
           p2.add(new JLabel("����ȷ����ť��"));
           p2.add(buttonEnter);

           JPanel p3=new JPanel();
           p3.setLayout(new FlowLayout(FlowLayout.CENTER));
           p3.add(feedBack);
           

           add(p1);
           add(p2);
           add(p3);

           setTitle("������С��Ϸ");
           setBounds(100,100,300,200);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent e)
     {
           JButton button=(JButton)e.getSource();
           if(button==buttonGetNumber)
               number=(int)(Math.random()*9)+1;
           if(button==buttonEnter)
          {
               int guess;
               String s=inputNumber.getText();
               guess=Integer.parseInt(s);
               if(guess==number)
                  feedBack.setText("�¶���");
               else if(guess>number)
                  feedBack.setText("�´���");
               else
                  feedBack.setText("��С��");
           }

      }
      public static void main(String[] args)
     {
           new GuessNumber();
     }
}