import java.awt.*;

import javax.swing.*;
public class TestBorderLayout extends JFrame
{
   TestBorderLayout()
  {
     add(BorderLayout.NORTH,new JButton("北区"));
     //add(BorderLayout.NORTH,new JButton("又北区"));
     add(BorderLayout.SOUTH,new JButton("南区"));
    // add(BorderLayout.EAST,new JButton("东区"));
     //add(BorderLayout.WEST,new JButton("西区"));
     //add(BorderLayout.CENTER,new JButton("中区"));

     setTitle("BorderLayout布局");
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