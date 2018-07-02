package lab2;

public class StuList implements StuListInterface {
    private Student[] stus;
    private int length;   // the actual number of student it contains
    private static final int DEFAULT_CAPACITY = 15;   // default initial capacity

    /**
     * init the stulist using the default capacity
     */
    public StuList() {
        //this(DEFAULT_CAPACITY);
        stus = new Student[DEFAULT_CAPACITY];
        this.length = 0;
    }

    /**
     * Init the StuList using the given len
     * @param len the initial len of the StuList
     */
    public StuList(int len) {
        stus = new Student[len];
        this.length = 0;
    }

    // TODO, you should  implements the StuListInterface here
    // You can reuse you code in lab1
    

    /**
     * Returns true if this Student list contains no elements.
     * @return true if this Student list contains no elements
     */
    public boolean isEmpty(){
        return this.length == 0;
    }

    /**
     * Returns the number of Students in this StuList.
     * @return the number of Students in this StuList
     */
    public int size(){
        return this.length;
    }

    private boolean isOverflow() {  
        if (this.length < stus.length)
            return false;
        else
            return true;
    }

    /**
     * Appends the Student s to the end of Student list.
     * @param s Student to be appended to this StuList
     * @return true if the StuList has enough space to append a Student
     */
    public boolean addStu(Student s){
        if(isOverflow())
            return false;
        stus[this.length]=s;
        this.length++;
        return true;
    }

    private int indexOf(int stuId) {
        for (int i = 0; i < this.length; i++) {
            if (stus[i].getId() == stuId)
                return i;
        }
        return -1;
    }

    /**
     * Removes the Student at the specified position in this StuList.
     * Shifts any subsequent Students to the left (subtracts one from their indices).
     * @param index the index of the Student to be removed
     * @return the Student that was removed from the StuList
     */
    public Student removeStu(int index){
        if(isEmpty())
            return null;
        Student s=stus[index];
        for (int i = index; i < this.length - 1; i++) {
            stus[i] = stus[i+1];
        }
        this.length--;
        return s;
    }

     /**
     * Removes the Student whose id equals the id parameter in this StuList.
     * Shifts any subsequent Students to the left (subtracts one from their indices).
     * @param id the id of the Student to be removed
     * @return the Student that was removed from the StuList
     */
    public Student removeStu_id(int id){
        int i=indexOf(id);
        return removeStu(i);
    }

     /**
     * Sort the Students List by GPA.
     */
    public void sort(){
        for (int i = 0; i < this.length - 1; i++)
         {
            for (int j = 0; j < this.length - i - 1; j++) 
            {
                if (stus[j].getAverScore() < stus[j+1].getAverScore())
                {
                    Student t = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = t;
                }
            }
        }
    }

    /**
     * Output the basic information of each Student in StuList.
     * The basic information includes StuID, Name, GPA
     */
    public void print(){
        for(int i=0;i<length;i++)
        {
            stus[i].printReport();
        }
    }

}
