import java.io.*;
public class TestBufferedRW
{  
   public static void main(String args[])
   { 
      File readFile=new File("data\\lianxi.txt"),
           writeFile=new File("data\\hello.txt");
      try{
           FileReader inOne=new FileReader(readFile);
           BufferedReader inTwo= new BufferedReader(inOne);

           FileWriter tofile=new FileWriter(writeFile);
           BufferedWriter out= new BufferedWriter(tofile);

           String s=null;
           int i=0;
           while((s=inTwo.readLine())!=null)
           {
               i++;
               out.write(i+" "+s);
               out.newLine();
           }
           out.close();
           tofile.close();
           inTwo.close();
           inOne.close();

           inOne=new FileReader("data\\hello.txt");
           inTwo= new BufferedReader(inOne);
           while((s=inTwo.readLine())!=null)
           {
             System.out.println(s);
           } 
           inTwo.close();
           inOne.close();
      }
      catch(IOException e)
         {
           System.out.println(e);
         }  
   }
}
