package lab6;

public class Test2 implements Runnable {

	Thread driver,hamal,adminer;
	
	Test2(){
		driver=new Thread(this);
		driver.setName("˾��");
		hamal=new Thread(this);
		hamal.setName("���˹�");
		adminer=new Thread(this);
		adminer.setName("�ֿ����Ա");
	}
	
	public void run() {
		if(Thread.currentThread()==adminer) {
			for(int i=1;i<6;i++)
				System.out.println("�ֿ����Ա�򿪵�"+i+"����");
		}
		
		
		if(Thread.currentThread()==hamal) {
			System.out.println("װ�˹��Ȳֿ����Ա����");
			try {
				adminer.join();
			} catch (InterruptedException e) {
				
			}
			
			for(int i=1;i<11;i++)
				System.out.println("װ�˹����˵�"+i+"����ﵽ����");
			
		}
		
		if(Thread.currentThread()==driver) {
			System.out.println("�˻�˾����װ�˹�װ��");
			try {
				hamal.join();
			} catch (InterruptedException e) {}
			
			System.out.println("�˻�˾���򿪳���");
			System.out.println("�˻�˾�����շ�����");
			System.out.println("�˻�˾���ҵ�");
			System.out.println("�˻�˾��������");
			System.out.println("�˻�˾������");
			
		}
		
	}

	public static void main(String[] args) {
		Test2 test=new Test2();
		test.driver.start();
		test.hamal.start();
		test.adminer.start();

	}

}
