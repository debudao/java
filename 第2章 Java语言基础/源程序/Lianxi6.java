//Lianxi6.java
//����1~100֮���λż��֮�ͣ���2+4+��+100=?


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