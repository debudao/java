import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		System.out.println("��������������");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt();
		if(a<b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		
		while(a%b!=0)
		{
			int c=a%b;
			a=b;
			b=c;
		}
		
		System.out.println("���Լ���ǣ�"+b);

	}

}
