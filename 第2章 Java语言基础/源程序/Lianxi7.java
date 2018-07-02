//Lianxi7.java
//输出100～200之间不能被3整除的整数，直到遇到第一个被3整除的数为止

public class Lianxi7
{
   public static void main(String args[])
   {
       int n;
       System.out.println("输出100～200之间不能被3整除的整数，直到遇到第一个被3整除的数为止：");
       for(n=100;n<=200;n++)
       {
            if(n%3==0)
		break;
	    System.out.print(n+" ");
       }
   }
}