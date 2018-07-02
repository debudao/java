import java.awt.*;
import javax.swing.*;
class WindowFlow extends JFrame 
{  
    JButton b[]=new JButton[10];
    WindowFlow(String s) 
    { 
      setTitle(s);

      FlowLayout flow=new FlowLayout();

      flow.setAlignment(FlowLayout.LEFT);

      flow.setHgap(2);
      flow.setVgap(8);

      setLayout(flow);

      for(int i=0;i<b.length;i++) 
      { 
           b[i]=new JButton(""+i);
           add(b[i]);
           if(i==b.length-1)
              b[i].setPreferredSize(new Dimension(80,40));
      }
      validate();
      setBounds(100,100,200,160);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
class TestFlowLayout_2
{
    public static void main(String args[])
    { 
       WindowFlow win=new WindowFlow("FlowLayout���ִ���");
    }
}