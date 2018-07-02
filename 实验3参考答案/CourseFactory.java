public class CourseFactory {
    private static Course[] allCourses;

    static {
        allCourses = new Course[]{
                new Course("IT1000", "��ϵ�ṹ", 2,40),
                new Course("IT1001", "����ԭ��", 3,60),
                new Course("IT1002", "����ϵͳ", 3,60),
                new Course("IT1003", "���ݽṹ", 2,40),
                new Course("IT1004", "�㷨���", 1.5,50),
                new Course("IT1005", "������ƻ���", 2, 40),
                new Course("IT1006", "�����ھ�", 1.5,40),
                new Course("IT1007", "����ѧϰ", 1.5, 40),
                new Course("IT1008", "���м���", 1.5, 40),
                new Course("IT1009", "���������", 3,60)
        };
    }

    public static Course getCourse(String number) {
        for (Course c : allCourses) {
            if (c.getCourseNumber().equals(number))
                return c;
        }
        return null;
    }
}
