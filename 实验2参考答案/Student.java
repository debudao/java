package lab2;

public abstract class Student {
    private String name;
    private int NO;
    private double averScore;
    private CourseScore report;

    protected Student() {
        this("", -1);
    }

    public void setAverScore(double averScore) {
        this.averScore = averScore;
    }

    public CourseScore getReport() {
        return report;
    }

//    public void setReport(Course report) {
//        this.report = report;
//    }

    protected Student(String name, int NO) {
        this.name = name;
        this.NO = NO;
        this.averScore = 0.0;
        this.report = new CourseScore();
        this.report.setNext(null);
    }

    protected abstract void calcAverScore();

    protected abstract void printReport();

    public void printReport(String NO) {
        CourseScore c;
        for (c = this.report; c.getNext() != null && !c.getNext().getCourse().getCourseNumber().equals(NO); c = c.getNext()) ;
        if (c.getNext() == null)
            return;
        System.out.println("NO\t\t\tName\t\tHour\tScore");
        System.out.println(c.getCourse().getCourseNumber() + "\t" + c.getCourse().getCourseName() + "\t" + c.getCourse().getCourseHour() + "\t\t" + c.getScore());
    }

    public String getName() {
        return name;
    }

    public int getNO() {
        return NO;
    }

    public double getAverScore() {
        calcAverScore();
        return averScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public boolean addCourse(Course course, double score) {
        CourseScore c;
        for (c = this.report; c.getNext() != null && !c.getNext().getCourse().getCourseNumber().equals(course.getCourseNumber()); c = c.getNext()) ;
        if (c.getNext() != null)
            return false;
        c.setNext(new CourseScore());
        c = c.getNext();
        c.setCourse(course);
        c.setScore(score);
        c.setNext(null);
        return true;
    }

    public boolean delCourse(String NO) {
        CourseScore c;
        for (c = this.report; c.getNext() != null && !c.getNext().getCourse().getCourseNumber().equals(NO); c = c.getNext()) ;
        if (c.getNext() == null)
            return false;
        c.setNext(c.getNext().getNext());
        return true;
    }

    public boolean updateCourse(String NO, double score) {
        CourseScore c;
        for (c = this.report; c.getNext() != null && !c.getNext().getCourse().getCourseNumber().equals(NO); c = c.getNext()) ;
        if (c.getNext() == null)
            return false;
        c = c.getNext();
        c.setScore(score);
        return true;
    }


}
