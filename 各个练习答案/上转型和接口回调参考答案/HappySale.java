//�ӿڻص�

import java.util.Scanner;
interface UnitPrice
{
   public double unitprice( );
}

class Television implements UnitPrice
{
    public double unitprice()
    {
         return 5000;
    }
}

class Computer implements UnitPrice
{
    public double unitprice()
    {
         return 6000;
    }
}

class Mobile implements UnitPrice 
{
    public double unitprice()
    {
         return 2000;
    }

}

public class HappySale 
{
   static double get(UnitPrice u)
   {
        return u.unitprice();
   }
   public static void main(String args[ ]) 
   {
         Scanner reader=new Scanner(System.in);

         System.out.println("��ֱ����뱾�µ��ӡ���������ֻ������۸�����");
         int n1=reader.nextInt();
         int n2=reader.nextInt();
         int n3=reader.nextInt();

         double totalSales;
 
         totalSales=n1*get(new Television())+n2*get(new Computer())+n3*get(new Mobile());
         
         System.out.println("�̵걾�����۶�:"+totalSales);
   }
}
