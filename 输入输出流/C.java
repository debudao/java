import java.io.*;
import java.util.*;
public class C
{
       public static void main(String[] args)
     {
           File f = new File("data\\lianxi1.txt");
           try{
                  FileOutputStream out=new FileOutputStream(f);
                  Scanner reader=new Scanner(System.in);
                  String s="";
                  System.out.println("请输入内容：");
                  s=reader.nextLine();
                  while(!s.equals("finish"))
                  {
                      byte[] c=s.getBytes();
                      out.write(c);
                      out.write((int)'\n');
                      s=reader.nextLine();
                   }
                  out.close();
                  FileInputStream in = new FileInputStream(f);
                  int a;
	while((a=in.read())!=-1)
                  {
                      System.out.print((char)a);
                  }
                  in.close();
	} catch(IOException ioe){
		System.out.println("输入输出错误！");
	 }
       }    

}