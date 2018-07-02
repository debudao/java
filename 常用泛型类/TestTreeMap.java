import java.util.*;
class MyKey implements Comparable 
{ 
  int number=0; 
  MyKey(int number)
   {
     this.number=number;
   }
  public int compareTo(Object b)
   { 
     MyKey st=(MyKey)b;
     if((this.number-st.number)==0)
       {
           return -1;
       }
     else
       {
          return (this.number-st.number);
       }
   }
}
class Student 
{
   String name=null;
   int height,weight;
   Student(int w,int h,String name)
   {
      weight=w;
      height=h;
      this.name=name;
   }
}
public class TestTreeMap
{
   public static void main(String args[ ])
   { 
      Student s1=new Student(65,177,"����"),
              s2=new Student(85,168,"����");
      TreeMap<MyKey,Student> treemap=new TreeMap<MyKey,Student>();
      treemap.put(new MyKey(s1.weight),s1); 
      treemap.put(new MyKey(s2.weight),s2);
      int number=treemap.size();
      System.out.println("��ӳ������"+number+"������:");
      Collection<Student> collection=treemap.values();
      Iterator<Student> iter=collection.iterator();
      while(iter.hasNext())
      { 
        Student te=iter.next();
        System.out.printf("����:%s,����:%d\n",te.name,te.weight);
      }
      treemap.clear();
      treemap.put(new MyKey(s1.height),s1); 
      treemap.put(new MyKey(s2.height),s2);
      number=treemap.size();
      System.out.println("��ӳ������"+number+"������:");
      collection=treemap.values();
      iter=collection.iterator();
      while(iter.hasNext())
      { 
        Student te=iter.next();
        System.out.printf("����:%s,���:%d\n",te.name,te.height);
      }
   }
}
