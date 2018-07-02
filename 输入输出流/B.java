import java.io.*;
import java.util.Date;
public class B
{  
   public static void main(String args[])
   { 
      File dir=new File("D:/Java");
      String fileName[]=dir.list();
      String s=null;
      for(int i=0;i<fileName.length;i++)
     { 
         if(fileName[i].endsWith(".txt"))
         {
             if(s==null)
                  s=fileName[i];
             System.out.println(fileName[i]);
         }      
     }
     File f=new File("D:/Java/"+s);
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
     
   }
}
