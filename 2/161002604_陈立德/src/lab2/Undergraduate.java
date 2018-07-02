package lab2;

public class Undergraduate extends Student {

    public Undergraduate(String name, int NO) {
        // TODO
        super(name,NO);
    }

    private int scoreToGPA(CourseScore c){
        int i=(int)c.getScore()/10;
        int j=0;
        switch(i)
        {
            case 10:
            case 9:
                j=4;
                break;
            case 8:
                j=3;
                break;
            case 7:
                j=2;
                break;
            case 6:
                j=1;
                break;
            default:
                j=0;
        }
        return j;
    }



    protected void calcAverScore() {
        // 四分制算法GPA
        // TODO
        double sum=0,creditsum=0;
        CourseScore c=report;
        while(c.getNext()!=null)
        {
            c=c.getNext();
            creditsum+=c.getCourse().getCredit();
            sum+=(c.getCourse().getCredit()*scoreToGPA(c));
            averScore=sum/creditsum;
        }


    }

    /**
     * print all the message about the student
     */
    public void printReport() {
        // TODO
        System.out.print("name:"+name+"  id:"+id);
        System.out.printf("  average score:%.2f\n",getAverScore());
        CourseScore c=report;
        while(c.getNext()!=null)
        {
            c=c.getNext();
            Course a=c.getCourse();
            System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+c.getScore());              
        }
    }

}
