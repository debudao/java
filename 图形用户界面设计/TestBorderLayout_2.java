import javax.swing.*;
import java.awt.*; 
class TestBorderLayout_2
{
    public static void main(String args[])
    {
       JFrame win=new JFrame("����");
 
       win.setBounds(100,100,300,300);
       win.setVisible(true);

       JButton bSouth=new JButton("��"),
               bNorth=new JButton("��"),
               bEast =new JButton("��"),
               bWest =new JButton("��");
       JTextArea bCenter=new JTextArea("����");

       win.add(bNorth,BorderLayout.NORTH);
       win.add(bSouth,BorderLayout.SOUTH);
       win.add(bEast,BorderLayout.EAST);
       win.add(bWest,BorderLayout.WEST); 

       win.add(bCenter,BorderLayout.CENTER);

       win.validate();
       win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}