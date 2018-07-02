//Lianxi6.java
//计算1~100之间各位偶数之和，即2+4+…+100=?


public class Lianxi6
{
   public static void main(String args[])
   {
       int i,sum=0;
       for(i=2;i<=100;i+=2)
	   sum=sum+i;
       System.out.println("2+4+...+100="+sum);
   }
}