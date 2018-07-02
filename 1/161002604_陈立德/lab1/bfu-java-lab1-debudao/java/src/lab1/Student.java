package lab1;

public class Student {
    private String name;
    private int NO;
    private double averScore;
    private Course report;

    /**
	 * init the student using the default parameters
	 */
    public Student() {
    	this("",0);
    }

    /**
	 * init the student using the given name and NO
	 * @param name the name give to the student
	 * @param NO the No give to the student
	 */  
    public Student(String name, int NO) {
        this.name = name;
        this.NO = NO;
        this.averScore = 0.0;
        this.report = new Course();
        this.report.setNext(null);
    }

    
    private void calcAverScore() {
    	double sum = 0;
    	double hoursum = 0;
    	Course c=report;
    	while (c.getNext()!=null)
    	{
    		c=c.getNext();
    		sum += c.getScore();
    		hoursum += c.getCourseHour();
    	}

    	averScore = sum / hoursum;
    }

    /**
	 * get the name from the student 
	 * @return you name of the student
	 */
    public String getName() {
        return name;
    }

    /**
	 * get the No from the student
	 * @return the NO of the student
	 */
    public int getNO() {
        return NO;
    }

    /**
	 * get the averscore from the student 
	 * @return the averscore of the student
	 */
    public double getAverScore() {
    	calcAverScore();
    	return averScore;
    }

    /**
	 * change the name of the student
	 * @param name new the name give to the student
	 */
    public void setName(String name) {
        this.name = name;
    }
    

    /**
	 * change the NO of the student
	 * @param NO the new NO give to the student
	 */
    public void setNO(int NO) {
        this.NO = NO;
    }

    /**
	 * add a course to the student.succeed return ture,else return false
	 * @param NO the course NO give to the student 
	 * @param name the course name give to the student
	 * @param hour the course hour give to the student
	 * @param score the course score give to the student
	 * @return succeed return true,else return false
	 */
    public boolean addCourse(String NO, String name, int hour, double score) {
    	Course c = report;
    	while (c.getNext()!=null)
    	{	
    		c = c.getNext();
    		if (c.getCourseNumber().equals(NO))
    			return false;
    	}

    	Course l = new Course();
    	l.setCourseNumber(NO);
    	l.setCourseName(name);
    	l.setCourseHour(hour);
    	l.setScore(score);;
    	l.setNext(null);
    	c.setNext(l);

    	return true;
    }

    /**
	 * Delete a course at a designated spot.
	 * @param NO the NO of the course you delete
	 * @return if successfully deleted return true,else return false
	 */
    public boolean delCourse(String NO) {
    	Course c = report;
    	int k = 0;
    	while (c.getNext()!=null)
    	{
    		if (c.getNext().getCourseNumber().equals(NO))
    		{
    			Course a = c.getNext().getNext();
    			c.setNext(a);
    			k = 1;
    			break;
    		}
    		else
    			c = c.getNext();
    	}
    	if (k == 0)
    		return false;

    	return true;
    }

    /**
	 * change a course at a designated spot.
	 * @param NO the NO of the course you change
	 * @param score the score of the course you change
	 * @return if fail to find the course return false,else return true
	 */
    public boolean updateCourse(String NO, double score) {
    	Course c = report;
    	int k = 0;
    	while (c.getNext()!=null)
    	{
    		if (c.getNext().getCourseNumber() == NO)
    		{
    			c.setScore(score);
    			k = 1;
    			break;
    		}
    		else
    			c = c.getNext();
    	}
    	if (k == 0)
    		return  false;

    	return true;
    }

    /**
	 * print all the information of the student 
	 */
    public void printReport() {
    	Course c = report;

    	while (c.getNext()!=null)
    	{
    		c = c.getNext();
    		System.out.println(c.getCourseNumber()+" "+c.getCourseHour()+" "+c.getCourseName()+" "+c.getScore());
    	}
    }

    /**
	 * print the report information by its NO
	 * @param NO the NO of the course you print
	 */
    public void printReport(String NO) {
    	Course c = report;

    	while (c.getNext()!=null)
    	{
    		if (c.getNext().getCourseNumber() == NO)
    		{
    			c = c.getNext();
    			System.out.println(c.getCourseNumber()+" "+c.getCourseHour()+" "+c.getCourseName()+" "+c.getScore());
    			break;
    		}
    		else
    			c = c.getNext();
    	}
    }
    

}
