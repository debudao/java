import javax.swing.*;
//import java.awt.event.InputEvent;
//import java.awt.event.KeyEvent;
class FirstWindow1 extends JFrame  
{  
    JMenuBar menubar;
    JMenu menu,menubaby;
    JMenuItem item,item_baby1,item_baby2; 

    FirstWindow1(String s) 
    {  
      setTitle(s);        
      setSize(160,170);
      setLocation(120,120);
      setVisible(true); 
              
      menubar=new JMenuBar();
 
      menu=new JMenu("文件");
      menubaby=new JMenu("保存");
	  
  
      item=new JMenuItem("打开",new ImageIcon("open.gif"));
     
      item_baby1=new JMenuItem("存在默认路径");
      
      item_baby2=new JMenuItem("另存为");
	  
      menubaby.add(item_baby1);
      menubaby.addSeparator();
      menubaby.add(item_baby2);
	  
      item.setAccelerator(KeyStroke.getKeyStroke('O')); 
        
      menu.add(item);
      menu.addSeparator();
      menu.add(menubaby);
	  
      menubar.add(menu);
      setJMenuBar(menubar);

      validate();
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } 
}
public class TestMenu_new
{  
    public static void main(String args[])
    { 
      FirstWindow1 win=new FirstWindow1("一个简单的窗口");  
    }
}