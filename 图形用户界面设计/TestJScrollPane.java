import java.awt.*;
import javax.swing.*;
public class TestJScrollPane extends JFrame
{
    TestJScrollPane()
   {
	JPanel p = new JPanel();

	for(int i=0; i<30; i++)
       {
	   p.add(new JButton("��ť" + (i+1)));
       }

	JScrollPane scrollPane = new JScrollPane(p);

	add(scrollPane, BorderLayout.CENTER);

	setTitle("JScrollPane�м�����");
	setLocation(200, 200);
	setSize(250, 100);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    public static void main(String[] args)
   {
	new TestJScrollPane();
   }
}