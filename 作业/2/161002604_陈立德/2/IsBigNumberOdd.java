import java.util.Scanner;

public class IsBigNumberOdd {

	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		
		int a=(int)s1.charAt(s1.length()-1)-'0';
		
		System.out.println((a%2==0)?"ż��":"����");

	}

}
