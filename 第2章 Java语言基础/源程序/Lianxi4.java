//Lianxi4.java
//�Ӽ���������һ���ɼ�������óɼ���Ӧ�ĵȼ���ʹ��if-else if��䡣

import java.util.*;
public class Lianxi4
{
   public static void main(String args[])
   {
       Scanner reader=new Scanner(System.in);
       float grade;
       System.out.println("������ɼ���");
       grade=reader.nextFloat();
       if(grade>=90)
         System.out.println("�ȼ�ΪA");
       else if(grade>=80)
         System.out.println("�ȼ�ΪB");
       else if(grade>=70)
         System.out.println("�ȼ�ΪC");
       else if(grade>=60)
         System.out.println("�ȼ�ΪD");
       else
         System.out.println("�ȼ�ΪA");
}
}