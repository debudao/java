import java.io.*;
public class TestFileRW
{  
   public static void main(String args[])
   { 
      File file=new File("hello.txt");
      char b[]="欢迎welcome".toCharArray();
      try{
           FileWriter out=new FileWriter(file);
           out.write(b);
           out.write("来到北京!");
           out.close();
           FileReader in=new FileReader(file);
           int n=0;
           while((n=in.read(b,0,2))!=-1)
           {
               String str=new String(b,0,n);
               System.out.println(str);
           }
           in.close();
         }catch(IOException e)
         {
           System.out.println(e);
         }  
   }
}
