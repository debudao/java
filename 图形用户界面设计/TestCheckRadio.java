import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestCheckRadio extends JFrame implements ItemListener{
	JCheckBox italic = new JCheckBox("б��");
	JCheckBox bold = new JCheckBox("����");
	JRadioButton large = new JRadioButton("���ֺ�");
	JRadioButton middle = new JRadioButton("���ֺ�");
	JRadioButton small = new JRadioButton("С�ֺ�");	
	JTextArea area = new JTextArea();
	TestCheckRadio(){
		ButtonGroup group = new ButtonGroup();
		group.add(large);
		group.add(middle);
		group.add(small);
		
                setLayout(new GridLayout(1, 2, 10, 0));

		JPanel left = new JPanel();
		left.setLayout(new GridLayout(5, 1, 0, 10));
		left.add(italic);
		left.add(bold);
		left.add(large);
		left.add(middle);
		left.add(small);
		add(left);

		add(area);

		Font font = new Font("", 0, 25);
		area.setFont(font);
		area.setText("��ϲ��C++,\n����ϲ��Java");

		italic.addItemListener(this);
		bold.addItemListener(this);
		large.addItemListener(this);
		middle.addItemListener(this);
		small.addItemListener(this);

		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		int size = 25;
		if (small.isSelected())
			size = 15;
		if (large.isSelected())
			size = 35;
		int type = 0;
		if (italic.isSelected())
			type = type + Font.ITALIC;
		if (bold.isSelected())
			type = type + Font.BOLD;
		Font font = new Font("", type, size);
		area.setFont(font);
	}
	public static void main(String[] args){
		new TestCheckRadio();
	}
}