import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestMouseMotionListener extends JFrame implements MouseMotionListener
{
    int relativeX;
    int relativeY;
    TestMouseMotionListener()
   {
	addMouseListener(new MouseAdapter()
                        {
	                   public void mousePressed(MouseEvent e)
                          {
		             PointerInfo pi = MouseInfo.getPointerInfo();
		             Point pointCurr = pi.getLocation();
		             Point pointUpLeft = getLocation();
		             relativeX = pointCurr.x - pointUpLeft.x;
		             relativeY = pointCurr.y - pointUpLeft.y;
	                  }
	                });
	addMouseMotionListener(this);
	setBounds(50, 50, 350, 100);
	setTitle("在窗体任意位置按下鼠标可拖动窗体");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
    }
     public void mouseMoved(MouseEvent e){}
     public void mouseDragged(MouseEvent e)
    {
	PointerInfo pi = MouseInfo.getPointerInfo();
	Point pointNow = pi.getLocation();
	this.setLocation(pointNow.x - relativeX, pointNow.y - relativeY);
    }
    public static void main(String[] args)
   {
	new TestMouseMotionListener();
   }
}