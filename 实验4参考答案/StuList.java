import java.util.*;

public class StuList {
   
    private TreeMap<Integer,Student> stus;
    
    public StuList() {
       stus=new TreeMap<Integer,Student>();
     
    }


    public int size() {
        return stus.size();
    }

    public boolean addStu(Student x) {
               
        stus.put(x.getNO(),x);
        return true;
    }

    public void clear() {
        
        stus.clear();
    }

   
    public Student removeStu_id(int stuId) {
          
         return stus.remove(stuId);


    }

 
    public void print() {    

      Collection<Student> collection=stus.values();
      Iterator<Student> iter=collection.iterator();
      while(iter.hasNext())
      { 
        Student te=iter.next();
        System.out.printf("NO:%d\t Name:%s\t AverScore:%.2f \n", te.getNO(), te.getName(), te.getAverScore());
      }

    }

 public void sortAverScore()
   {
      
       TreeMap<Double,Student> stusAverScore=new TreeMap<Double,Student>();
       Collection<Student> collection=stus.values();
       Iterator<Student> iter=collection.iterator();
       while(iter.hasNext())
      { 
         Student te=iter.next();
        
         stusAverScore.put(te.getAverScore(),te);
      }

       collection=stusAverScore.values();
       iter=collection.iterator();
       System.out.println("Sort for AverScore:");
       while(iter.hasNext())
      { 
         Student te=iter.next();
        System.out.printf("NO:%d\t Name:%s\t AverScore:%.2f \n", te.getNO(), te.getName(), te.getAverScore());
      }
      
    }

}
