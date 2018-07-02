import java.io.*;
import java.util.*;
public class ReadFile
{
   public Student[] readFile(String fileName)
  {        
        String temp=null;
        int rows=0;
        Student[] student=new Student[1];      
        
        try{
               FileReader fr=new FileReader(fileName);
               BufferedReader br=new BufferedReader(fr);
               StringTokenizer s1; 
               while((temp=br.readLine())!=null)
              {
                   rows=rows+1;
              }
              
               br.close();
               fr.close();
             
               fr=new FileReader(fileName);
               br=new BufferedReader(fr);
              
               String title=br.readLine();
                      
               student=new Student[rows-1];
         
               if(title.contains("导师"))
               {
                   for(int k=0;k<rows-1;k++)
                  {
                       temp=br.readLine();
                       s1=new StringTokenizer(temp);
                       int number=s1.countTokens();
                       String s[]=new String[number];
                       int j=0;
                       while(s1.hasMoreTokens()) 
                      { 
                           s[j]=s1.nextToken();
                           j++;
                       }
                       student[k]=new Postgraduate(Integer.parseInt(s[0]),s[1],s[2],s[3]);
                       Postgraduate uu=new Postgraduate(Integer.parseInt(s[0]),s[1],s[2],s[3]);
                       for(int i=4;i<s.length-1;i=i+2)
                      {
                           student[k].addCourse(CourseFactory.getCourse(s[i]),Double.parseDouble(s[i+1]));
                       }
                     }   
                 }
                else
               {
                    for(int k=0;k<rows-1;k++)
                   {
                        temp=br.readLine();
                        s1=new StringTokenizer(temp);
                        int number=s1.countTokens();
                        String s[]=new String[number];
                        int j=0;
                        while(s1.hasMoreTokens()) 
                       { 
                            s[j]=s1.nextToken();
                            j++;
                        }
                        student[k]=new Undergraduate(Integer.parseInt(s[0]),s[1]);
                        for(int i=2;i<s.length-1;i+=2)
                       {
                            student[k].addCourse(CourseFactory.getCourse(s[i]),Double.parseDouble(s[i+1]));
                       }
                    }
                }
        
                br.close();
                fr.close();
             }catch(IOException e){
                    System.out.println("输入输出错误！");
             }

              return student;
                
   }
   
}