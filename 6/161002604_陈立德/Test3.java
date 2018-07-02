package lab6;

import java.util.Scanner;

public class Test3 implements Runnable {

	Thread r,w;
	String num,name;
	Scanner in=new Scanner(System.in);
	int flag=0;//flag=0的时候读，flag=1的时候写
	
	Test3(){
		r=new Thread(this);
		w=new Thread(this);
		w.setDaemon(true);
		num=new String();
		name=new String();
	}
	
	public void run() {
		
		while(true) {
			if(Thread.currentThread()==r)
				in();
			else if(Thread.currentThread()==w)
				out();
			
			if(num.equals("finish"))
				break;
			
		}
		System.out.println("读线程和写线程工作结束！");

	}
	

	
	public synchronized void in() {
		if(flag==1) {
			try {
				this.wait();
			} catch (InterruptedException e) {}
		}
		num=new String();
		name=new String();
		
		System.out.println("请输入学号：");
		num=in.nextLine();
		if(num.equals("finish"))
			return;
		
		System.out.println("请输入姓名：");
		name=in.nextLine();
		System.out.println("");
		flag=1;
		this.notify();
			
	}
	
	public synchronized void out() {
		if(flag==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {}
		}
		
		System.out.println("输出学号："+num+", 输出姓名："+name+"\n");
		flag=0;
		this.notify();
	}

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.r.start();
		t.w.start();

	}

}
