import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//String[] s=new String[3];
		int[][] a=new int[3][2];
		//File f=null;
		RandomAccessFile raf=null;
		
		System.out.println("请输入要处理的文件名：");
		String path=new String();
		path=in.nextLine();
		System.out.println("");
		
		System.out.println("本程序的任务是：");
		System.out.println("1.将“"+path+"”中的姓名“李善”改为“王山”。");
		System.out.println("2.在“"+path+"”中原有信息之后继续添加学生信息。");
		System.out.println("");
		
		//file=new File(path);
		int start=0,end=0;
		try {
			raf=new RandomAccessFile(path, "rw");
			for(int i=0;i<4;i++) {
				start=(int)raf.getFilePointer();
				String s=raf.readLine();
				end=(int)raf.getFilePointer();
				String[] ss=s.split(" ");
				
				
				byte[] b=ss[0].getBytes("ISO-8859-1");
				ss[0]=new String(b);
				
				if(ss[0].equals("李善")) {
					ss[0]="王山";
					s=ss[0]+" "+ss[1]+" "+ss[2]+"\r\n";
					
					raf.seek(start);
					raf.write(s.getBytes());
					System.out.println("文件“"+path+"”中的姓名“李善”已经改为“王山”，请查阅！。");
					System.out.println("");
				}
				
				
				
				
				
			}
			System.out.println("请继续向文件“"+path+"”中添加新的学生信息，以finish结束。");
			System.out.println("");
			String s=raf.readLine();
			while(s!=null)
				s=raf.readLine();
			
			s=in.nextLine();
			while(!s.equals("finish")) {
				String[] ss=s.split(" ");
				
				s=ss[0]+" "+ss[1]+" "+ss[2]+"\r\n";
				raf.write(s.getBytes());
				s=in.nextLine();
			}
			raf.close();
			
		} catch (IOException e) {
			System.out.println("文件不存在！");
		}

		
		
	}

}
