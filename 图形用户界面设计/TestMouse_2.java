import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class JPopupMenuWindow extends JFrame implements ActionListener
{  
    JPopupMenu menu;
    JMenuItem  itemCopy,itemCut,itemPaste; 
    JTextArea text;
    JPopupMenuWindow(String s) 
    {  
      setTitle(s);        
                    
      menu=new JPopupMenu();
   
      itemCopy=new JMenuItem("¸´ÖÆ");
      itemCut=new JMenuItem("¼ôÇÐ");
      itemPaste=new JMenuItem("Õ³Ìù");
      menu.add(itemCopy);
      menu.add(itemCut);
      menu.add(itemPaste);

      text=new JTextArea();
      text.addMouseListener(new MouseAdapter()
                              {
                                 public void mousePressed(MouseEvent e)
                                 {
                                     if(e.getModifiers()==InputEvent.BUTTON3_MASK)
                                      {
                                         menu.show(text,e.getX(),e.getY());
                                      }
                                 }
                              }
                           );
      
      add(new JScrollPane(text),BorderLayout.CENTER);
      
      itemCopy.addActionListener(this);
      itemCut.addActionListener(this);
      itemPaste.addActionListener(this);

      validate();
      setSize(260,270);
      setLocation(120,120);
      setVisible(true); 
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    } 
   
   public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==itemCopy)
           text.copy();
       else if(e.getSource()==itemCut)
           text.cut();
       else if(e.getSource()==itemPaste)
           text.paste();
    }
}
public class TestMouse_2
{  
    public static void main(String args[])
    { 
      JPopupMenuWindow win=new JPopupMenuWindow("´°¿Ú");
    }
}
