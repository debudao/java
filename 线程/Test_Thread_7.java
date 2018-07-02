public class Test_Thread_7
{
    public static void main(String args[])
    {
        String s1="����",s2="�����",s3="������";
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
class Cinema implements Runnable  //ʵ��Runnable�ӿڵ��ࣨ��ӰԺ��
{  
   TicketSeller seller;           //��ӰԺ����ƱԱ
   String name1,name2,name3;      //��Ʊ�˵�����
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
          System.out.println(s+"����ƱԱ5ԪǮ����ƱԱ����"+s+"һ��Ʊ����������"); 
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
          System.out.println(s+"����ƱԱ10ԪǮ����ƱԱ����"+s+"һ��Ʊ������5Ԫ"); 
        }
        else if(receiveMoney==20)           
        {  
          while(fiveNumber<1||tenNumber<1)
         { 
                try{ 
                       System.out.println(s+"����ƱԱ20ԪǮ");
                       System.out.println("��ƱԱ��"+s+"���ߵ�һ��");
                       wait();  //����߳�ռ��CUP�ڼ�ִ����wait,�ͽ����ж�״̬
                       System.out.println(s+"�����ȴ���������Ʊ");
                    }
               catch(InterruptedException e)
                    {
                    }
          }
           fiveNumber=fiveNumber-1;
           tenNumber=tenNumber-1;
           twentyNumber=twentyNumber+1;
           System.out.println(s+"����ƱԱ20ԪǮ����ƱԱ����"+s+"һ��Ʊ������15Ԫ"); 
        }
        notify();
   }
}


