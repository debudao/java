package lab2;

public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;



    /**
     * init the postgraduate using the given name, NO, tutor and area
     * @param  name  the name of the postgraduate
     * @param  NO    the number of the postgraduate
     * @param  tutor the tutor of the postgraduate
     * @param  area  the reseach area of the postgraduate
     */
    public Postgraduate(String name, int NO, String tutor, String area) {
        // TODO
        super(name,NO);
        this.tutor=tutor;
        this.researchArea=area;
    }

    protected void calcAverScore() {
        // 标准算法GPA (各科成绩按学分的加权平均数 * 4 / 100)
        // TODO
        double creditsum=0,scoresum=0;
        CourseScore c=report;
        while(c.getNext()!=null)
        {
            c=c.getNext();
            creditsum+=c.getCourse().getCredit();
            scoresum+=c.getScore()*c.getCourse().getCredit();
            averScore=scoresum/creditsum*4/100;
        }
    }

    /**
     * print all the message of the Postgraduate
     */
    public void printReport() {
        // TODO
        System.out.print("name:"+name+"  id:"+id);
        System.out.printf("  average score:%.2f",getAverScore());
        System.out.println("  tutor:"+tutor+"  research area"+researchArea);
        CourseScore c=report;
        while(c.getNext()!=null)
        {
            c=c.getNext();
            Course a=c.getCourse();
            System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+c.getScore());              
        }
    }

    /**
     * get the tutor of the Postgraduate
     * @return the tutor of the Postgraduate
     */
    public String getTutor() {
        return tutor;
    }

    /**
     * change the tutor of the Postgraduate
     * @param tutor the new tutor to the Postgraduate
     */
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    /**
     * get the research area of the Postgraduate
     * @return the research of the Postgraduate
     */
    public String getResearchArea() {
        return researchArea;
    }

    /**
     * set the research of the Postgraduate
     * @param researchArea the research area of the Postgraduate
     */
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

}
