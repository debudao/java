import java.util.Scanner;
class Tom
{
    void f(int x,double y)
    {
        x=x+1;
        y=y+1;
        System.out.printf("x=%d,y=%6.1f\n",x,y);
    }
}

public class Lianxi1
{
    public static void main(String args[])
    {
       int a;
       double b;
       Scanner reader=new Scanner(System.in);
       a=reader.nextInt();
       b=reader.nextDouble();
       Tom cat=new Tom();
       cat.f(a,b);
       System.out.printf("a=%d,b=%6.1f\n",a,b);
    }
} 