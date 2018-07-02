import java.io.*;
public class TestRandomAccessFile2
{   
   public static void main(String args[])
  {  
       RandomAccessFile in=null;
       try{  
            in=new RandomAccessFile("Example9_13.java","rw");
            long length=in.length();
            long position=0;
            in.seek(position);
            while(position<length)
            {
               String str=in.readLine();
               byte b[]=str.getBytes("iso-8859-1");
               str=new String(b);
               position=in.getFilePointer();
               System.out.println(str);
            }
          }
       catch(Exception e){}
   }
}
