class Jerry
{
    int leg;
    Jerry(int n)
    {
       leg=n;
    }
    void setLeg(int n)
    {
       leg=n;
    }
    int getLeg()
    {
       return leg;
    }
}

class Tom
{
    void f(Jerry mouse)
    {
        mouse.setLeg(4);
    }
}

public class Lianxi2
{
    public static void main(String args[])
    {
       Tom cat=new Tom();
       Jerry jerry=new Jerry(2);
       System.out.println("��ʼʱ��jerry��legֵΪ��"+jerry.leg);
       cat.f(jerry);
       System.out.println("���ú���֮��jerry��legֵΪ��"+jerry.getLeg());
    }
}