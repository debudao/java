import java.io.*;
import java.util.*;
public class Test2
{
      public static void main(String[] args)
     {
           Scanner reader=new Scanner(System.in);

           System.out.println("请输入要处理的文件名：");
	   String sourceName = reader.nextLine();
           
           System.out.println("\n本程序的任务是：");
           System.out.printf("1.将“%s”中的姓名“李善”改为“王山”。\n",sourceName);
           System.out.printf("2.在“%s”中原有信息之后继续添加学生信息。\n",sourceName);
           
           try{
                 RandomAccessFile raf=new RandomAccessFile(sourceName,"rw");
                 long oldu=0;
                 raf.seek(oldu);
                 String s=raf.readLine();
                 while(s!=null)
                {
                   byte[] b=s.getBytes("ISO-8859-1");
                   s=new String(b);
                   long newu=raf.getFilePointer();
                   if(s.charAt(0)=='李'&&s.charAt(1)=='善'&&s.charAt(2)==' ')
                   {
                        raf.seek(oldu);
                        raf.write("王山".getBytes());
                        break;
                   }      
                   oldu=newu;
                   s=raf.readLine();
                }

               System.out.printf("\n文件“%s”中的姓名“李善”已经改为“王山”，请查阅！\n",sourceName);
               System.out.printf("\n请继续向文件“%s”中添加新的学生信息，以finish结束。\n\n",sourceName); 
               
               raf.seek(0);
               long w=raf.length();
               raf.seek(w);
               
               s=reader.nextLine();
               while(!s.equals("finish"))
               {
                   raf.write(s.getBytes());
                   raf.write("\n".getBytes());
                   s=reader.nextLine();
               }
               
	       
              }catch(IOException ioe){
			System.out.println("输入输出错误！");
              }
      }
}