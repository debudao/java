package lab2;

public class StuList implements StuListInterface {
    private Student[] stus;
    private int length;   // the actual number of student it contains
    private static final int DEFAULT_CAPACITY = 15;   // default initial capacity

    public StuList() {
        //this(DEFAULT_CAPACITY);
        stus = new Student[DEFAULT_CAPACITY];
        this.length = 0;
    }

    public StuList(int len) {
        stus = new Student[len];
        this.length = 0;
    }

    private boolean isOverflow() {
        if (this.length < stus.length)
            return false;
        else
            return true;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public int size() {
        return this.length;
    }

    public boolean addStu(Student x) {
        if (isOverflow())
            return false;
        stus[length++] = x;
        return true;
    }

    public Student removeStu(int index) {
        if (isEmpty())
            return null;
        Student temp = stus[index];
        for (int i = index; i < this.length - 1; i++) {
            stus[i] = stus[i + 1];
        }
        this.length--;
        return temp;
    }

    public Student removeStu_id(int stuId) {
        int index = indexOf(stuId);
        return removeStu(index);
    }

    private int indexOf(int stuId) {
        for (int i = 0; i < this.length; i++) {
            if (stus[i].getNO() == stuId)
                return i;
        }
        return -1;
    }

    public void sort() {
        for (int i = 0; i < this.length - 1; i++) {
            for (int j = 0; j < this.length - i - 1; j++) {
                if (stus[j].getAverScore() < stus[j + 1].getAverScore()) {
                    Student t = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = t;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.length; i++) {
            System.out.printf("NO:%d\t Name:%s\t AverScore:%.2f \n", stus[i].getNO(), stus[i].getName(), stus[i].getAverScore());
        }
    }

}
