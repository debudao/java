import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
class MathWindow extends JFrame 
{ 		
    JTextField inputText,showText;
    MathWindow(String s) 
    { 
      inputText=new JTextField(10);
      showText=new JTextField(10);

      inputText.addActionListener(new ActionListener()
                                  {   //ʵ��ActionListener�ӿڵ������ࡣ
                                      public void actionPerformed(ActionEvent e) 
                                      {
                                          String s=inputText.getText();
                                          try
                                             { 
                                                BigInteger n=new BigInteger(s); 
                                                n=n.pow(2);
                                                showText.setText(n.toString());   
                                             }
                                          catch(NumberFormatException ee)
                                             {
                                                showText.setText("�����������ַ�");
                                                inputText.setText(null);
                                             }  
                                      }
     
                                  }
                             );

      setLayout(new FlowLayout());
      add(inputText); 
      add(showText); 

      setBounds(100,100,150,150);
      setVisible(true);
      validate();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class TestActionEvent_3
{
    public static void main(String args[])
    { 
       MathWindow win=new MathWindow("����");
    }
}