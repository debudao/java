package lab6;

public class Test1 implements Runnable {

	Thread Zhang,Wang,Boss;
	int a,b;//记录两位工人搬的箱数
	
	Test1(){
		Zhang=new Thread(this);
		Zhang.setName("张工");
		Wang=new Thread(this);
		Wang.setName("王工");
		Boss =new Thread(this);
		Boss.setName("老板");
		a=b=0;
	}
	
	public void run() {
		if(Thread.currentThread()==Zhang) {
			for(int i=0;i<3;i++) {
				
				a++;
				try {
					System.out.println(Zhang.getName()+"已搬运了"+(i+1)+"箱苹果");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					if(a<3)
						System.out.println("老板让"+Zhang.getName()+"继续工作");
				}
			}
		}
		
		if(Thread.currentThread()==Wang) {
			for(int i=0;i<3;i++) {
				
				b++;
				try {
					System.out.println(Wang.getName()+"已搬运了"+(i+1)+"箱香蕉");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					if(b<3)
						System.out.println("老板让"+Wang.getName()+"继续工作");
				}
			}
			
		}
		
		if(Thread.currentThread()==Boss) {
			while(a<3) 
				Zhang.interrupt();
			
			while(b<3) 
				Wang.interrupt();			
			
			System.out.println("老板说：可以下班了");
		}
		
		

	}

	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.Zhang.start();
		test1.Wang.start();
		test1.Boss.start();

	}

}
