import java.util.Scanner;
class CountSubString1
{
       int num=0;
       void countSubString1(String s, String substring)
      {
             int n=0;
             do
             {     int temp=s.indexOf(substring);
                    if(temp==-1)
                    {
                          break;
                    }
                    else
                    {
                           num=num+1;
                           s=s.substring(temp+substring.length(),s.length());
                    }
                   
             }while(true);
             if(num==0)
                     System.out.println("�ַ�����û����Ҫ�������Ӵ�"+substring);
             else
                     System.out.println("�ַ����й�����"+num+"��"+substring);  
      }
}
public class CountString1
{
       public static void main(String args[])
       {
              Scanner reader=new Scanner(System.in);
              System.out.println("�������ַ�����");
              String s=reader.nextLine();
              System.out.println("��������Ҫ�������Ӵ���");
               String substring=reader.nextLine();
             CountSubString1 a=new CountSubString1();
             a.countSubString1(s,substring);
       }
}