package lab5;

public class CourseFactory {
    // strategy 1
    private static Course[] allCourses;

    static {
        allCourses = new Course[]{
                new Course("IT1000", "体系结构", 2,40),
                new Course("IT1001", "编译原理", 3,60),
                new Course("IT1002", "操作系统", 3,60),
                new Course("IT1003", "数据结构", 2,40),
                new Course("IT1004", "算法设计", 1.5,50),
                new Course("IT1005", "程序设计基础", 2, 40),
                new Course("IT1006", "数据挖掘", 1.5,40),
                new Course("IT1007", "机器学习", 1.5, 40),
                new Course("IT1008", "并行计算", 1.5, 40),
                new Course("IT1009", "计算机网络", 3,60)
        };
    }

    public static Course getCourse(String number) {
        for (Course c : allCourses) {
            if (c.getCourseNumber().equals(number))
                return c;
        }
        return null;
    }


    // strategy 2
//    private static CourseFactory instance;
//    private Course[] allCourses;
//
//    {
//        allCourses = new Course[]{
//                new Course("IT1000", "体系结构", 2,40),
//                new Course("IT1001", "编译原理", 3,60),
//                new Course("IT1002", "操作系统", 3,60),
//                new Course("IT1003", "数据结构", 2,40),
//                new Course("IT1004", "算法设计", 1.5,50),
//                new Course("IT1005", "程序设计基础", 2, 40),
//                new Course("IT1006", "数据挖掘", 1.5,40),
//                new Course("IT1007", "机器学习", 1.5, 40),
//                new Course("IT1008", "并行计算", 1.5, 40),
//                new Course("IT1009", "计算机网络", 3,60)
//        };
//    }
//
//    private CourseFactory() {
//    }
//
//    public Course getCourse(String number) {
//        for (Course c : allCourses) {
//            if (c.getCourseNumber().equals(number))
//                return c;
//        }
//        return null;
//    }
//
//    public static CourseFactory getInstance() {
//        if (instance == null) {
//            instance = new CourseFactory();
//        }
//        return instance;
//    }
}
