package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile{

	
	public Student[] readFile(String string) {
		File f=null;
		FileReader fr=null;
		BufferedReader bfr;

		ArrayList<Student> a=new ArrayList<Student>();
		Student aa[];
		String b,c="\\s+";
		String d[];
		try {
			f=new  File(string);
			fr=new FileReader(f);
			bfr=new BufferedReader(fr);
			
			b=bfr.readLine();
			b.replaceAll(c, " ");//用正则表达式把读到的一行里面一个或多个空格替换成一个 空格
			d=b.split(c);
			int n=d.length;
			b=bfr.readLine();
			while(b!=null){
				Student s;
				b.replaceAll(c, " ");//用正则表达式把读到的一行里面一个或多个空格替换成一个 空格
				d=b.split(c);
				if(n==5){
					s=new Postgraduate(Integer.parseInt(d[0]),d[1],d[2],d[3]);
					for(int i=4;i<=d.length-1;i+=2)
						s.addCourse(CourseFactory.getCourse(d[i]), Double.parseDouble(d[i+1]));
				}				
				else {
					s=new Undergraduate(Integer.parseInt(d[0]), d[1]);
					for(int i=2;i<=d.length-1;i+=2)
						s.addCourse(CourseFactory.getCourse(d[i]), Double.parseDouble(d[i+1]));
				}				
				
				a.add(s);
				b=bfr.readLine();
				
			}
			
			
			
		} catch (IOException e) {
			System.out.println("读入失败");
		}
		
		aa=new Student[a.size()];
		for(int i=0;i<a.size();i++)
			aa[i]=a.get(i);
		
		return aa;
	}
	
}