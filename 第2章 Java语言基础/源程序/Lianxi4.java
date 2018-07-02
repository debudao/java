//Lianxi4.java
//从键盘上输入一个成绩，输出该成绩对应的等级。使用if-else if语句。

import java.util.*;
public class Lianxi4
{
   public static void main(String args[])
   {
       Scanner reader=new Scanner(System.in);
       float grade;
       System.out.println("请输入成绩：");
       grade=reader.nextFloat();
       if(grade>=90)
         System.out.println("等级为A");
       else if(grade>=80)
         System.out.println("等级为B");
       else if(grade>=70)
         System.out.println("等级为C");
       else if(grade>=60)
         System.out.println("等级为D");
       else
         System.out.println("等级为A");
}
}