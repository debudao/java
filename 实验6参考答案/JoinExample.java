class JoinThread implements Runnable 
{
    Thread �˻�˾��,װ�˹�,�ֿ����Ա;
    String step[]={"�򿪳���","���շ�����","�ҵ�","������","����"};
    JoinThread() 
   {
       �˻�˾��=new Thread(this);
       װ�˹�=new Thread(this);
       �ֿ����Ա=new Thread(this);

       �˻�˾��.setName("�˻�˾��");
       װ�˹�.setName("װ�˹�");
       �ֿ����Ա.setName("�ֿ����Ա");
    }
    public void run()
   {
       if(Thread.currentThread()==�˻�˾��) 
      {
             System.out.println(�˻�˾��.getName()+"��"+װ�˹�.getName()+"װ��");
             try{  
                   װ�˹�.join();
             } catch(InterruptedException e) { }
             for(int i=0;i<step.length;i++) 
            {
                   System.out.println(�˻�˾��.getName()+step[i]);
                   try{  �˻�˾��.sleep(100);
                   }catch(InterruptedException ee){ }
             }
       }
       else if(Thread.currentThread()==װ�˹�) 
      {
             try{   װ�˹�.sleep(500);
                   }catch(InterruptedException ee){ }
             System.out.println(װ�˹�.getName()+"��"+�ֿ����Ա.getName()+"����");
             try{   �ֿ����Ա.join();
             }catch(InterruptedException e){ }
             for(int i=1;i<=10;i++) 
            {
                   System.out.println(װ�˹�.getName()+"���˵�"+i+"����ﵽ����");
                   try{   װ�˹�.sleep(500);
                   }catch(InterruptedException ee){ }
             }
       }
       else if(Thread.currentThread()==�ֿ����Ա) 
      { 
            try{  �ֿ����Ա.sleep(1000);    
                 }catch(InterruptedException e){ }
            for(int i=1;i<=5;i++) 
           {
                 System.out.println(�ֿ����Ա.getName()+"�򿪵�"+i+"����") ;
                 /*try{  �ֿ����Ա.sleep(3000);    
                 }catch(InterruptedException e){ }*/
            } 
       }
    }
}
public class JoinExample 
{
    public static void main(String args[]) 
   {
        JoinThread  a=new JoinThread();
        a.�˻�˾��.start();
        a.װ�˹�.start();
        a.�ֿ����Ա.start();
    }
}
