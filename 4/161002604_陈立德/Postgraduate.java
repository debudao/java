package lab4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;

    public Postgraduate(int NO, String name, String tutor, String area) {
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
		       	bfw.write("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+report.get(i).getScore()+"  tutor:"+tutor+"  research area"+researchArea);  
		       	bfw.newLine();
			}
		} catch (IOException e) {			
			System.out.println("写入失败");
		}
		
		try {
			bfw.flush();
			bfw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("关闭失败");
		}
		
	}

}
