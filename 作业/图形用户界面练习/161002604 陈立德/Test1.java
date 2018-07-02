import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Test1 extends JFrame {

	
	JLabel label1=new JLabel("请输入文本：");
	JLabel label2=new JLabel("请输入文本：");
	JTextField textfield1=new JTextField();
	JTextField textfield2=new JTextField();
	JButton button=new JButton("确定"); 
	JTextArea textarea=new JTextArea();
	Test1(){
		JPanel north=new JPanel();
		north.setLayout(new GridLayout(3, 2));
		north.add(label1);
		north.add(textfield1);
		north.add(label2);
		north.add(textfield2);
		north.add(button);
		
		this.add(north,BorderLayout.NORTH);
		this.add(textarea,BorderLayout.CENTER);
		this.setSize(420, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test1();

	}

}
