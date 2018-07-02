package lab2;


public class ListTest {
    public static void main(String[] args) {
        CourseFactory cf = CourseFactory.getInstance();

        Student s1 = new Postgraduate("小林", 160824210, "马老师", "云计算");
        s1.addCourse(cf.getCourse("IT1000"), 80);
        s1.addCourse(cf.getCourse("IT1008"), 90);
        s1.addCourse(cf.getCourse("IT1009"), 55);

        Student s2 = new Postgraduate("李想", 160824209, "沈老师", "软件工程");
        s2.addCourse(cf.getCourse("IT1003"), 70);
        s2.addCourse(cf.getCourse("IT1005"), 85);
        s2.addCourse(cf.getCourse("IT1006"), 60);

        Student s3 = new Postgraduate("小宇", 160824207, "韩老师", "人工智能");
        s3.addCourse(cf.getCourse("IT1004"), 60);
        s3.addCourse(cf.getCourse("IT1006"), 70);
        s3.addCourse(cf.getCourse("IT1007"), 85);


        StuList list = new StuList();
        list.addStu(s1);
        list.addStu(s2);
        list.addStu(s3);
        list.sort();
        list.print();

        System.out.println("After delete the index 1 student:");
        list.removeStu(1);
        list.print();

        System.out.println("After delete the student of NO 160824210");
        list.removeStu_id(160824210);
        list.print();
    }
}
