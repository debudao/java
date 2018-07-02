package lab2;

public abstract class Student {
    protected String name;
    protected int id;  // 根据各位同学在lab1中指出的问题，全大写字母一般表示常量，此处做出调整，使用id表示学号
    protected double averScore;

    // private Course report;
    protected CourseScore report;


    protected abstract void calcAverScore();
    protected abstract void printReport();


    /**
     * init the student using the default parameters
     */
    protected Student() {
        this("",0);
    }

    /**
     * init the student using the given name and id
     * @param  name the name of the student
     * @param  id   the id of the student
     */
    protected Student(String name, int id) {
        this.name=name;
        this.id=id;
        averScore=0;
        report=new CourseScore();
        report.setNext(null);
    }

   

    /**
     * change the averScore of the student
     * @param averScore the new averScore of the student
     */
    public void setAverScore(double averScore) {
        this.averScore = averScore;
    }

    /**
     * get the report of the student
     * @return the report of the student
     */
    public CourseScore getReport() {
        return report;
    }

    /**
     * get the name of the student
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * get the id of the student
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * get the averScore of the student
     * @return the averScore of the student
     */
    public double getAverScore() {
        
        calcAverScore();
        return averScore;
    }

    /**
     * change the name of the student
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * change the id of the student
     * @param id the new id of the student
     */
    public void setNO(int id) {
        this.id = id;
    }

    /**
     * add a course and its score to the stduent
     * @param  course the course added to the student
     * @param  score  the course's score
     * @return        if successfully add,return true
     */
    public boolean addCourse(Course course, double score) {
        CourseScore c=report;
        while(c.getNext()!=null)
        {
            c=c.getNext();
            if(c.getCourse().equals(course))
                return false;
               
        }
        c.setNext(new CourseScore());
        c=c.getNext();
        c.setCourse(course);
        c.setScore(score);
        return true;
    }

    /**
     * delete a course by its NO
     * @param  NO the number of the course you want to delete
     * @return    if successfully delete,return true
     */
    public boolean delCourse(String NO) {
        CourseScore c;
        for (c=report;c.getNext()!=null&&!c.getNext().getCourse().getCourseNumber().equals(NO) ;c=c.getNext() ) ;
        if(c.getNext()==null)
            return false;
        c.setNext(c.getNext().getNext());
        return true;
    }

    /**
     * change a course's score by its NO
     * @param  NO    the number of the course you want to change
     * @param  score the new score of the course
     * @return       if successfully change ,return true
     */
    public boolean updateCourse(String NO, double score) {
        CourseScore c;
        for (c=report;c.getNext()!=null&&!c.getNext().getCourse().getCourseNumber().equals(NO) ;c=c.getNext() ) ;
        if(c.getNext()==null)
            return false;
        c.getNext().setScore(score);
        return true;
    }

    /**
     * print the course by its NO
     * @param NO the number of the course you want to print
     */
    public void printReport(String NO) {
        CourseScore c;
        for (c=report;c.getNext()!=null&&!c.getNext().getCourse().getCourseNumber().equals(NO) ;c=c.getNext() ) ;
        if(c.getNext()==null)
            return;
        c=c.getNext();
        Course a=c.getCourse();
        System.out.println("NO:"+a.getCourseNumber()+ "  Name:"+a.getCourseName()+ "  Hour:"+a.getCourseHour()+ "  Score:"+c.getScore());
    }


}
