import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GuessNumber extends JFrame implements ActionListener
{
      int number;
      JButton buttonGetNumber=new JButton("得到一个随机数");
      JButton buttonEnter=new JButton("确定");
      JTextField inputNumber=new JTextField();
      JLabel feedBack=new JLabel("无反馈信息");
      GuessNumber()
      {
           setLayout(new GridLayout(3,1));

           feedBack.setForeground(Color.blue);

           buttonGetNumber.addActionListener(this);
           buttonEnter.addActionListener(this);

           JPanel p1=new JPanel();
           p1.setLayout(new GridLayout(2,2,0,5));
           p1.add(new JLabel("获取[1,10]之间的随机数："));
           p1.add(buttonGetNumber);
           p1.add(new JLabel("输入您的猜测："));
           p1.add(inputNumber);

           JPanel p2=new JPanel();
           p2.setLayout(new FlowLayout(FlowLayout.CENTER));
           p2.add(new JLabel("单击确定按钮："));
           p2.add(buttonEnter);

           JPanel p3=new JPanel();
           p3.setLayout(new FlowLayout(FlowLayout.CENTER));
           p3.add(feedBack);
           

           add(p1);
           add(p2);
           add(p3);

           setTitle("猜数字小游戏");
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
                  feedBack.setText("猜对了");
               else if(guess>number)
                  feedBack.setText("猜大了");
               else
                  feedBack.setText("猜小了");
           }

      }
      public static void main(String[] args)
     {
           new GuessNumber();
     }
}