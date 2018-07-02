import java.util.*;
import java.io.*;
public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;

    public Postgraduate(int NO,String name,String tutor, String area) {
        super(NO,name);
        setTutor(tutor);
        setResearchArea(area);
    }

    protected void calcAverScore() {
        // 标准算法GPA (各科成绩按学分的加权平均数 * 4 / 100)
        
        double credits = 0;
        double allscores = 0.0;

        for(int i=0;i<this.getReport().size();i++)
       {
           CourseScore cs=this.getReport().get(i);
           Course c=cs.getCourse();
           double cCredit=c.getCredit();

           credits += cCredit;
           allscores +=cs.getScore() * cCredit;
              
       }

        setAverScore(allscores / credits * 4 / 100);
    }

    public void printReport() 
   {
        System.out.println("The report of Student " + getName() + " " + getNO());
        System.out.println("Tutor: " + this.tutor + " ResearchArea: " + this.researchArea);
        
        for(int i=0;i<this.getReport().size();i++)
       {
           CourseScore cs=this.getReport().get(i);
           Course c=cs.getCourse();
           String cNo=c.getCourseNumber();
          
           System.out.println("courseNo:"+cNo + "  courseName:" + c.getCourseName() + "  Hour:" + c.getCourseHour() + "  Score:" + cs.getScore());
           
              
       }
        calcAverScore();
        System.out.println("学分积：" + getAverScore());
    }
     
    public void writeReport(String fileName)
   {
      try{
             FileWriter fw=new FileWriter(fileName,true);

             fw.write("The report of Student " + getName() + " " + getNO());
             fw.write("\n");
             fw.write("Tutor: " + this.tutor + " ResearchArea: " + this.researchArea);
             fw.write("\n");
             for(int i=0;i<this.getReport().size();i++)
            {
                CourseScore cs=this.getReport().get(i);
                Course c=cs.getCourse();
                String cNo=c.getCourseNumber();
          
                fw.write("courseNo:"+cNo + "  courseName:" + c.getCourseName() + "  tHour:" + c.getCourseHour() + "  Score:" + cs.getScore());
                fw.write("\n");        
            }
             calcAverScore();
             fw.write("学分积：" + getAverScore());
             fw.write("\n");
             fw.close();
         }catch(IOException e){
             System.out.println("输入输出错误！");
          }
   }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

}
