import java.util.Scanner;
class CountSubString
{
       int num=0;
       void countSubString(String s, String substring)
      {
             String a[]= s.split(" ");
             for(int i=0;i<a.length;i++)
             {
                   if(a[i].contains(substring))
                           num=num+1;
             }
             System.out.println("�ַ����й�����"+num+"��"+substring); 
      }
}
public class CountString
{
       public static void main(String args[])
       {
              Scanner reader=new Scanner(System.in);
              System.out.println("�������ַ�����");
              String s=reader.nextLine();
              System.out.println("��������Ҫ�������Ӵ���");
               String substring=reader.nextLine();
             CountSubString a=new CountSubString();
             a.countSubString(s,substring);
       }
}