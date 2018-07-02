import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Testtwo extends JFrame implements ActionListener {

	JLabel label1=new JLabel("获取[1,10)之间的随机数：");
	JLabel label2=new JLabel("输入您的猜测：");
	JLabel label3=new JLabel("单击确定按钮：");
	JTextField textfield=new JTextField();
	JButton button1=new JButton("得到一个随机数");
	JButton button2=new JButton("确定");
	JLabel label4=new JLabel("无反馈信息");
	
	int r=0;
	
	Testtwo(){
		this.setTitle("猜数字小游戏");
		this.setLayout(new GridLayout(3,1));
		
		JPanel north1=new JPanel();
		north1.setLayout(new GridLayout(2, 2,0,5));
		north1.add(label1);
		north1.add(button1);
		north1.add(label2);
		north1.add(textfield);
		
		button1.setPreferredSize(new Dimension(80, 40));
		
		JPanel north2=new JPanel();
		north2.add(label3);
		north2.add(button2);
	    
		
		JPanel north3=new JPanel();
		
		label4.setForeground(Color.blue);
		north3.add(label4);
		
	    this.add(north1);
	    this.add(north2);
	    this.add(north3);

	    button1.addActionListener(this);
	    button2.addActionListener(this);

	    
		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			r=(int)(Math.random()*9+1);
		}else if(e.getSource()==button2) {
			if(r==Integer.parseInt(textfield.getText()))
				label4.setText("猜对了");
			else if(r>Integer.parseInt(textfield.getText()))
				label4.setText("猜小了");
			else
				label4.setText("猜大了");
		}

	}

	public static void main(String[] args) {
		new Testtwo();

	}

}
