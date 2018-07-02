//HashSet<E>��������ϰ

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

public class TestHashSet
{
   public  static void main(String args[])
   { 
      Student zh=new Student("�ź���",77),
              wa=new Student("���Ҽ�",68),
              li=new Student("��Ѽ�",67);

      HashSet<Student> set=new HashSet<Student>();

      HashSet<Student> subset=new HashSet<Student>();

      set.add(zh); 
      set.add(wa);
      set.add(li);

      subset.add(wa);
      subset.add(li); 

      if(set.contains(zh))
      {
          System.out.println("����set���н��ź�����");
      }

      if(set.containsAll(subset))
      {
           System.out.println("����set�����Ӽ�subset");
      }

      int number=subset.size();
      System.out.println("����subset����"+number+"��Ԫ��:");

      Object s[]=subset.toArray();
      for(int i=0;i<s.length;i++)
      {
        System.out.println(((Student)s[i]).name+"��"+((Student)s[i]).score);
      }

      number=set.size();
      System.out.println("����set����"+number+"��Ԫ��:");

      Iterator<Student> iter=set.iterator();

      while(iter.hasNext())
      { 
        Student te=iter.next();
        System.out.println(te.name+"��"+te.score);
      }
   }
}
