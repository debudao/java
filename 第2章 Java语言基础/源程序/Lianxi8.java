//Lianxi8.java
//���100��200֮�䲻�ܱ�3����������
public class Lianxi8
{
   public static void main(String args[])
   {
       int n;
       System.out.println("���100��200֮�䲻�ܱ�3������������");
       for(n=100;n<=200;n++)
       {
            if(n%3==0)
		continue;
	    System.out.print(n+" ");
       }
   }
}