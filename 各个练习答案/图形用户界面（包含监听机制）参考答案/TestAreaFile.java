import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TestAreaFile extends JFrame implements ActionListener
{
	File file;
	FileWriter fileWriter;

        JLabel path=new JLabel("�������ļ�·�������ƣ�");
        JTextField filePath = new JTextField();

	JLabel append = new JLabel("��������Ҫ׷�ӵ����ݣ�");
	JTextField appendContent = new JTextField();

        JButton button=new JButton("���ı���������д���ļ�");
	
	JTextArea area = new JTextArea();

	TestAreaFile()
       {
		JPanel north = new JPanel();
		north.setLayout(new GridLayout(3,2,0,5));

                north.add(path);
		north.add(filePath);

		north.add(append);
		north.add(appendContent);
                appendContent.addActionListener(this);

                north.add(button);
                button.addActionListener(this);
		
		add(north, BorderLayout.NORTH);
		add(new JScrollPane(area), BorderLayout.CENTER);

		setLocation(100, 100);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
       {
		Object obj = e.getSource();
		if (obj == button)
               {
		     try{
			     file = new File(filePath.getText());
			     fileWriter = new FileWriter(file);
			     fileWriter.write(area.getText());
			     fileWriter.flush();
			     fileWriter.close();
			}catch(IOException ee){
			     appendContent.setText("�ļ������쳣");
			}
		}
                else
                {
                     String block = appendContent.getText();
                     String temp=area.getText();
                     if(temp.equals(""))
                          area.append(block);
                     else
	                  area.append("\n"+block);
                }
		
	}
	public static void main(String[] args)
       {
		new TestAreaFile();
	}
}