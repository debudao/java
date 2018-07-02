import java.awt.*;
import javax.swing.*;
public class TestFlowLayout
{
    public static void main(String[] args)
   {
      JFrame f = new JFrame();
      f.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 15));  
      JButton[] buttons = new JButton[5];
      for (int i=0; i<5; i++)
     {
	 buttons[i] = new JButton("°´Å¥" + i);
         f.add(buttons[i]);
     }
     f.setTitle("ÑéÖ¤FlowLayout");
     f.setBounds(100,100,250,150);
     f.setVisible(true);		          
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}