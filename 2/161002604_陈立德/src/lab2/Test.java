package lab2;

public class Test {
    public static void main(String[] args) {
   
       StuList st=new StuList();
       Undergraduate s1=new Undergraduate("xiaoming",1);
       Undergraduate s2=new Undergraduate("lihua",2);
       Undergraduate s3=new Undergraduate("xiaohong",3);
       CourseFactory cf=CourseFactory.getInstance();
       Course c1=cf.getCourse("IT1004"),c2=cf.getCourse("IT1005"),c3=cf.getCourse("IT1006");


       s1.addCourse(c1,90);
       s1.addCourse(c2,80);
       s1.addCourse(c3,100);
       st.addStu(s1);

       s2.addCourse(c1,90);
       s2.addCourse(c2,90);
       s2.addCourse(c3,100);
       st.addStu(s2);

       s3.addCourse(c1,80);
       s3.addCourse(c2,80);
       s3.addCourse(c3,100);
       st.addStu(s3);

       System.out.println("排序前：");
       st.print();

       st.sort();
       System.out.println("排序后：");
       st.print();

       System.out.println("删除前，长度为："+st.size());
       st.removeStu(2);
       st.removeStu_id(1);
       System.out.println("删除后，长度为："+st.size());
       st.print();

    }
}
