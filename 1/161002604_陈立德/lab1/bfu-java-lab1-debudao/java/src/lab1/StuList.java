package lab1;

public class StuList {
	private Student[] stus;
	private int length;   // the actual number of student it contains
	/**
	 * Default initial capacity
	 * please write your answer here
	 * why use static final ?
	 */
	
	//定义为static是为了让所以对象的DEFAULT_CAPACITY都一样为15，而定义为final是防止值被改变
	private static final int DEFAULT_CAPACITY=15;
	
	/**
	 * Init the StuList using the default capacity
	 * 定义为static是为了让所以对象的DEFAULT_CAPACITY都一样为15，而定义为final是防止值被改变
	 */	
	public StuList() {
		stus=new Student[DEFAULT_CAPACITY];
		length=0;
	}
	
	/**
	 * Init the StuList using the given cap
	 * @param cap the length of stus
	 */
	public StuList(int cap) {	
		stus=new Student[cap];
		length=0;
	}
	
	
	private boolean isOverflow() {  
		if(length==stus.length)
			return true;
		else 
			return false;
	}
	
	
	/**
	 * judge the stus is empty or not
	 * @return if is empty,return true.else return flase
	 */
	public boolean isEmpty() {  
		if(length==0)
			return true;
		else 
			return false;
	}
	
	/**
	 * add a number to stus
	 * @param x the number added to stus
	 * @return if is overflow return true,else return false
	 */
	public boolean addStu(Student x) { 
		if(isOverflow()) 
			return false;
		else
		{
			stus[length]=x;
			length++;
			return true;
		}
	}
	
	/**
	 * Delete a student at a designated spot. 
	 * @param index the position you want to delete
	 * @return the student you delete
	 */
	public Student removeStu(int index) {
		Student s=stus[index];
		for(int i=index;i<length-1;i++)
		{
			stus[i]=stus[i+1];
		}
		length--;
		return s;
	}
	
	/**
	 * Delete a student by its Id 
	 * @param stuId the Id of the students you delete
	 * @return the student you delete
	 */
	public Student removeStu_id(int stuId) {
		int index=indexOf(stuId);
		Student s=stus[index];
		for(int i=index;i<length-1;i++)
		{
			stus[i]=stus[i+1];
		}
		length--;
		return s;
	}
	
	private int indexOf(int stuId) {
		int i=0;
		for(i=0;i<length;i++)
		{
			if(stus[i].getNO()==stuId)
			{
				
				break;
			}
		}
		return i;
	}
	
	/**
	 * sort the stus by students' averscore 
	 */
	public void sort() {
		for(int i=0;i<length-1;i++)
			for(int j=i+1;j<length;j++)
			{
				if(stus[i].getAverScore()<stus[j].getAverScore())
				{
					Student s=stus[i];
					stus[i]=stus[j];
					stus[j]=s;
				}
			}
	}
	
	/**
	 * print the information of all the students 
	 */
	public void print() {
		for(int i=0;i<length;i++)
		{
			System.out.println(stus[i].getName()+" "+stus[i].getNO()+" "+stus[i].getAverScore());
			stus[i].printReport();
		}
	}
	
}
