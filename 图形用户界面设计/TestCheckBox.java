import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class CheckBoxWindow extends JFrame implements ItemListener 
{  
    JCheckBox box;
    JLabel imageLabel;
    CheckBoxWindow(String s) 
    {  
      box=new JCheckBox("ÏÔÊ¾Í¼Ïñ");
      imageLabel=new JLabel(new ImageIcon("a.jpg"));
      imageLabel.setVisible(false);
      add(box,BorderLayout.NORTH);
      add(imageLabel,BorderLayout.CENTER);
      validate();
      box.addItemListener(this);
      setBounds(120,120,260,270);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } 
   public void itemStateChanged(ItemEvent e)
    {
       JCheckBox box=(JCheckBox)e.getItemSelectable();
       if(box.isSelected())
       {
          imageLabel.setVisible(true);
       }
       else
       {
          imageLabel.setVisible(false);
       }   
    }
}
public class TestCheckBox
{  
    public static void main(String args[])
    { 
      CheckBoxWindow win=new CheckBoxWindow("´°¿Ú");
    }
}
