//BigInteger����ϰ

import java.math.*;
class TestBigInteger
{
   public static void main(String args[])
   {
       BigInteger n1=new BigInteger("987654321987654321987654321"),
                  n2=new BigInteger("123456789123456789123456789"),
                  result=null;
       System.out.println("n1�Ķ����Ʊ�ʾ:"+n1.toString(2));
       System.out.println("n2�İ˽��Ʊ�ʾ:"+n2.toString(8));

       result=n1.add(n2);
       System.out.println("��:"+result);

       result=n1.subtract(n2);
       System.out.println("��:"+result.toString());

       result=n1.multiply(n2);
       System.out.println("��:"+result.toString());

       result=n1.divide(n2);
       System.out.println("��:"+result.toString());
      
   }
}
