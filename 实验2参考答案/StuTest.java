package lab2;

public class StuTest {
    public static void main(String[] args) {

        Student s = new Undergraduate("李想", 130824206);
        System.out.println(s.getName());
        s.printReport();

        CourseFactory cf = CourseFactory.getInstance();
        s.addCourse(cf.getCourse("IT1001"), 80);
        s.addCourse(cf.getCourse("IT1002"), 90);
        s.addCourse(cf.getCourse("IT1003"), 55);

        s.printReport();
        s.printReport("IT1002");

        s.delCourse("IT1003");
        s.printReport();

        Student p = new Postgraduate("陈婷", 170824221, "杨老师", "人工智能");
        p.addCourse(cf.getCourse("IT1005"), 80);
        p.addCourse(cf.getCourse("IT1007"), 90);
        p.printReport();
    }
}
