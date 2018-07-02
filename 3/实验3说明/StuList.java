package lab3;

import java.util.*;

public class StuList {
	TreeMap<Integer, Student> stus;
	LinkedList<Student> arr;
	int k=0;
    //ѧ���б���Ϣ���ٷ�����������Ƿ���TreeMap<K,V>����������У��롾��дԴ�롿
    
    public StuList() {
       stus=new TreeMap<Integer,Student>();
       arr=new LinkedList<Student>();
        //������дԴ�롿
     
    }


    public int size() {
       return stus.size();
       //������дԴ�롿

    }

    public boolean addStu(Student x) {
         stus.put(x.getNO(), x);
         
         return true;
        //������дԴ�롿
    }

    public void clear() {
        stus.clear();
        //������дԴ�롿
    }

   
    public Student removeStu_id(int stuId) {
         if(stus.isEmpty()||!stus.containsKey(stuId))
        	 return null;
         
         Student s=stus.get(stuId);
         stus.remove(stuId);
         return s;
         //������дԴ�롿


    }
    
    private void paste() {
    	arr.clear();
    	Collection<Student> collection=stus.values();
        Iterator<Student> iter=collection.iterator();
        while(iter.hasNext())
        { 
        	Student te=iter.next();
        	arr.add(te);
        }
    }

 
    public void print() {
    	if(k==0) {
    		paste();
    		k++;
    	}
    	
    	for(int i=0;i<arr.size();i++)
    		arr.get(i).printReport();
        
    	//������дԴ�롿

    }
    
    private int getMax(LinkedList<Student> l) {
    	int max=0;
    	for(int j=0;j<l.size();j++)
    		if(l.get(j).getAverScore()>l.get(max).getAverScore())
    			max=j;
    	return max;
    }

 public void sortAverScore() //����ƽ���ɼ�����
   {
	 paste();
	 
	 LinkedList<Student> l=(LinkedList<Student>) arr.clone();
	 arr.clear();
	 while(l.size()!=0) {
		 int i=getMax(l);
		 arr.add(l.get(i));
		 l.remove(i);
	 }
	 
	 System.out.println(arr.size());
     
       //������дԴ�롿 
      
    }

}




