
import java.util.*;

public class BubbleSort {
	

	public static void main(String[] args) {
		System.out.println("������Ҫ���������ĸ�����");
		Scanner in=new Scanner(System.in);
		int b=in.nextInt();
		double a[]=new double[b];
		System.out.println("������"+b+"�����ݣ�");
		for(int i=0;i<b;i++)
		{
			a[i]=in.nextInt();	
		}
		
		for(int i=0;i<b-1;i++)
		{
			for(int j=i+1;j<b;j++)
			{
				if(a[i]>a[j])
				{
					double temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("������˳���ǣ�");
		for(int i=0;i<b;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
