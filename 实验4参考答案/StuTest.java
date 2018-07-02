public class StuTest 
{
    public static void main(String[] args) 
   {
        //可以处理文件中的学生信息

       ReadFile f=new ReadFile();
       Student[] student=f.readFile("lianxi2.txt");//测试的时候，把lianxi1.txt和lianxi2.txt的内容都读一遍
       
       System.out.println("\n将文件中的信息详细化了，如下所示：");
       for(int i=0;i<student.length;i++)
       {
            student[i].printReport();
       }
       
       System.out.println("上述信息已经被成功写入文件中。");
       System.out.println("");
        for(int j=0;j<student.length;j++)
       {
            student[j].writeReport("lianxi6.txt");
          
       }

       //可以处理非文件中的学生信息

        Student s = new Undergraduate(130824206,"李想");
        System.out.println(s.getName());
        s.printReport();

        s.addCourse(CourseFactory.getCourse("IT1001"), 80);
        s.addCourse(CourseFactory.getCourse("IT1002"), 90);
        s.addCourse(CourseFactory.getCourse("IT1003"), 55);

        s.printReport();
        s.printReport("IT1002");

        s.updateCourse("IT1001",90);

        s.delCourse("IT1003");
        s.printReport();

        Student p = new Postgraduate(170824221, "陈婷" ,"杨老师", "人工智能");
        p.addCourse(CourseFactory.getCourse("IT1005"), 80);
        p.addCourse(CourseFactory.getCourse("IT1007"), 90);
        p.printReport();
    }
     
}
