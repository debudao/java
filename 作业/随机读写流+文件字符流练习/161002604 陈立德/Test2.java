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
		
		System.out.println("������Ҫ������ļ�����");
		String path=new String();
		path=in.nextLine();
		System.out.println("");
		
		System.out.println("������������ǣ�");
		System.out.println("1.����"+path+"���е����������ơ���Ϊ����ɽ����");
		System.out.println("2.�ڡ�"+path+"����ԭ����Ϣ֮��������ѧ����Ϣ��");
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
				
				if(ss[0].equals("����")) {
					ss[0]="��ɽ";
					s=ss[0]+" "+ss[1]+" "+ss[2]+"\r\n";
					
					raf.seek(start);
					raf.write(s.getBytes());
					System.out.println("�ļ���"+path+"���е����������ơ��Ѿ���Ϊ����ɽ��������ģ���");
					System.out.println("");
				}
				
				
				
				
				
			}
			System.out.println("��������ļ���"+path+"��������µ�ѧ����Ϣ����finish������");
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
			System.out.println("�ļ������ڣ�");
		}

		
		
	}

}
