package lab2;

public class Undergraduate extends Student {
    public Undergraduate(String name, int NO) {
        super(name, NO);
    }

    /**
     * A 100-90 4
     * B 89-80   3
     * C 79-70  2
     * D 69-60  1
     * E 59 - 0  0
     */

    private int getGPA4(double score) {
        if (score >= 90 && score <= 100) {
            return 4;
        } else if (score >= 80 && score < 90) {
            return 3;
        } else if (score >= 70 && score < 80) {
            return 2;
        } else if (score >= 60 && score < 70) {
            return 1;
        } else {
            return 0;
        }
    }

    protected void calcAverScore() {
        // 四分制算法GPA

        if (getReport().getNext() == null) {
            setAverScore(0.0);
            return;
        }
        double credits = 0;
        double allscores = 0.0;
        for (CourseScore c = getReport().getNext(); c != null; c = c.getNext()) {
            credits += c.getCourse().getCredit();
            allscores += getGPA4(c.getScore()) * c.getCourse().getCredit();
        }
        setAverScore(allscores / credits);
    }

    public void printReport() {
        System.out.println("The report of Student " + this.getName() + " " + this.getNO());
        System.out.println("NO\t\t\tName\t\tHour\tscore");
        for (CourseScore c = getReport().getNext(); c != null; c = c.getNext()) {
            System.out.println(c.getCourse().getCourseNumber() + "\t" + c.getCourse().getCourseName() + "\t" + c.getCourse().getCourseHour() + "\t\t" + c.getScore());
        }
        calcAverScore();
        System.out.println("学分积：" + getAverScore());
    }

}
