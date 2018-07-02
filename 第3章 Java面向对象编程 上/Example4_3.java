class Tom
{
    final int MAX=100;
    static final int MIN=20; 
}
public class Example4_3
{
    public static void main(String args[])
    {
        System.out.println(Tom.MIN);
        Tom cat=new Tom();
        int x=0;
        x=Tom.MIN+cat.MAX;
        System.out.println(x);
    }
}
