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
		    System.out.println("����һ��������");
			boo=true;
		}
		else
		{
		    System.out.println("�Ҳ���һ��������");
			boo=false;
		}	
	}
	public void �������()
	{
	    if(boo)
		{
		    double p=(sideA+sideB+sideC)/2.0;
			double area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			System.out.println("��һ�������Σ��ܼ������");
			System.out.println("����ǣ�"+area);
		}
		else
		{
		    System.out.println("����һ�������Σ��� �ܼ������"); 
		}
	}
	public void �޸�����(double a,double b,double c)
	{
	    sideA=a;sideB=b;sideC=c;
            if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a)
		{
		    System.out.println("����һ��������");
			boo=true;
		}
		else
		{
		    System.out.println("�Ҳ���һ��������");
			boo=false;
		}			
	}
	
}