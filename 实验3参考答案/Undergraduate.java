import java.util.*;
public class Undergraduate extends Student {
    public Undergraduate(String name, int NO) {
        super(name, NO);
    }

    /**
     * A 100-90 4
     * B 89-80   3
     * C 79-70  2
     * D 69-60  1
     * E 59 - 0  0
     */

    private int getGPA4(double score) {
        if (score >= 90 && score <= 100) {
            return 4;
        } else if (score >= 80 && score < 90) {
            return 3;
        } else if (score >= 70 && score < 80) {
            return 2;
        } else if (score >= 60 && score < 70) {
            return 1;
        } else {
            return 0;
        }
    }

    protected void calcAverScore() {
        // 四分制算法GPA

        double credits = 0;
        double allscores = 0.0;

        for(int i=0;i<this.getReport().size();i++)
       {
           CourseScore cs=this.getReport().get(i);
           Course c=cs.getCourse();
           double cCredit=c.getCredit();

           credits += cCredit;
           allscores += getGPA4(cs.getScore()) * cCredit;
              
       }
        setAverScore(allscores / credits);
    }

    public void printReport() {
        System.out.println("The report of Student " + this.getName() + " " + this.getNO());

        for(int i=0;i<this.getReport().size();i++)
       {
           CourseScore cs=this.getReport().get(i);
           Course c=cs.getCourse();
           String cNo=c.getCourseNumber();
          
           System.out.println("courseNo:"+cNo + "  courseName:" + c.getCourseName() + "  tHour:" + c.getCourseHour() + "  Score:" + cs.getScore());
           
              
       }
        calcAverScore();
        System.out.println("学分积：" + getAverScore());
    }

}
