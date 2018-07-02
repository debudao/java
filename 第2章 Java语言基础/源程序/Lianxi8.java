//Lianxi8.java
//输出100～200之间不能被3整除的整数
public class Lianxi8
{
   public static void main(String args[])
   {
       int n;
       System.out.println("输出100～200之间不能被3整除的整数：");
       for(n=100;n<=200;n++)
       {
            if(n%3==0)
		continue;
	    System.out.print(n+" ");
       }
   }
}