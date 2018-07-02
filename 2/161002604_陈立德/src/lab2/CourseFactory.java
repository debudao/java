package lab2; 

public class CourseFactory {

   //strategy 2
   private static CourseFactory instance;
   private Course[] allCourses;

   private CourseFactory() {
   	  allCourses=new Course[10];
      allCourses[0] = new Course("IT1000","体系结构",2,40);
      allCourses[1] = new Course("IT1001","编译原理",3,60);
      allCourses[2] = new Course("IT1002","操作系统",3,60);
      allCourses[3] = new Course("IT1003","数据结构",2,40);
      allCourses[4] = new Course("IT1004","算法设计",1.5,50);
      allCourses[5] = new Course("IT1005","程序设计基础",2,40);
      allCourses[6] = new Course("IT1006","数据挖掘",1.5,40);
      allCourses[7] = new Course("IT1007","机器学习",1.5,40);
      allCourses[8] = new Course("IT1008","并行计算",1.5,40);
      allCourses[9] = new Course("IT1009","计算机网络",3,60);

   }


   /**
    * new a CourseFatory and get it
    * @return the instance you new
    */
   public static CourseFactory getInstance() {
       instance=new CourseFactory();
       return instance;
   }

   /**
    * get the course by its number
    * @param  number the number of the course you want to get
    * @return        the course you get
    */
   public Course getCourse(String number) {
       // TODO, please use foreach instead of normal for loop
       for(Course c:allCourses)
       {
          if (c.getCourseNumber().equals(number)) {
              return c;
          }
       }
       return null;
   }
}
