//��дһ���࣬����������СдӢ����ĸ�����������У��Ӽ���������
//һ��Сд��ĸʱ��ʹ�ø����������������ĸ��ʼ������Сд��ĸ
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
        System.out.println("�Ӹ���ĸ��ʼ����ĸ���ǣ�");
        for(char c1=c;c1<='z';c1++)
          System.out.print(" "+c1);
    }
}
public class ListLetternew
{  
   public static void main (String args[ ])
   { 
      Scanner reader=new Scanner(System.in);
      System.out.println("������һ��СдӢ����ĸ��");
      String s=reader.nextLine();
      char letter=s.toCharArray()[0];
      Letter letterTable=new Letter(letter);
      letterTable.printLetter(); 
   }
}
