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
       System.out.println("开始时，jerry的leg值为："+jerry.leg);
       cat.f(jerry);
       System.out.println("调用函数之后，jerry的leg值为："+jerry.getLeg());
    }
}