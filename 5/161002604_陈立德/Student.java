package lab5;
import java.util.*;

public abstract class Student {
    private String name;
    private int NO;
    private double averScore;
    LinkedList<CourseScore> report;

    //【学生的第4个成员是选课成绩单report，请使用linkedList<E>泛型类对象表示学生的选课成绩单】

    protected Student() {
        this("", -1);
    }
    
    protected Student(String name, int NO) {
    	this.name=name;
        this.NO=NO;
        averScore=0;
        this.report=new LinkedList<CourseScore>();
        //【请填写源码】
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

    protected abstract void writeReport(String fileName); //这个抽象方法是在实验3的基础上新增的，作用是将学生信息写到指定文件中

    public void printReport(String courseNO) {
    	Course a=CourseFactory.getCourse(courseNO);
    	
    	for(int i=0;i<report.size();i++) {
    		
    		if(a.equals(report.get(i).getCourse()))
    			System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+"  Credit:"+a.getCredit()+ "  Score:"+report.get(i).getScore());

    	}

       //【请填写源码】
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
        //【请填写源码】
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
        //【请填写源码】
        
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
       //【请填写源码】
        
    }

}
