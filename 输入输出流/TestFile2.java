import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class TestFile2
{ 
   public static void main(String args[])
   {  
       try{
            Runtime ce=Runtime.getRuntime();
            ce.exec("javac A.java");
            File file=new File("D:\\Java","word.exe");
            ce.exec(file.getAbsolutePath());
         }catch(Exception e){} 
   } 
}
