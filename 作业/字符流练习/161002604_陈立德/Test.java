

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
		System.out.println("请输入第一个文件的路径和文件名：");
		path1=in.nextLine();
		System.out.println("请输入第一个文件的路径和文件名：");
		path2=in.nextLine();
		
		System.out.println("第一个文件存放学生的姓名，数学成绩和计算机成绩，各项之间用空格隔开。：");
		
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
			System.out.println("打开失败");
		}
		
		System.out.println("请向第一个文件输入内容，以finish结束：");
		while(true) {		
			String a=in.nextLine();
			if(a.equals("finish")) {
				break;
			}
			
			try {
				bfw1.write(a);
				bfw1.newLine();
			} catch (IOException e1) {
				System.out.println("写入失败");
			}
			
			
							
		}
		
		try {
			fr=new FileReader(f1);
			
			bfr=new BufferedReader(fr);
			String b=bfr.readLine();
			
			while(b!=null) {
				if(b.charAt(0)=='张') {
					bfw2.write(b);
					bfw2.newLine();
				}
				b=bfr.readLine();
					
			}
		} catch (IOException e) {			
			System.out.println("打开失败");
		}
		
		
		System.out.println("第一个文件在中姓张的学生的信息已经存放到第二个文件中。");
		
		try {
			bfw1.close();
			bfw2.close();
			fw1.close();
			fw2.close();
			
		} catch (IOException e) {
			System.out.println("关闭失败");
		}

	}

}
