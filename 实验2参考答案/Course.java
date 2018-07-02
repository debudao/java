package lab2;

public class Course {
    private String courseNumber;
    private String courseName;
    private double credit;
    private int courseHour;

    public Course(String courseNumber, String courseName, double credit, int courseHour) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.credit = credit;
        this.courseHour = courseHour;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }



    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }

}

