package lab5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lab5_main extends JFrame implements ActionListener {

	JLabel label1=new JLabel("�������ļ�·�������ƣ�");
	JLabel label2=new JLabel("�뵥�����水ť���浽�ļ���");
	JTextField textfield1=new JTextField();
	//JTextField textfield2=new JTextField();
	JButton button=new JButton("����"); 
	JTextArea textarea=new JTextArea();
	
	public Lab5_main() {
		JPanel north=new JPanel();
		north.setLayout(new GridLayout(2, 2));
		north.add(label1);
		north.add(textfield1);
		north.add(label2);
		//north.add(textfield2);
		north.add(button);
		
		
		
		textarea.setLineWrap(false);
		textfield1.addActionListener(this);
		//textfield2.addActionListener(this);
		button.addActionListener(this);
		
		
		this.add(north,BorderLayout.NORTH);
		this.add(new JScrollPane(textarea),BorderLayout.CENTER);
		this.setSize(420, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		ReadFile r=new ReadFile();
		r.readFile(textfield1.getText());
		if(e.getSource()==textfield1) {
			
			
			textarea.setText(r.ss);
		}else if(e.getSource()==button) {
			FileWriter fw = null;
			BufferedWriter bfw=null;
			
			try {
				fw=new FileWriter(textfield1.getText());
				bfw=new BufferedWriter(fw);
				
				bfw.write(textarea.getText());
				bfw.close();
				fw.close();
			}catch(IOException ee){
				System.out.println("����ʧ�ܣ�����·���Ƿ���ȷ");
			}
		}

	}

	public static void main(String[] args) {
		new Lab5_main();

	}

}
