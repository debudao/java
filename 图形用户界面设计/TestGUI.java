import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestGUI extends JFrame implements ActionListener
{
    JButton english = new JButton("English Title");
    JButton 中文 = new JButton("中文标题");
    TestGUI()
   {
    setLayout(new FlowLayout());

	add(english);
	add(中文);

	english.addActionListener(this);
	中文.addActionListener(this);

	setLocation(100, 100);
	setSize(250, 150);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   }
	
    public void actionPerformed(ActionEvent ae)
   {
	if(ae.getSource() == english)
       {
	     this.setTitle("The first GUI");
       }
	if(ae.getSource() == 中文)
       {
	     this.setTitle("第一个图形界面");
       }
   }
    public static void main(String[] args)
   {
	new TestGUI();
   }
}