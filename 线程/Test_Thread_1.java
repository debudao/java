public class Test_Thread_1
{
   public static void main(String args[ ])
   {
       WriteWordThread  zhang,wang;
       zhang=new WriteWordThread("张小红");        //新建线程。
       wang=new WriteWordThread("JamsKeven");     //新建线程。
       zhang.start();                             //启动线程。
       wang.start();                              //启动线程
       for(int i=1;i<=8;i++)
       {
         System.out.println("我是主线程中的语句"+Thread.currentThread().getName());
       }
   }
}
class  WriteWordThread extends Thread
{
   WriteWordThread(String s)
   {
       setName(s);             //调用Thread类的方法setName为线程起个名字。
   }
   public void run()
   {
      for(int i=1;i<=8;i++)
      {
         System.out.println("我是一个线程，我的名字是"+getName());
      }
   }
}
