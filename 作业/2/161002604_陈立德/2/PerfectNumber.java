import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("请输入一个数：");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),sum=0;
		
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
				sum+=i;
		}
		if(sum==a)
			System.out.println("该数是完数。");
		else
			System.out.println("该数不是完数。");

	}

}
