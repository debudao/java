import java.util.Scanner;

public class IsPalindromicString {

	public static void main(String[] args) {
		System.out.println("请输入一个单词：");
		Scanner in=new Scanner(System.in);
		String a=in.next();
		int k=1;
		
	
		
		for(int i=0;i<(a.length()-1)/2;i++)
		{
			if(a.charAt(i)!=a.charAt(a.length()-i-1))
			{
				k=0;
				break;
			}
		}
		
		System.out.println(k==1?"是回文":"不是回文");

	}

}
