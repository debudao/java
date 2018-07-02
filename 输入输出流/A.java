import java.io.*;
import java.util.Date;
public class A
{  
   public static void main(String args[]) throws IOException
   { 
      File dir=new File("D:/Java");
      File fileName[]=dir.listFiles();
      File s=null;
      for(int i=0;i<fileName.length;i++)
     { 
         if(fileName[i].getName().endsWith(".txt"))
         {
             if(s==null)
                  s=fileName[i];
             System.out.println(fileName[i].getName());
         }      
     }
     File f=new File(s.getAbsolutePath());
     System.out.println(
		"Name: " + f.getName()
		+"\nParent: " + f.getParent()
		+"\nPath: " + f.getPath()
		+"\nAbsolutePath: " + f.getAbsolutePath()
		+"\nAbsolute? " + f.isAbsolute()
		+"\nCan read: " + f.canRead()
		+"\nCan write: " + f.canWrite()
		+"\nExist: " + f.exists()
		+"\nLength: " + f.length()
		+"\nLast Modified: " + new Date(f.lastModified()));
    f=new File("a3.txt");
    f.createNewFile();
     
   }
}
