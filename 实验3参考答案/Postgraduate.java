import java.util.*;
public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;

    public Postgraduate(String name, int NO, String tutor, String area) {
        super(name, NO);
        setTutor(tutor);
        setResearchArea(area);
    }

    protected void calcAverScore() {
        // ��׼�㷨GPA (���Ƴɼ���ѧ�ֵļ�Ȩƽ���� * 4 / 100)
        
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

    public void printReport() {
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
        System.out.println("ѧ�ֻ���" + getAverScore());
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
