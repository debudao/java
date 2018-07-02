import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestField extends JFrame
{
    JPasswordField password = new JPasswordField(10);
    JTextField compact = new JTextField(10);
    JTextField loose = new JTextField(20);
    TestField()
   {
    setLayout(new GridLayout(6, 1, 0, 10));
	add(new JLabel("请输入密码，按回车键确认："));
	add(password);

	password.setEchoChar('+');
	password.addActionListener(new ActionListener()
                      {
	                  public void actionPerformed(ActionEvent e)
                         {
	                     char[] contentArray = password.getPassword();
	                     StringBuffer content = new StringBuffer("");
	                     for(int i=0; i<contentArray.length; i++)
                            {
		                 content.append(contentArray[i]);

                                 if(i<contentArray.length-1)
                                 {
		                    content.append(' ');
		                    content.append(' ');
                                 }
	                    }
	                     loose.setText(new String(content));
	                     String compactString = new String(contentArray);
	                     compact.setText(compactString);
	                }
		     });

        add(new JLabel("您输入的密码一定是："));
	add(compact);
	add(new JLabel("下面您可以更清楚地看清自己输入的密码了："));
	add(loose);

	setLocation(100,100);
	setSize(300, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
    }
    public static void main(String[] args)
   {
	new TestField();
   }
}