package lab3;
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
    	if(report.size()==0)
    		setAverScore(0);
    	else
    	{
    		 double sum=0,creditsum=0;
        	 
        	 for(int i=0;i<report.size();i++) {
         		CourseScore c=report.get(i);
         		creditsum+=c.getCourse().getCredit();
         		sum+=(c.getCourse().getCredit()*getGPA4(c.getScore()));
         	}
        	 
        	setAverScore(sum/creditsum); 
    	}
    	
    	
    	 
        //【请填写源码】
    }

    public void printReport() {
    	 System.out.print("name:"+getName()+"  NO:"+getNO());
         System.out.printf("  average score:%.2f\n",getAverScore());
         
         for(int i=0;i<report.size();i++) {
        	 Course a=report.get(i).getCourse();
        	 System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+report.get(i).getScore());              

         }
    	//【请填写源码】
    }

}
