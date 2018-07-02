class Lader
{
    double above,bottom,height;
    Lader(){}
    Lader(double a,double b,double h)
    {
        above=a;
        bottom=b;
        height=h;
    }
    public void setAbove(double a)
    {
        above=a;
    }
    public void setBottom(double b)
    {
        bottom=b;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    double computeArea()
    {
        return (above+bottom)*height/2.0;
    }
}
public class Example4_1
{
    public static void main(String args[])
    {
       double area1=0,area2=0;
       Lader laderOne,laderTwo;

       laderOne=new Lader();
       laderTwo=new Lader(10,88,20);

       laderOne.setAbove(16);
       laderOne.setBottom(26);
       laderOne.setHeight(100);

       laderTwo.setAbove(300);
       laderTwo.setBottom(500);

       area1=laderOne.computeArea();
       area2=laderTwo.computeArea();

       System.out.println("laderOne的above,bottom和height:"+laderOne.above+","+laderOne.bottom+","+laderOne.height);
       System.out.println("laderOne的面积:"+area1);
       
       System.out.println("laderTwo的above,bottom和height:"+laderTwo.above+","+laderTwo.bottom+","+laderTwo.height);
       System.out.println("laderTwo的面积:"+area2);
    }
}
