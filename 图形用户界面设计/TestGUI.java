import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestGUI extends JFrame implements ActionListener
{
    JButton english = new JButton("English Title");
    JButton ���� = new JButton("���ı���");
    TestGUI()
   {
    setLayout(new FlowLayout());

	add(english);
	add(����);

	english.addActionListener(this);
	����.addActionListener(this);

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
	if(ae.getSource() == ����)
       {
	     this.setTitle("��һ��ͼ�ν���");
       }
   }
    public static void main(String[] args)
   {
	new TestGUI();
   }
}