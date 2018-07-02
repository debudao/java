import java.util.Scanner;

public class XOREncryption {

	public static void main(String[] args) {
		System.out.println("请输入要加密的密码：");
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		char a[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
			a[i]=s1.charAt(i);
		
		System.out.println("请输入密钥：");
		char t=in.next().charAt(0);
		
		for(int i=0;i<s1.length();i++)
			a[i]=(char)(a[i]^t);
		
		for(int i=0;i<s1.length();i++)
			System.out.println(a[i]);

	}

}
