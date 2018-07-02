import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class MouseWindow extends JFrame implements MouseListener 
{ 		
    JButton button;
    JTextArea textArea;
    MouseWindow() 
    { 
      setLayout(new FlowLayout());
      addMouseListener(this);

      button=new JButton("���ǰ�ť"); 
      button.addMouseListener(this);

      textArea=new JTextArea(8,28);

      add(button); 
      add(new JScrollPane(textArea));

      setBounds(100,100,350,280);
      setVisible(true);
      validate();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mousePressed(MouseEvent e)
    { 
      textArea.append("\n��갴��,λ��:"+"("+e.getX()+","+e.getY()+")");
    }
    public void mouseReleased(MouseEvent e) 
    {
      if(e.getSource()==button)
       {
          textArea.append("\n�ڰ�ť������Ϳ�,λ��:"+"("+e.getX()+","+e.getY()+")");
       }
    }
   public void mouseEntered(MouseEvent e) 
   {
       if(e.getSource()==button)
       {
         textArea.append("\n�����밴ť,λ��:"+"("+e.getX()+","+e.getY()+")");
       }  
   }
   public void mouseExited(MouseEvent e)
   {
   }
   public void mouseClicked(MouseEvent e)
   {
      if(e.getModifiers()==InputEvent.BUTTON3_MASK&&e.getClickCount()>=2)
       {
         textArea.setText("��˫��������Ҽ�");
       }
   }
}
public class TestMouse_1
{
    public static void main(String args[])
    { 
       MouseWindow win=new MouseWindow();
    }
}
