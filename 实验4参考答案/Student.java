import java.util.*;
import java.io.*;
public abstract class Student {
    private String name;
    private int NO;
    private double averScore;
    private LinkedList<CourseScore> report;

    protected Student() {
        this(-1,"");
    }
    
    protected Student(int NO,String name) {
        this.name = name;
        this.NO = NO;
        this.averScore = 0.0;
        this.report = new LinkedList<CourseScore>();
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
    
    public void printReport(String NO) {

       for(int i=0;i<report.size();i++)
      {
           CourseScore cs=report.get(i);
           Course c=cs.getCourse();
           String cNo=c.getCourseNumber();
           if(cNo==NO)
           {
              System.out.println("The information of course "+NO+" is:");
              System.out.println("courseNo:"+cNo + "  courseName:" + c.getCourseName() + "  Hour:" + c.getCourseHour() + "  Score:" + cs.getScore());;
           }
              
      }
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
        report.add(c);
        return true;
    }

    public boolean delCourse(String NO) {
       for(int i=0;i<report.size();i++)
      {
           CourseScore cs=report.get(i);
           Course c=cs.getCourse();
           String cNo=c.getCourseNumber();
           if(cNo==NO)
              return report.remove(cs);
      }
      return false;
        
    }

    public boolean updateCourse(String NO, double score) {
       for(int i=0;i<report.size();i++)
      {
           CourseScore cs=report.get(i);
           Course c=cs.getCourse();
           String cNo=c.getCourseNumber();
           if(cNo==NO)
           {
              cs.setScore(score);
              CourseScore csnew=report.set(i,cs);
              return true;
           }

              
      }
      return false;
        
    }

}
