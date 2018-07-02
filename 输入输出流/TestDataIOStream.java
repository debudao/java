import java.io.*;
public class TestDataIOStream
{  
   public static void main(String args[])
   { 
       try  
        {  FileOutputStream fos=new FileOutputStream("jerry.dat");
           DataOutputStream out_data=new DataOutputStream(fos);
           out_data.writeInt(100);out_data.writeInt(10012);
           out_data.writeLong(123456);  
           out_data.writeFloat(3.1415926f); out_data.writeFloat(2.789f);
           out_data.writeDouble(987654321.1234);
           out_data.writeBoolean(true);out_data.writeBoolean(false);
           out_data.writeChars("i am ookk");
         } 
       catch(IOException e){}
       try
         {  FileInputStream fis=new FileInputStream("jerry.dat");
            DataInputStream in_data=new DataInputStream(fis);
            System.out.println(":"+in_data.readInt());//读取第1个int整数。
            System.out.println(":"+in_data.readInt());//读取第2个int整数。
            System.out.println(":"+in_data.readLong()); //读取long整数 。
            System.out.println(":"+in_data.readFloat());//读取第1个float数。
            System.out.println(":"+in_data.readFloat());//读取第2个float数。
            System.out.println(":"+in_data.readDouble()); 
            System.out.println(":"+in_data.readBoolean());//读取第1个boolean。
            System.out.println(":"+in_data.readBoolean());//读取第2个boolean。
            char c;
            while((c=in_data.readChar())!='\0')     //'\0'表示空字符。
                  System.out.print(c);
          } 
        catch(IOException e){}
   }
}
