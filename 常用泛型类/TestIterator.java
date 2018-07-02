//使用Iterator<E>泛型类实现遍历链表练习

import java.util.*;

class Student
{
    String name ;
    int number;
    float score;
    Student(String name,int number,float score)
    {
      this.name=name;
      this.number=number;
      this.score=score;
    }
}

public class TestIterator
{
    public  static void main(String args[])
    {
      LinkedList<Student> mylist=new LinkedList<Student>();

      Student stu_1=new Student("赵民" ,9012,80.0f),
              stu_2=new Student("钱青" ,9013,90.0f),  
              stu_3=new Student("孙枚" ,9014,78.0f),
              stu_4=new Student("周右" ,9015,55.0f);

      mylist.add(stu_1); 
      mylist.add(stu_2);
      mylist.add(stu_3); 
      mylist.add(stu_4);

      Iterator<Student> iter=mylist.iterator();
      while(iter.hasNext())
      { 
         Student te=iter.next();
         System.out.println(te.name+" "+te.number+"  "+te.score);
       }
    }
}
