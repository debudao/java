

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String path1,path2;
		System.out.println("�������һ���ļ���·�����ļ�����");
		path1=in.nextLine();
		System.out.println("�������һ���ļ���·�����ļ�����");
		path2=in.nextLine();
		
		System.out.println("��һ���ļ����ѧ������������ѧ�ɼ��ͼ�����ɼ�������֮���ÿո��������");
		
		File f1=null,f2=null;
		FileWriter fw1 = null,fw2=null;
		FileReader fr=null;
		BufferedWriter bfw1=null,bfw2=null;
		BufferedReader bfr=null;
		try {
			f1=new File(path1);	
			fw1=new FileWriter(f1,true);
			bfw1=new BufferedWriter(fw1);
			
			f2=new File(path2);	
			fw2=new FileWriter(f2);
			bfw2=new BufferedWriter(fw2);
		} catch (IOException e) {			
			System.out.println("��ʧ��");
		}
		
		System.out.println("�����һ���ļ��������ݣ���finish������");
		while(true) {		
			String a=in.nextLine();
			if(a.equals("finish")) {
				break;
			}
			
			try {
				bfw1.write(a);
				bfw1.newLine();
			} catch (IOException e1) {
				System.out.println("д��ʧ��");
			}
			
			
							
		}
		
		try {
			fr=new FileReader(f1);
			
			bfr=new BufferedReader(fr);
			String b=bfr.readLine();
			
			while(b!=null) {
				if(b.charAt(0)=='��') {
					bfw2.write(b);
					bfw2.newLine();
				}
				b=bfr.readLine();
					
			}
		} catch (IOException e) {			
			System.out.println("��ʧ��");
		}
		
		
		System.out.println("��һ���ļ��������ŵ�ѧ������Ϣ�Ѿ���ŵ��ڶ����ļ��С�");
		
		try {
			bfw1.close();
			bfw2.close();
			fw1.close();
			fw2.close();
			
		} catch (IOException e) {
			System.out.println("�ر�ʧ��");
		}

	}

}
