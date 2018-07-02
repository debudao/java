import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestJTextArea extends JFrame implements ActionListener
{
     JTextField input = new JTextField(25);
     JTextArea text = new JTextArea();
     JButton clear = new JButton("Çå¿Õ");
     JButton insert = new JButton("²åÈë");
     JButton delete = new JButton("É¾³ý");
     JButton append = new JButton("×·¼Ó");
     TestJTextArea()
    {
	JPanel north = new JPanel();
	north.setLayout(new GridLayout(2, 1));
	north.add(input);

	JPanel buttonPanel = new JPanel();
	buttonPanel.setLayout(new GridLayout(1, 4));
	buttonPanel.add(clear);
	buttonPanel.add(insert);
	buttonPanel.add(delete);
	buttonPanel.add(append);

	north.add(buttonPanel);

	add(north, BorderLayout.NORTH);
	add(new JScrollPane(text),BorderLayout.CENTER);

	clear.addActionListener(this);
	insert.addActionListener(this);
	delete.addActionListener(this);
	append.addActionListener(this);

	setLocation(100,100);
	setSize(300, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
   {
	Object source = e.getSource();
	if (source == clear)
	       text.setText("");
	if (source == append)
	       text.append(input.getText());
	if (source == insert)
       {
	       int selectionStart = text.getSelectionStart();
	       int selectionEnd = text.getSelectionEnd();
	       String newString = input.getText();
	       text.replaceRange(newString, selectionStart, selectionEnd);
       }
       if (source == delete)
      {
	       int selectionStart = text.getSelectionStart();
	       int selectionEnd = text.getSelectionEnd();
	       text.replaceRange("", selectionStart, selectionEnd);
      }
   }
   public static void main(String[] args)
  {
	new TestJTextArea();
  }
}