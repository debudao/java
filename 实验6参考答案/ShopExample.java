class Shop implements Runnable 
{
    Thread zhangWorker,wangWorker,boss;
    Shop() 
   {
        boss=new Thread(this);
        boss.setName("�ϰ�");

        zhangWorker=new Thread(this);
        zhangWorker.setName("�Ź�");

        wangWorker=new Thread(this);
        wangWorker.setName("����");
       
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
                     System.out.println(zhangWorker.getName()+"�Ѱ�����"+i+"��ƻ��\n");
                     if(i==3)
                        return;
                     Thread.sleep(10000);
                  }catch(InterruptedException e){
                        System.out.println(boss.getName()+"��"+zhangWorker.getName()+"��������");
                  }
             }
       }
       else if(Thread.currentThread()==wangWorker) 
      {
             while(true)
            {
               try{ 
                     i++;
                     System.out.println(wangWorker.getName()+"�Ѱ�����"+i+"���㽶\n");
                     if(i==3)
                        return;
                     Thread.sleep(10000);
                  }catch(InterruptedException e){
                        System.out.println(boss.getName()+"��"+wangWorker.getName()+"��������");
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
                        System.out.printf(boss.getName()+"˵�������°���"); 
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
