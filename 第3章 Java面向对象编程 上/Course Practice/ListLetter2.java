//��дһ���࣬������������д����СдӢ����ĸ�����������У��Ӽ���������һ����ĸʱ��ʹ�ø����������������ĸ��ʼ�����д�д����Сд��ĸ
import java.util.Scanner;
class Letter
{
    static void printLetter(char c)
    {
        System.out.println("�Ӹ���ĸ��ʼ����ĸ���ǣ�");
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
      System.out.println("������һ��Ӣ����ĸ��");
      String s=reader.nextLine();
      char letter=s.toCharArray()[0];
      Letter.printLetter(letter); 
   }
}
