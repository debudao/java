import java.awt.*;

import javax.swing.*;
public class TestBorderLayout extends JFrame
{
   TestBorderLayout()
  {
     add(BorderLayout.NORTH,new JButton("����"));
     //add(BorderLayout.NORTH,new JButton("�ֱ���"));
     add(BorderLayout.SOUTH,new JButton("����"));
    // add(BorderLayout.EAST,new JButton("����"));
     //add(BorderLayout.WEST,new JButton("����"));
     //add(BorderLayout.CENTER,new JButton("����"));

     setTitle("BorderLayout����");
     setLocation(200, 200);
     setSize(250, 250);
     //setBounds(200,200,600,600);
     setVisible(true);		        
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
   public static void main(String[] args)
  {
     new TestBorderLayout();
  }
}