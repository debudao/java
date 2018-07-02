import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Testone extends JFrame implements ActionListener {

	JLabel label1=new JLabel("请输入文件路径和名称：");
	JLabel label2=new JLabel("请输入需要追加的内容：");
	JTextField textfield1=new JTextField();
	JTextField textfield2=new JTextField();
	JButton button=new JButton("将文本区的内容写入文件"); 
	JTextArea textarea=new JTextArea();
	
	Testone(){
		JPanel north=new JPanel();
		north.setLayout(new GridLayout(3, 2));
		north.add(label1);
		north.add(textfield1);
		north.add(label2);
		north.add(textfield2);
		north.add(button);
		
		
		
		textarea.setLineWrap(true);
		textfield1.addActionListener(this);
		textfield2.addActionListener(this);
		button.addActionListener(this);
		
		this.add(north,BorderLayout.NORTH);
		this.add(new JScrollPane(textarea),BorderLayout.CENTER);
		this.setSize(420, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==textfield1) {
			FileReader fr=null;
			BufferedReader bfr=null;
			try {
				fr = new FileReader(textfield1.getText());
				bfr=new BufferedReader(fr);
				
				String s=bfr.readLine();
				while(s!=null) {
					textarea.append(s+"\r\n");
					s=bfr.readLine();
				}
				bfr.close();
				fr.close();
				
			} catch (IOException e1) {
				System.out.println("文件不存在");
			}		
		}else if(e.getSource()==button) {
			FileWriter fw=null;
			BufferedWriter bfw=null;
			try {
				fw=new FileWriter(textfield1.getText());
				bfw=new BufferedWriter(fw);
				
				bfw.write(textarea.getText());
				bfw.close();
				fw.close();
			} catch (IOException e1) {
				System.out.println("保存失败");
			}
			
			
		}else if(e.getSource()==textfield2) {
			textarea.append(textfield2.getText()+"\r\n");
		}
		

	}

	public static void main(String[] args) {	
		new Testone();
	}

}
