package lab2;

public interface StuListInterface {
    /**
     * Returns true if this Student list contains no elements.
     * @return true if this Student list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of Students in this StuList.
     * @return the number of Students in this StuList
     */
    int size();

    /**
     * Appends the Student s to the end of Student list.
     * @param s Student to be appended to this StuList
     * @return true if the StuList has enough space to append a Student
     */
    boolean addStu(Student s);

    /**
     * Removes the Student at the specified position in this StuList.
     * Shifts any subsequent Students to the left (subtracts one from their indices).
     * @param index the index of the Student to be removed
     * @return the Student that was removed from the StuList
     */
    Student removeStu(int index);

    /**
     * Removes the Student whose id equals the id parameter in this StuList.
     * Shifts any subsequent Students to the left (subtracts one from their indices).
     * @param id the id of the Student to be removed
     * @return the Student that was removed from the StuList
     */
    Student removeStu_id(int id);

    /**
     * Sort the Students List by GPA.
     */
    void sort();

    /**
     * Output the basic information of each Student in StuList.
     * The basic information includes StuID, Name, GPA
     */
    void print();
}
