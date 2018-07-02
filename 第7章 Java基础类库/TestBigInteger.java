//BigInteger类练习

import java.math.*;
class TestBigInteger
{
   public static void main(String args[])
   {
       BigInteger n1=new BigInteger("987654321987654321987654321"),
                  n2=new BigInteger("123456789123456789123456789"),
                  result=null;
       System.out.println("n1的二进制表示:"+n1.toString(2));
       System.out.println("n2的八进制表示:"+n2.toString(8));

       result=n1.add(n2);
       System.out.println("和:"+result);

       result=n1.subtract(n2);
       System.out.println("差:"+result.toString());

       result=n1.multiply(n2);
       System.out.println("积:"+result.toString());

       result=n1.divide(n2);
       System.out.println("商:"+result.toString());
      
   }
}
