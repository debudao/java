public class Test_Thread_2
{
   public static void main(String args[ ])
   {
       WriteWordThread  zhang,wang;
       zhang=new WriteWordThread("��С��",200);        //�½��̡߳�
       wang=new WriteWordThread("JamsKeven",100);     //�½��̡߳�
       zhang.start();                             //�����̡߳�
       wang.start();                              //�����߳�
       for(int i=1;i<=8;i++)
       {
         System.out.println("�������߳��е����"+Thread.currentThread().getName());
       }  
       
   }
}
class  WriteWordThread extends Thread
{
   int n=0;
   WriteWordThread(String s,int n)
   {
       setName(s);             //����Thread��ķ���setNameΪ�߳��������
       this.n=n;
   }
   public void run()
   {
      for(int i=1;i<=8;i++)
      {
         System.out.println("����һ���̣߳��ҵ�������"+getName());
         try{  sleep(n); }
         catch(InterruptedException e){}
      }
   }
}
