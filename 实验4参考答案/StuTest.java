public class StuTest 
{
    public static void main(String[] args) 
   {
        //���Դ����ļ��е�ѧ����Ϣ

       ReadFile f=new ReadFile();
       Student[] student=f.readFile("lianxi2.txt");//���Ե�ʱ�򣬰�lianxi1.txt��lianxi2.txt�����ݶ���һ��
       
       System.out.println("\n���ļ��е���Ϣ��ϸ���ˣ�������ʾ��");
       for(int i=0;i<student.length;i++)
       {
            student[i].printReport();
       }
       
       System.out.println("������Ϣ�Ѿ����ɹ�д���ļ��С�");
       System.out.println("");
        for(int j=0;j<student.length;j++)
       {
            student[j].writeReport("lianxi6.txt");
          
       }

       //���Դ�����ļ��е�ѧ����Ϣ

        Student s = new Undergraduate(130824206,"����");
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

        Student p = new Postgraduate(170824221, "����" ,"����ʦ", "�˹�����");
        p.addCourse(CourseFactory.getCourse("IT1005"), 80);
        p.addCourse(CourseFactory.getCourse("IT1007"), 90);
        p.printReport();
    }
     
}
