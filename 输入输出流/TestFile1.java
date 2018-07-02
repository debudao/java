import java.io.*;
class FileAccept implements FilenameFilter 
{  
   String str=null;
   FileAccept(String s)
   {  
      str="."+s;
   }
   public  boolean accept(File dir,String name)
   {
      return name.endsWith(str);
   }              
}
public class TestFile1
{  
   public static void main(String args[])
   { 
      File dir=new File("D:/Java");
      FileAccept acceptCondition=new FileAccept("java");
      File fileName[]=dir.listFiles(acceptCondition);
      for(int i=0;i<fileName.length;i++)
     { 
         System.out.printf("\n文件名称:%s,长度:%d",fileName[i].getName(),fileName[i].length());
             
     }
     boolean boo=fileName[0].delete();
     if(boo)
    {
         System.out.printf("\n文件:%s被删除:",fileName[0].getName());
    } 
   }
}
