package lab6;

public class Test1 implements Runnable {

	Thread Zhang,Wang,Boss;
	int a,b;//��¼��λ���˰������
	
	Test1(){
		Zhang=new Thread(this);
		Zhang.setName("�Ź�");
		Wang=new Thread(this);
		Wang.setName("����");
		Boss =new Thread(this);
		Boss.setName("�ϰ�");
		a=b=0;
	}
	
	public void run() {
		if(Thread.currentThread()==Zhang) {
			for(int i=0;i<3;i++) {
				
				a++;
				try {
					System.out.println(Zhang.getName()+"�Ѱ�����"+(i+1)+"��ƻ��");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					if(a<3)
						System.out.println("�ϰ���"+Zhang.getName()+"��������");
				}
			}
		}
		
		if(Thread.currentThread()==Wang) {
			for(int i=0;i<3;i++) {
				
				b++;
				try {
					System.out.println(Wang.getName()+"�Ѱ�����"+(i+1)+"���㽶");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					if(b<3)
						System.out.println("�ϰ���"+Wang.getName()+"��������");
				}
			}
			
		}
		
		if(Thread.currentThread()==Boss) {
			while(a<3) 
				Zhang.interrupt();
			
			while(b<3) 
				Wang.interrupt();			
			
			System.out.println("�ϰ�˵�������°���");
		}
		
		

	}

	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.Zhang.start();
		test1.Wang.start();
		test1.Boss.start();

	}

}
