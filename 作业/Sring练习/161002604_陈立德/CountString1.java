package lab2;
import java.util.Scanner;


class CountSubString1
{
	void countSubString(String s, String substring)
	{
		int count=0;
		String regex="[\\p{Punct}' ']+";//��������ʽ�ѵ������߶�����źͿո񻻳�һ���ո�
		s=s.replaceAll(regex, " ");
		String []a=s.split(" ");
		System.out.println(s);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			if(a[i].equals(substring)==true)
				count++;
		}
				
		System.out.println(count);
	}
}

public class CountString1
{
       public static void main(String args[])
       {
              Scanner reader=new Scanner(System.in);
              System.out.println("�������ַ�����");
              String s=reader.nextLine();
              System.out.println("��������Ҫ�������Ӵ���");
               String substring=reader.nextLine();
             CountSubString1 a=new CountSubString1();
             a.countSubString(s, substring);
       }
}
