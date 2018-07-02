public class Test_Thread_7
{
    public static void main(String args[])
    {
        String s1="张三",s2="孙大明",s3="赵乐乐";
        Cinema cinema=new Cinema(s1,s2,s3);
        Thread zhang,sun,zhao;
        zhang=new Thread(cinema);
        sun=new Thread(cinema);
        zhao=new Thread(cinema);
        zhang.setName(s1);
        sun.setName(s2);
        zhao.setName(s3);
        zhang.start();
        sun.start();
        zhao.start();
    }
}
class Cinema implements Runnable  //实现Runnable接口的类（电影院）
{  
   TicketSeller seller;           //电影院的售票员
   String name1,name2,name3;      //买票人的名字
   Cinema(String s1,String s2,String s3)
   {
      seller=new TicketSeller();
      name1=s1;
      name2=s2;
      name3=s3;   
   } 
   public void run()
   {
       if(Thread.currentThread().getName().equals(name1))
       {
          seller.sellTicket(20);
       }
       else if(Thread.currentThread().getName().equals(name2))
       {
          seller.sellTicket(10);
       }
       else if(Thread.currentThread().getName().equals(name3))
       {
          seller.sellTicket(5);
       }
   }
}
class TicketSeller 
{
   int fiveNumber=1,tenNumber=0,twentyNumber=0; 
   public synchronized void sellTicket(int receiveMoney)
   { 
       String s=Thread.currentThread().getName();
       if(receiveMoney==5)
       {
          fiveNumber=fiveNumber+1; 
          System.out.println(s+"给售票员5元钱，售票员卖给"+s+"一张票，不必找赎"); 
       }
       else if(receiveMoney==10)           
       {  
          try {  
                       Thread.sleep(500);         
                    }             
                catch(InterruptedException e)
                    {
                    }
          fiveNumber=fiveNumber-1;
          tenNumber=tenNumber+1;
          System.out.println(s+"给售票员10元钱，售票员卖给"+s+"一张票，找赎5元"); 
        }
        else if(receiveMoney==20)           
        {  
          while(fiveNumber<1||tenNumber<1)
         { 
                try{ 
                       System.out.println(s+"给售票员20元钱");
                       System.out.println("售票员请"+s+"靠边等一会");
                       wait();  //如果线程占有CUP期间执行了wait,就进入中断状态
                       System.out.println(s+"结束等待，继续买票");
                    }
               catch(InterruptedException e)
                    {
                    }
          }
           fiveNumber=fiveNumber-1;
           tenNumber=tenNumber-1;
           twentyNumber=twentyNumber+1;
           System.out.println(s+"给售票员20元钱，售票员卖给"+s+"一张票，找赎15元"); 
        }
        notify();
   }
}


