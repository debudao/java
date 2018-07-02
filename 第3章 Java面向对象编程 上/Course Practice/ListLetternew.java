//编写一个类，该类可以输出小写英文字母表，在主函数中，从键盘上输入
//一个小写字母时，使用该类可以输出从这个字母开始的所有小写字母
import java.util.Scanner;
class Letter
{
    char c;
    Letter(char u)
    {
        c=u;
    }
    void printLetter()
    {
        System.out.println("从该字母开始的字母表是：");
        for(char c1=c;c1<='z';c1++)
          System.out.print(" "+c1);
    }
}
public class ListLetternew
{  
   public static void main (String args[ ])
   { 
      Scanner reader=new Scanner(System.in);
      System.out.println("请输入一个小写英文字母：");
      String s=reader.nextLine();
      char letter=s.toCharArray()[0];
      Letter letterTable=new Letter(letter);
      letterTable.printLetter(); 
   }
}
