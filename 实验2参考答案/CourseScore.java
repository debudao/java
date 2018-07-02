package lab2;

public class CourseScore {
    private Course course;
    private double score;
    private CourseScore next;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public CourseScore getNext() {
        return next;
    }

    public void setNext(CourseScore next) {
        this.next = next;
    }
}
