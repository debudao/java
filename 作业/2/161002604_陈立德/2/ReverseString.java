import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		Scanner in=new Scanner(System.in);
		String a=in.next();
		
		char b[]=new char[a.length()];
		for(int i=0;i<a.length();i++)
			b[i]=a.charAt(a.length()-i-1);
		
		System.out.println(b);

	}

}
