import java.io.*;
public class TestRandomAccessFile1
{   
   public static void main(String args[])
    {  
       RandomAccessFile inAndOut=null;
       int data[]={20,30,40,50,60};
       try{  
            inAndOut=new RandomAccessFile("a.txt","rw");
          //}
       //catch(Exception e){}
       //try{  
              for(int i=0;i<data.length;i++)
               {  
                  inAndOut.writeInt(data[i]);
               } 
             for(long i=data.length-1;i>=0;i--)  //一个int型数据占4个字节，我们从
               {                         //文件的第36个字节读取最后面的一个整数，
                  inAndOut.seek(i*4);      //每隔4个字节往前读取一个整数.
                  System.out.print(inAndOut.readInt()+" ");
               }
              inAndOut.close();
          }
       catch(IOException e){} 
    }
}
