import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),sum=0;
		
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
				sum+=i;
		}
		if(sum==a)
			System.out.println("������������");
		else
			System.out.println("��������������");

	}

}
