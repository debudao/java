import java.util.*;
class RWthread
{
    public static void main(String args[])
    {
        String readName="���߳�",writeName="д�߳�";
        ReadWrite rw=new ReadWrite(readName,writeName);
        Thread read,write;
        read=new Thread(rw);
        write=new Thread(rw);
        read.setName(readName);
        write.setName(writeName);
        read.start();
        write.start();
   }
}
class ReadWrite implements Runnable
{  
   String ID=null;
   String name=null;   
   String readName,writeName;
   boolean flag=false;
   public ReadWrite(String s1,String s2)
   { 
      readName=s1;
      writeName=s2;  
   }
   public void run()
   { 
       
       readOrWrite(); 
             
   }
  public synchronized void readOrWrite() //ͬ������
   { 
	  Scanner reader=new Scanner(System.in);
       if(Thread.currentThread().getName().equals(readName)) 
       {  
          while(true)
          {
        	  if(flag)
        	  {
        		  try{
        			  wait();
        		  }catch(InterruptedException e){}
        	  }
        	  System.out.println("������ѧ�ţ�");
        	  ID=reader.nextLine();
        	  if(ID.equals("finish"))
        	  {
        		  System.out.println("\n���̺߳�д�̹߳���������");
        		  flag=true;
        		  notify();
        		  return;
        	  }
        	  System.out.println("������������");
        	  name=reader.nextLine();
        	  flag=true;
        	  notify();
          }
       }
      else if(Thread.currentThread().getName().equals(writeName)) 
      {    
    	  while(true)
          {
    		  if(!flag)
        	  {
        		  try{
        			  wait();
        		  }catch(InterruptedException e){}
        	  }
    		  if(ID.equals("finish"))
        		  return;
        	  System.out.println("\n���ѧ�ţ�"+ID+"�����������"+name);
        	  System.out.println();
        	  flag=false;
        	  notify();       		  
          }
      }
   }
}

