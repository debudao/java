package tom.jiafei;
public class Trangle
{
    double sideA,sideB,sideC;
	boolean boo;
	public Trangle(double a,double b,double c)
	{
	    sideA=a;sideB=b;sideC=c;
		if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a)
		{
		    System.out.println("我是一个三角形");
			boo=true;
		}
		else
		{
		    System.out.println("我不是一个三角形");
			boo=false;
		}	
	}
	public void 计算面积()
	{
	    if(boo)
		{
		    double p=(sideA+sideB+sideC)/2.0;
			double area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			System.out.println("是一个三角形，能计算面积");
			System.out.println("面积是："+area);
		}
		else
		{
		    System.out.println("不是一个三角形，不 能计算面积"); 
		}
	}
	public void 修改三边(double a,double b,double c)
	{
	    sideA=a;sideB=b;sideC=c;
            if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a)
		{
		    System.out.println("我是一个三角形");
			boo=true;
		}
		else
		{
		    System.out.println("我不是一个三角形");
			boo=false;
		}			
	}
	
}