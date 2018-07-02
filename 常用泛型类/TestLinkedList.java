//LinkedList<E>��������ϰ

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
      
      //������mylist��ӽڵ�
      mylist.add(new Student("��Сһ",78)); 
      mylist.add(new Student("��С��",98));
      mylist.add(new Student("���ɽ",67));

      int number=mylist.size();
      System.out.println("������������"+number+"���ڵ�:");

      for(int i=0;i<number;i++)  //��������
      {
           Student temp=mylist.get(i);
           System.out.print("��"+i+"���ڵ��е����ݣ�");
	   System.out.println("������"+temp.name+"���ɼ���"+temp.score);
      }

      Student removeSTU=mylist.remove(1);
      System.out.println("��ɾ���������ǣ�"+removeSTU.name+"��"+removeSTU.score);

      Student replaceSTU=mylist.set(1,new Student("�Թ���",68));
      System.out.println("���滻�������ǣ�"+replaceSTU.name+"��"+replaceSTU.score);

      number=mylist.size();
      System.out.println("������������"+number+"���ڵ�:");

      for(int i=0;i<number;i++) //����������
      {
           Student temp=mylist.get(i);
           System.out.print("��"+i+"���ڵ��е����ݣ�");
	   System.out.println("������"+temp.name+"���ɼ���"+temp.score);
      }

      if(mylist.contains(mylist.get(0)))
      {
           System.out.println("�������"+mylist.get(0).name+"��"+mylist.get(0).score);
      }
      else
      {
           System.out.println("����û�нڵ㺬���ַ�������");
      }  
    }
}
