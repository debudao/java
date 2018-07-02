import java.awt.*;
import javax.swing.*;
public class TestGridLayout extends JFrame
{
     TestGridLayout()
    {
	GridLayout grid = new GridLayout(3,2,5,15);

    this.setLayout(grid);

	for(int i=0; i<4; i++)
       {
           add(new JButton("°´Å¥" + (i+1)));
       }
	setTitle("GridLayout²¼¾Ö");
	setLocation(200, 200);
	setSize(250, 250);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
      public static void main(String[] args)
     {
	new TestGridLayout();
     }
}