import java.io.*;
class Goods implements Serializable 
{  
   String name=null;
   double unitPrice;
   Goods(String name,double unitPrice)
     {  
         this.name=name;
         this.unitPrice=unitPrice;
     }
   public void setUnitPrice(double unitPrice)
   {  
         this.unitPrice=unitPrice;
   }
   public void setName(String name)
   {  
         this.name=name;
   }
   public String getName()
   {
         return name;
   }
   public double getUnitPrice()
   {
         return unitPrice;
   }
}
public class TestObjectIOStream
{ 
   public static void main(String args[ ])
   {  
      Goods TV1=new  Goods("HaierTV",3468);
      try
      {  
             FileOutputStream fileOut=new FileOutputStream("a.txt");
             ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);

             objectOut.writeObject(TV1);  

             FileInputStream fileIn=new FileInputStream("a.txt");
             ObjectInputStream objectIn=new ObjectInputStream(fileIn);

             Goods TV2=(Goods)objectIn.readObject();

             TV2.setUnitPrice(8888);
             TV2.setName("GreatWall");

             System.out.printf("\nTv1:%s,%f",TV1.getName(),TV1.getUnitPrice());
             System.out.printf("\nTv2:%s,%f",TV2.getName(),TV2.getUnitPrice());
      }
      catch(Exception event)
      {  
         System.out.println(event);
      }
   }
}
