public class ListTest {
    public static void main(String[] args) {

        Student s1 = new Postgraduate("С��", 160824210, "����ʦ", "�Ƽ���");
        s1.addCourse( CourseFactory.getCourse("IT1000"), 80);
        s1.addCourse( CourseFactory.getCourse("IT1008"), 90);
        s1.addCourse( CourseFactory.getCourse("IT1009"), 55);

        Student s2 = new Postgraduate("����", 160824209, "����ʦ", "�������");
        s2.addCourse( CourseFactory.getCourse("IT1003"), 70);
        s2.addCourse( CourseFactory.getCourse("IT1005"), 85);
        s2.addCourse( CourseFactory.getCourse("IT1006"), 60);

        Student s3 = new Postgraduate("С��", 160824207, "����ʦ", "�˹�����");
        s3.addCourse( CourseFactory.getCourse("IT1004"), 60);
        s3.addCourse( CourseFactory.getCourse("IT1006"), 70);
        s3.addCourse( CourseFactory.getCourse("IT1007"), 85);


        StuList list = new StuList();

        System.out.println("��ӵ�ѧ����Ϣ������ѧ�ŵ�������д洢��");
        list.addStu(s1);
        list.addStu(s2);
        list.addStu(s3);
        System.out.println("ѧ������Ϊ��"+list.size());
        System.out.println("ѧ����ϢΪ��");
        list.print();

        list.sortAverScore();

        System.out.println("After delete the student of NO 160824210");
        System.out.println(list.removeStu_id(160824210).getName());
        list.print();

        list.clear();
        System.out.println("ѧ������Ϊ��"+list.size());
    }
}
