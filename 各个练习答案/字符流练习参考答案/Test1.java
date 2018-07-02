import java.io.*;
import java.util.*;
public class Test1
{
      public static void main(String[] args)
     {
           Scanner reader=new Scanner(System.in);

           System.out.println("请输入第一个文件的路径与文件名：");
	   String sourceName = reader.nextLine();

           System.out.println("请输入第二个文件的路径与文件名：");
	   String destName = reader.nextLine();
           
           try{
                FileWriter fw = new FileWriter(sourceName);
                BufferedWriter bw = new BufferedWriter(fw);

                System.out.println("\n第一个文件存放学生的姓名，数学成绩和计算机成绩，各项之间用空格隔开。\n");
                System.out.println("请向第一个文件输入内容，以finish结束：");
                String s=reader.nextLine();
                while(!s.equals("finish"))
               {
                    bw.write(s);
                    bw.newLine();
                    s=reader.nextLine();
               }
               bw.flush();
               bw.close();
               fw.close();
               
               System.out.println("第一个文件中姓“张”的学生的信息已经存放到第二个文件，请到其存放路径查阅！");
               FileReader fr = new FileReader(sourceName);
	       BufferedReader br = new BufferedReader(fr);
               
               FileWriter fw2 = new FileWriter(destName);
               BufferedWriter bw2 = new BufferedWriter(fw2);

               while((s=br.readLine())!= null)
               {
                      if(s.charAt(0)=='张')
                      {
		          bw2.write(s);
		          bw2.newLine();
                      }
	       }
	       bw2.flush();
	       bw2.close();
	       fw2.close();
	       br.close();
	       fr.close();
              }catch(IOException ioe){
			System.out.println("输入输出错误！");
              }  
      }
}