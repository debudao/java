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
        System.out.println("����Tom ,��������"+leg+"����");
   }
   public static void main(String args[])
   {
        Tom tom=new Tom(4);
   }
}
