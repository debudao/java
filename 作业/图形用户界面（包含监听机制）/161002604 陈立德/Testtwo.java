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

	JLabel label1=new JLabel("��ȡ[1,10)֮����������");
	JLabel label2=new JLabel("�������Ĳ²⣺");
	JLabel label3=new JLabel("����ȷ����ť��");
	JTextField textfield=new JTextField();
	JButton button1=new JButton("�õ�һ�������");
	JButton button2=new JButton("ȷ��");
	JLabel label4=new JLabel("�޷�����Ϣ");
	
	int r=0;
	
	Testtwo(){
		this.setTitle("������С��Ϸ");
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
				label4.setText("�¶���");
			else if(r>Integer.parseInt(textfield.getText()))
				label4.setText("��С��");
			else
				label4.setText("�´���");
		}

	}

	public static void main(String[] args) {
		new Testtwo();

	}

}
