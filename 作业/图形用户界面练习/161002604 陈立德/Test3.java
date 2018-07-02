import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test3 extends JFrame {
	
	
	Test3(){
		
		
		
		
		JButton clear=new JButton("Çå¿Õ");
		
		
		JPanel center=new JPanel();
		center.setLayout(new GridLayout(4, 3));
		JButton[] b=new JButton[12];
		for(int i=0;i<12;i++) {
			b[i]=new JButton(i+"");
			center.add(b[i]);
		}
		
		add(clear,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
		
		this.setSize(550, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test3();

	}

}
