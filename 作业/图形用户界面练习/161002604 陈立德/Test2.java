import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test2 extends JFrame {
	
	JLabel label1=new JLabel("标签1");
	JLabel label2=new JLabel("标签2");
	JLabel label3=new JLabel("单击确定按钮：");
	JTextField textfield=new JTextField();
	JButton button1=new JButton("按钮1");
	JButton button2=new JButton("按钮2");
	
	Test2(){
		this.setLayout(new GridLayout(3,1));
		
		JPanel north1=new JPanel();
		north1.setLayout(new GridLayout(2, 2));
		north1.add(label1);
		north1.add(button1);
		north1.add(label2);
		north1.add(textfield);
		
		button1.setPreferredSize(new Dimension(80, 40));
		
		JPanel north2=new JPanel();
		north2.add(label3);
		north2.add(button2);
	    
		
		JPanel north3=new JPanel();
		north3.add(new JLabel("标签3"));
		
	    this.add(north1);
	    this.add(north2);
	    this.add(north3);

		
		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();

	}

}
