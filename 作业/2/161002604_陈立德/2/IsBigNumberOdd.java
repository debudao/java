import java.util.Scanner;

public class IsBigNumberOdd {

	public static void main(String[] args) {
		System.out.println("请输入一个大数：");
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		
		int a=(int)s1.charAt(s1.length()-1)-'0';
		
		System.out.println((a%2==0)?"偶数":"奇数");

	}

}
