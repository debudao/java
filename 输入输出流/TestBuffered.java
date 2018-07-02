import java.io.*;
public class TestBuffered
{
     static void transform(String source, String dest)
    {
	  try{
		  FileReader fr = new FileReader(source);
		  BufferedReader br = new BufferedReader(fr);

		  FileWriter fw = new FileWriter(dest);
		  BufferedWriter bw = new BufferedWriter(fw);

		  String s = null;
		  while ((s=br.readLine()) != null)
                 {
			bw.write(s);
			bw.newLine();
			bw.newLine();
		 }
		 bw.flush();
		 bw.close();
		 fw.close();
		 br.close();
		 fr.close();
		} catch(IOException ioe){
			System.out.println(ioe);
	     }
	}
      public static void main(String[] args)
     {
	   String sourceName = "data\\lianxi1.txt";
	   String destName = "data\\lianxi2.txt";
	   transform(sourceName, destName);
	   System.out.println("×ª»»½áÊø");
      }
}