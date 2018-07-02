class Shop implements Runnable 
{
    Thread zhangWorker,wangWorker,boss;
    Shop() 
   {
        boss=new Thread(this);
        boss.setName("老板");

        zhangWorker=new Thread(this);
        zhangWorker.setName("张工");

        wangWorker=new Thread(this);
        wangWorker.setName("王工");
       
    } 
    public void run() 
   { 
       int i=0;  
       if(Thread.currentThread()==zhangWorker) 
      {
            while(true) 
            {
               try{  
                     i++;
                     System.out.println(zhangWorker.getName()+"已搬运了"+i+"箱苹果\n");
                     if(i==3)
                        return;
                     Thread.sleep(10000);
                  }catch(InterruptedException e){
                        System.out.println(boss.getName()+"让"+zhangWorker.getName()+"继续工作");
                  }
             }
       }
       else if(Thread.currentThread()==wangWorker) 
      {
             while(true)
            {
               try{ 
                     i++;
                     System.out.println(wangWorker.getName()+"已搬运了"+i+"箱香蕉\n");
                     if(i==3)
                        return;
                     Thread.sleep(10000);
                  }catch(InterruptedException e){
                        System.out.println(boss.getName()+"让"+wangWorker.getName()+"继续工作");
                  }
             }
      }
      else if(Thread.currentThread()==boss) 
     {
             while(true) 
            {
                   zhangWorker.interrupt(); 
                   wangWorker.interrupt();
                   if(!(wangWorker.isAlive()||zhangWorker.isAlive())) 
                   {
                        System.out.printf(boss.getName()+"说：可以下班了"); 
                        return;
                   }
             }
      }
    }
}
public class ShopExample
{
    public static void main(String args[]) 
   {
        Shop shop=new Shop();
        shop.zhangWorker.start();
        shop.wangWorker.start();
        shop.boss.start();
    }
}
