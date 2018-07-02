import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Testthree extends JFrame implements ActionListener {

	JButton clear=new JButton("清空");
	JButton[] b=new JButton[12];
	String s=new String("清空");
	
	Testthree() {
		JPanel center=new JPanel();
		center.setLayout(new GridLayout(4, 3));
		JButton[] b=new JButton[12];
		for(int i=0;i<10;i++) {
			b[i]=new JButton(i+"");
			b[i].addActionListener(this);
			center.add(b[i]);
		}
		
		b[10]=new JButton("加");
		b[10].addActionListener(this);
		center.add(b[10]);
		b[11]=new JButton("等于");
		b[11].addActionListener(this);
		
		center.add(b[11]);
		clear.addActionListener(this);
		
		add(clear,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
		
		this.setSize(550, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {

		JButton j=(JButton)e.getSource();
		if(e.getActionCommand()=="加") {			
			s+="+";			
			clear.setText(s);
		}else if(e.getActionCommand()=="等于") {
			String[] ss=s.split("\\+");
			int sum=0;
			for(int i=0;i<ss.length;i++)
				sum+=(Integer.parseInt(ss[i]));
			s+=("="+sum);
			clear.setText(s);
			
		}else if(e.getSource()==clear) {
			s="清空";
			clear.setText(s);
	}else {
		if(s.equals("清空"))
			s=e.getActionCommand()+"";
		else 
			s+=(e.getActionCommand()+"");
		clear.setText(s);	

	}
		
		

	}

	public static void main(String[] args) {
		new Testthree();

	}

}
