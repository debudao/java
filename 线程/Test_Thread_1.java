public class Test_Thread_1
{
   public static void main(String args[ ])
   {
       WriteWordThread  zhang,wang;
       zhang=new WriteWordThread("��С��");        //�½��̡߳�
       wang=new WriteWordThread("JamsKeven");     //�½��̡߳�
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
   WriteWordThread(String s)
   {
       setName(s);             //����Thread��ķ���setNameΪ�߳�������֡�
   }
   public void run()
   {
      for(int i=1;i<=8;i++)
      {
         System.out.println("����һ���̣߳��ҵ�������"+getName());
      }
   }
}
