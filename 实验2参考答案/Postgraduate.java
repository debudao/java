package lab2;

public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;

    public Postgraduate(String name, int NO, String tutor, String area) {
        super(name, NO);
        setTutor(tutor);
        setResearchArea(area);
    }

    protected void calcAverScore() {
        // 标准算法GPA (各科成绩按学分的加权平均数 * 4 / 100)
        if (getReport().getNext() == null) {
            setAverScore(0.0);
            return;
        }
        double credits = 0;
        double allscores = 0.0;
        for (CourseScore c = getReport().getNext(); c != null; c = c.getNext()) {
            credits += c.getCourse().getCredit();
            allscores += c.getScore() * c.getCourse().getCredit();
        }
        setAverScore(allscores / credits * 4 / 100);
    }

    public void printReport() {
        System.out.println("The report of Student " + getName() + " " + getNO());
        System.out.println("Tutor: " + this.tutor + " ResearchArea: " + this.researchArea);
        System.out.println("NO\t\t\tName\t\tHour\tscore");
        for (CourseScore c = getReport().getNext(); c != null; c = c.getNext()) {
            System.out.println(c.getCourse().getCourseNumber() + "\t" +
                    c.getCourse().getCourseName() + "\t" +
                    c.getCourse().getCourseHour() + "\t\t" + c.getScore());
        }
        calcAverScore();
        System.out.println("学分积：" + getAverScore());
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

}
