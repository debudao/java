import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class EditWindow extends JFrame implements ActionListener  
{  
    JMenuBar menubar;
    JMenu menu;
    JSplitPane splitPane;
    JMenuItem  itemCopy,itemCut,itemPaste; 
    JTextArea text1,text2;

    EditWindow(String s) 
    {  
      setTitle(s);        
              
      menubar=new JMenuBar();
 
      menu=new JMenu("�༭");
   
      itemCopy=new JMenuItem("����");
      itemCut=new JMenuItem("����");
      itemPaste=new JMenuItem("ճ��");

      menu.add(itemCopy);
      menu.add(itemCut);
      menu.add(itemPaste);
      
      itemCopy.addActionListener(this);
      itemCut.addActionListener(this);
      itemPaste.addActionListener(this);

      menubar.add(menu);
      setJMenuBar(menubar);

      text1=new JTextArea();
      text2=new JTextArea();

      splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,text1,text2);
      splitPane.setDividerLocation(120);
   
      add(splitPane,BorderLayout.CENTER);

      validate();
      setSize(260,270);
      setLocation(120,120);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

      
    } 
   public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==itemCopy)
           text1.copy();
       else if(e.getSource()==itemCut)
           text1.cut();
       else if(e.getSource()==itemPaste)
           text2.paste();
    }
}
public class TestJTextArea_2
{  
    public static void main(String args[])
    { 
      EditWindow win=new EditWindow("����");
    }
}