package lab5;
import java.util.*;

public abstract class Student {
    private String name;
    private int NO;
    private double averScore;
    LinkedList<CourseScore> report;

    //��ѧ���ĵ�4����Ա��ѡ�γɼ���report����ʹ��linkedList<E>����������ʾѧ����ѡ�γɼ�����

    protected Student() {
        this("", -1);
    }
    
    protected Student(String name, int NO) {
    	this.name=name;
        this.NO=NO;
        averScore=0;
        this.report=new LinkedList<CourseScore>();
        //������дԴ�롿
    }

    public void setAverScore(double averScore) {
        this.averScore = averScore;
    }
    public double getAverScore() {
        calcAverScore();
        return averScore;
    }

    public LinkedList<CourseScore> getReport() {
        
         return report;
    }

    

    protected abstract void calcAverScore();

    protected abstract void printReport();

    protected abstract void writeReport(String fileName); //������󷽷�����ʵ��3�Ļ����������ģ������ǽ�ѧ����Ϣд��ָ���ļ���

    public void printReport(String courseNO) {
    	Course a=CourseFactory.getCourse(courseNO);
    	
    	for(int i=0;i<report.size();i++) {
    		
    		if(a.equals(report.get(i).getCourse()))
    			System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+"  Credit:"+a.getCredit()+ "  Score:"+report.get(i).getScore());

    	}

       //������дԴ�롿
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public int getNO() {
        return NO;
    }

  
    public boolean addCourse(Course course, double score) {
    	CourseScore c=new CourseScore();
    	c.setCourse(course);
    	c.setScore(score);
    	for(int i=0;i<report.size();i++) {
    		if(report.get(i).getCourse().equals(course)){
        		return false;
        	}
    	}
    	
    	report.add(c);
    	return true;
        //������дԴ�롿
    }

    public boolean delCourse(String courseNO) {
    	Course a=CourseFactory.getCourse(courseNO);
    	
    	for(int i=0;i<report.size();i++) {
    		if(a.equals(report.get(i).getCourse())) {
    			report.remove(i);
    			return true;
    		}
    	}
    	
    	return false;
        //������дԴ�롿
        
    }

    public boolean updateCourse(String courseNO, double score) {
    	Course a=CourseFactory.getCourse(courseNO);
    	
    	for(int i=0;i<report.size();i++) {
    		if(a.equals(report.get(i).getCourse())) {
    			report.get(i).setScore(score);
    			return true;
    		}
    	}
    	
    	return false;
       //������дԴ�롿
        
    }

}
