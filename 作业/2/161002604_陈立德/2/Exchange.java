import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		System.out.println("请输入第一个数a：");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("请输入第二个数b：");
		int b=in.nextInt();
		
		a=b-a;
		b=b-a;
		a=a+b;
		
		System.out.println("交换后，a="+a+"，b="+b);

	}

}
