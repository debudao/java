package lab2;
import java.util.Scanner;


class CountSubString2
{
	void countSubString(String s, String substring)
	{
		int count=0;
		int i=0;
		while(s.indexOf(substring,i)!=-1) {
			count++;
			i=s.indexOf(substring,i)+substring.length();
		}
		System.out.println(count);
	}
}

public class CountString2
{
       public static void main(String args[])
       {
              Scanner reader=new Scanner(System.in);
              System.out.println("ÇëÊäÈë×Ö·û´®£º");
              String s=reader.nextLine();
              System.out.println("ÇëÊäÈëÄãÒª¼ìË÷µÄ×Ó´®£º");
               String substring=reader.nextLine();
             CountSubString2 a=new CountSubString2();
             a.countSubString(s, substring);
       }
}
