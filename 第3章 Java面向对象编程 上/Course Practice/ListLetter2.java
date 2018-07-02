//编写一个类，该类可以输出大写或者小写英文字母表，在主函数中，从键盘上输入一个字母时，使用该类可以输出从这个字母开始的所有大写或者小写字母
import java.util.Scanner;
class Letter
{
    static void printLetter(char c)
    {
        System.out.println("从该字母开始的字母表是：");
        if(c>='a' &&c<='z')
           for(char c1=c;c1<='z';c1++)
             System.out.print(" "+c1);
        else
           for(char c1=c;c1<='Z';c1++)
             System.out.print(" "+c1);
    }
}
public class ListLetter2
{  
   public static void main (String args[ ])
   { 
      Scanner reader=new Scanner(System.in);
      System.out.println("请输入一个英文字母：");
      String s=reader.nextLine();
      char letter=s.toCharArray()[0];
      Letter.printLetter(letter); 
   }
}
