//Lianxi2.java
//��Ϥ���������

public class  Lianxi2
{  
    public static void main (String args[ ])
    {
         int[] a={1,2,3},b={4,5};
         System.out.println("����a�������ǣ�"+a);
         System.out.println("����b�������ǣ�"+b);
         System.out.println("b[0]="+b[0]+" b[1]="+b[1]);
         b=a;
         System.out.println("����a�������ǣ�"+a);
         System.out.println("����b�������ǣ�"+b);
         b[1]=6;
         b[2]=9;
         System.out.println("a[0]="+a[0]+" a[1]="+a[1]+" a[2]="+a[2]);
         System.out.println("b[0]="+b[0]+" b[1]="+b[1]+" b[2]="+b[2]);
    }
}
