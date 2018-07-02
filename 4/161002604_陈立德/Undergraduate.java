package lab4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Undergraduate extends Student {
    public Undergraduate(int NO, String name) {
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
        // ËÄ·ÖÖÆËã·¨GPA
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
    	
    	
    	 
        //¡¾ÇëÌîÐ´Ô´Âë¡¿
    }

    public void printReport() {
    	 System.out.print("name:"+getName()+"  NO:"+getNO());
         System.out.printf("  average score:%.2f\n",getAverScore());
         
         for(int i=0;i<report.size();i++) {
        	 Course a=report.get(i).getCourse();
        	 System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+report.get(i).getScore());              

         }
    	//¡¾ÇëÌîÐ´Ô´Âë¡¿
    }

	
	protected void writeReport(String fileName) {
		File f=null;
		FileWriter fw = null;
		BufferedWriter bfw=null;
		
		
		try {
			f=new File(fileName);
			
			fw=new FileWriter(f,true);
			bfw=new BufferedWriter(fw);
			
			
			
			bfw.write("name:"+getName()+"  NO:"+getNO()+"  average score:"+getAverScore());
			bfw.newLine();
			for(int i=0;i<report.size();i++) {
		       	Course a=report.get(i).getCourse();
		       	bfw.write("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+report.get(i).getScore());
		       	bfw.newLine();
			}
		} catch (IOException e) {			
			System.out.println("Ð´ÈëÊ§°Ü");
		}
		try {
			bfw.flush();
			bfw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("¹Ø±ÕÊ§°Ü");
		}
	}
		

}
