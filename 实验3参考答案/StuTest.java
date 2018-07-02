public class StuTest {
    public static void main(String[] args) {

        Student s = new Undergraduate("����", 130824206);
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

        Student p = new Postgraduate("����", 170824221, "����ʦ", "�˹�����");
        p.addCourse(CourseFactory.getCourse("IT1005"), 80);
        p.addCourse(CourseFactory.getCourse("IT1007"), 90);
        p.printReport();
    }
}
