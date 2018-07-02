public class Tom
{
   int leg;
   Tom(int n)
   {
        this.cry();
        leg=n;
        this.cry(); 
   }
   void cry()
   {
        System.out.println("我是Tom ,我现在有"+leg+"条腿");
   }
   public static void main(String args[])
   {
        Tom tom=new Tom(4);
   }
}
