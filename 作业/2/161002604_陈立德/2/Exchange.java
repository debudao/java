import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		System.out.println("�������һ����a��");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("������ڶ�����b��");
		int b=in.nextInt();
		
		a=b-a;
		b=b-a;
		a=a+b;
		
		System.out.println("������a="+a+"��b="+b);

	}

}
