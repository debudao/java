package tom.jiafei;
public class Trangle
{
    double sideA,sideB,sideC;
	boolean boo;
	public Trangle(�����롿)
	{
	    sideA=a;sideB=b;sideC=c;
		if(�����롿)
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
	public void �޸�����(�����롿)
	{
	    sideA=a;sideB=b;sideC=c;
        �����롿		
	}
	
}