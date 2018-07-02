package lab3;
public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;

    public Postgraduate(String name, int NO, String tutor, String area) {
        super(name, NO);
        setTutor(tutor);
        setResearchArea(area);
    }

    protected void calcAverScore() {
        // 标准算法GPA (各科成绩按学分的加权平均数 * 4 / 100)
    	if(report.size()==0)
    		setAverScore(0);
    	else
    	{
    		double creditsum=0,scoresum=0;

        	for(int i=0;i<report.size();i++) {
        		CourseScore c=report.get(i);
        		creditsum+=c.getCourse().getCredit();
                scoresum+=c.getScore()*c.getCourse().getCredit();
        	}
        	
        	setAverScore(scoresum/creditsum*4/100);
    	}
    	   
    	
        //【请填写源码】
    }

    public void printReport() {
    	 System.out.print("name:"+getName()+"  NO:"+getNO());
         System.out.printf("  average score:%.2f",getAverScore());
         System.out.println("  tutor:"+tutor+"  research area"+researchArea);
         
         for(int i=0;i<report.size();i++) {
        	 Course a=report.get(i).getCourse();
        	 System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+report.get(i).getScore());              

         }
         
        //【请填写源码】
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
