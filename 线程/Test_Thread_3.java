class Test_Thread_3
{
    public static void main(String args[ ])
    {
         Left left=new Left();
         Right right=new Right();
         left.start();
         right.start();
         while(true)
         {
             if(left.n<=8 && right.n<=8){
                   System.out.println("�������߳��е����"+Thread.currentThread().getName());
            	 try{
            		 Thread.sleep((int)(Math.random()*100 + 500));
            	 } catch(Exception e){
            	 }
             }
             else
             {
                 //System.out.println("" + left.n + " " + right.n);
                 System.exit(0);
             }
                 
    	}
    }
}
class Left extends Thread
{
    int n=0;
    public void run()
    {   
        while(true)
         {
            n++;
            System.out.printf("\n%s\n","��������д��");
            try
            {
                 sleep((int)(Math.random()*100)+500);
            }
          catch(InterruptedException e)
            {
            }
         }
    }
}
class Right extends Thread
{
    int n=0;
    public void run()
    {   
        while(true)
         {
            n++;
            System.out.printf("\n%40s\n","��������д��");
            try
            {
                 sleep((int)(Math.random()*100)+500);
            }
          catch(InterruptedException e)
            {
            }
         }
    }
}

