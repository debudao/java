public class ListTest {
    public static void main(String[] args) {

        Student s1 = new Postgraduate("小林", 160824210, "马老师", "云计算");
        s1.addCourse( CourseFactory.getCourse("IT1000"), 80);
        s1.addCourse( CourseFactory.getCourse("IT1008"), 90);
        s1.addCourse( CourseFactory.getCourse("IT1009"), 55);

        Student s2 = new Postgraduate("李想", 160824209, "沈老师", "软件工程");
        s2.addCourse( CourseFactory.getCourse("IT1003"), 70);
        s2.addCourse( CourseFactory.getCourse("IT1005"), 85);
        s2.addCourse( CourseFactory.getCourse("IT1006"), 60);

        Student s3 = new Postgraduate("小宇", 160824207, "韩老师", "人工智能");
        s3.addCourse( CourseFactory.getCourse("IT1004"), 60);
        s3.addCourse( CourseFactory.getCourse("IT1006"), 70);
        s3.addCourse( CourseFactory.getCourse("IT1007"), 85);


        StuList list = new StuList();

        System.out.println("添加的学生信息将按照学号的升序进行存储：");
        list.addStu(s1);
        list.addStu(s2);
        list.addStu(s3);
        System.out.println("学生数量为："+list.size());
        System.out.println("学生信息为：");
        list.print();

        list.sortAverScore();

        System.out.println("After delete the student of NO 160824210");
        System.out.println(list.removeStu_id(160824210).getName());
        list.print();

        list.clear();
        System.out.println("学生数量为："+list.size());
    }
}
