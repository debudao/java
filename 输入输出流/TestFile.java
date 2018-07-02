import java.util.Date;
import java.io.File;
import java.io.IOException;
public class TestFile
{
      static void fileInfo(File f)
     {
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
      public static void main(String[] args) throws IOException
     {
	   String path = "data\\mydata.txt";
	   File f = new File(path);
	   f.createNewFile();
	   fileInfo(f);
     }
}