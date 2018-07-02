//LinkedList<E>泛型类练习

import java.util.*;

class Student 
{
   String name;
   int score;
   Student(String name,int score)
   {
      this.name=name;
      this.score=score;
   }
}

public class TestLinkedList
{
    public  static void main(String args[])
    { 
      LinkedList<Student> mylist=new LinkedList<Student>();
      
      //向链表mylist添加节点
      mylist.add(new Student("张小一",78)); 
      mylist.add(new Student("王小二",98));
      mylist.add(new Student("李大山",67));

      int number=mylist.size();
      System.out.println("现在链表中有"+number+"个节点:");

      for(int i=0;i<number;i++)  //遍历链表
      {
           Student temp=mylist.get(i);
           System.out.print("第"+i+"个节点中的数据，");
	   System.out.println("姓名："+temp.name+"，成绩："+temp.score);
      }

      Student removeSTU=mylist.remove(1);
      System.out.println("被删除的数据是："+removeSTU.name+"，"+removeSTU.score);

      Student replaceSTU=mylist.set(1,new Student("赵钩林",68));
      System.out.println("被替换的数据是："+replaceSTU.name+"，"+replaceSTU.score);

      number=mylist.size();
      System.out.println("现在链表中有"+number+"个节点:");

      for(int i=0;i<number;i++) //遍历新链表
      {
           Student temp=mylist.get(i);
           System.out.print("第"+i+"个节点中的数据，");
	   System.out.println("姓名："+temp.name+"，成绩："+temp.score);
      }

      if(mylist.contains(mylist.get(0)))
      {
           System.out.println("链表包含"+mylist.get(0).name+"，"+mylist.get(0).score);
      }
      else
      {
           System.out.println("链表没有节点含有字符串数据");
      }  
    }
}
