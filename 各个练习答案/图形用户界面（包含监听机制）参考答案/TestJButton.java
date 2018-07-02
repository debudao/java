import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestJButton extends JFrame implements ActionListener
{
    JButton[] numButton = new JButton[10];
    JButton add = new JButton("加");
    JButton equal = new JButton("等于");
    JButton clear_show = new JButton("清空");
    TestJButton()
   {
	JPanel center = new JPanel();
	center.setLayout(new GridLayout(4, 3));

	for(int i=0; i<10; i++)
                {
	   numButton[i] = new JButton("" + i);
	   numButton[i].addActionListener(this);
	   center.add(numButton[i]);
               }
	add.addActionListener(this);
	center.add(add);

	equal.addActionListener(this);
	center.add(equal);

	clear_show.addActionListener(this);

	add(clear_show, BorderLayout.NORTH);
	add(center, BorderLayout.CENTER);

	setTitle("整数加法器");
	setLocation(100, 100);
	setSize(350, 200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public void actionPerformed(ActionEvent e)
    {
	JButton curr = (JButton)e.getSource();
	if(curr == clear_show)
       {
	    clear_show.setText("清空");
	    return;
       }
	for (int i=0; i<10; i++)
       {
	    if(curr == numButton[i])
                  {
		String content = clear_show.getText();
		if(content.equals("清空"))
		    content = "" + i;
		else
		    content += i;
		clear_show.setText(content);
	   }
	}
	    if(curr == add)
                   {
		String content = clear_show.getText();
                                    content += "+";
		clear_show.setText(content);
		return;
	   }
	   if(curr == equal)
                   {
		try{
		     String formula = clear_show.getText();
                                          String[] nums = formula.split("\\+");
		     int result = 0;
		     for(int i=0; i<nums.length; i++)
                                         {
			 result += Integer.parseInt(nums[i]);
		    }
		     formula += " = " + result;
		     clear_show.setText(formula);
		   }catch(Exception ex){
		     setTitle("输入错误，请按长按钮清空");
		   }
	   }
	}
	public static void main(String[] args)
       {
		new TestJButton();
       }
}