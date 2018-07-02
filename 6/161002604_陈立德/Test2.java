package lab6;

public class Test2 implements Runnable {

	Thread driver,hamal,adminer;
	
	Test2(){
		driver=new Thread(this);
		driver.setName("司机");
		hamal=new Thread(this);
		hamal.setName("搬运工");
		adminer=new Thread(this);
		adminer.setName("仓库管理员");
	}
	
	public void run() {
		if(Thread.currentThread()==adminer) {
			for(int i=1;i<6;i++)
				System.out.println("仓库管理员打开第"+i+"道门");
		}
		
		
		if(Thread.currentThread()==hamal) {
			System.out.println("装运工等仓库管理员开门");
			try {
				adminer.join();
			} catch (InterruptedException e) {
				
			}
			
			for(int i=1;i<11;i++)
				System.out.println("装运工搬运第"+i+"箱货物到货车");
			
		}
		
		if(Thread.currentThread()==driver) {
			System.out.println("运货司机等装运工装货");
			try {
				hamal.join();
			} catch (InterruptedException e) {}
			
			System.out.println("运货司机打开车锁");
			System.out.println("运货司机把握方向盘");
			System.out.println("运货司机挂挡");
			System.out.println("运货司机踩油门");
			System.out.println("运货司机开车");
			
		}
		
	}

	public static void main(String[] args) {
		Test2 test=new Test2();
		test.driver.start();
		test.hamal.start();
		test.adminer.start();

	}

}
