class Test_Thread_5
{
    public static void main(String args[])
    {
        ClassRoom room=new ClassRoom();
        room.zhangXiao.start();
        room.zhengMing.start();
        room.teacher.start();
    }
}
class ClassRoom implements Runnable
{
    Thread  zhangXiao,zhengMing,teacher;
    ClassRoom()
    {
       teacher=new Thread(this);
       teacher.setName("刘老师"); 
       zhangXiao=new Thread(this); 
       zhangXiao.setName("张小");
       zhengMing=new Thread(this); 
       zhengMing.setName("郑明");
    } 
    public void run()      
    {
           Thread thread=Thread.currentThread();   
           if(thread==zhangXiao||thread==zhengMing)
           {
             try{
                   System.out.println(thread.getName()+"休息10秒后再说问候语");
                   Thread.sleep(10000);
                }catch(InterruptedException e){
                   System.out.println(thread.getName()+"被吵醒了");
               }
             System.out.println(thread.getName()+"说：早上好！"); 
           }
           else if(thread==teacher)
           {
              for(int i=1;i<=3;i++)
              {
                   System.out.println(thread.getName()+"说：上课!");
                   try{
                         Thread.sleep(500);
                      }catch(InterruptedException e){
                      } 
               }
              zhengMing.interrupt();           //吵醒zhengMing
              zhangXiao.interrupt();           //吵醒zhangXiao
           }
    }
}

