package lab2;

import java.util.Scanner;

interface UnitPrice
{
   public double unitprice( ); //������Ʒ�ĵ���
}

class TV implements UnitPrice{
	double price;
	
	TV(double p){
		price=p;
	}

	public double unitprice() {
		return price;
	}
	
}

class Computer implements UnitPrice{
	double price;
	
	public Computer(double p) {
		price=p;
	}

	public double unitprice() {
		return price;
	}
	
}

class Phone implements UnitPrice{
	double price;
	
	public Phone(double p) {
		price=p;
	}

	public double unitprice() {
		return price;
	}
}

public class UnitPriceTest {

	public static void main(String[] args) {
		System.out.println("��ֱ����뱾�µ��ӡ����Ժ��ֻ������۸�����");
		Scanner reader=new Scanner(System.in);
		int a=reader.nextInt(),b=reader.nextInt(),c=reader.nextInt();
		TV t=new TV(10);
		Computer co=new Computer(20);
		Phone p=new Phone(30);
		double sum=a*UnitPriceTest.get(t)+b*UnitPriceTest.get(co)+c*UnitPriceTest.get(p);
		System.out.printf("�����۶%.2f\n",sum);
	}
	
	static double get(UnitPrice u) {
		return u.unitprice();
	}

}
