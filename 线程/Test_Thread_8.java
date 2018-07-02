class Test_Thread_8
{
    public static void main(String args[ ])
    {
        JoinThread  a=new JoinThread();
        a.threadA.start();
        a.threadB.start();
   }
}
class JoinThread implements Runnable
{
    Thread threadA,threadB;
    String content[ ]={"今天晚上,","大家不要","回去的太早,","还有工作","需要大家做!"};
    JoinThread()
    {
       threadA=new Thread(this);
       threadB=new Thread(this);
       threadB.setName("经理");
    }
    public void run()
    {
       if(Thread.currentThread()==threadA)
       {
             System.out.println("我等"+threadB.getName()+"说完再说话");
             try{
                  threadB.join();      //线程threadA开始等待threadB结束.
                } 
             catch(InterruptedException e)
                {
                }
             System.out.println("\n我开始说话:\"我明白你的意思了,谢谢\"");
       }
       else if(Thread.currentThread()==threadB)
       { 
            System.out.println(threadB.getName()+"说:");
            for(int i=0;i<content.length;i++)
             {
                 System.out.print(content[i]) ;
                  try 
                     {
                       threadB.sleep(1000);    
                     }
                 catch(InterruptedException e)
                     {
                     }
             } 
        }
    }    
}

