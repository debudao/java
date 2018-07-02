import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TestAreaFile extends JFrame implements ActionListener
{
	File file;
	FileWriter fileWriter;

        JLabel path=new JLabel("请输入文件路径和名称：");
        JTextField filePath = new JTextField();

	JLabel append = new JLabel("请输入需要追加的内容：");
	JTextField appendContent = new JTextField();

        JButton button=new JButton("将文本区的内容写入文件");
	
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
			     appendContent.setText("文件出现异常");
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