import java.io.*;
import java.util.*;
public class D{
               public static void main(String[] args){
		
               File f = new File("data\\lianxi.txt");
               try{
	FileWriter out=new FileWriter(f);
                  Scanner reader=new Scanner(System.in);
                  String s="";
                  System.out.println("请输入内容：");
                  s=reader.nextLine();
                  while(!s.equals("finish"))
                  {
                      out.write(s);
                      out.write((int)'\n');
                      s=reader.nextLine();
                   }
                  out.close();
                  FileReader in = new FileReader(f);
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