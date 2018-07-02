package lab2;

import java.util.Scanner;

abstract class ObjectVolume
{
    abstract double getVolume(); //������������
}

class Cube extends ObjectVolume{
	double a;
	
	Cube(double a){
		this.a=a;
	}
	
	double getVolume() {
		return a*a*a;
	}
	
}

class Sphere extends ObjectVolume{
	double r;
	
	Sphere(double r){
		this.r=r;
	}
	
	double getVolume() {
		return 4.0/3*r*r*r*Math.PI;
	}
	
}

class Cylinder extends ObjectVolume{
	double r,h;
	
	Cylinder(double r,double h){
		this.r=r;
		this.h=h;
	}

	double getVolume() {
		return Math.PI*r*r*h;
	}
	
	
}

public class VolumeTest {

	public static void main(String[] args) {
		System.out.println("������1��2 or 3��1��ʾ���壬2��ʾ�����壬3��ʾԲ����");
		 Scanner reader=new Scanner(System.in);
		 int i=reader.nextInt();
		 if(i==1) {
			 System.out.println("��������İ뾶��");
			 double a=reader.nextDouble();
			 Sphere s=new Sphere(a);
			 VolumeTest.get(s);
		 }else if(i==2) {
			 System.out.println("������������ı߳���");
			 double a=reader.nextDouble();
			 Cube s=new Cube(a);
			 VolumeTest.get(s);
		 }else if(i==3) {
			 System.out.println("������Բ���İ뾶�͸ߣ�");
			 double a=reader.nextDouble();
			 double b=reader.nextDouble();
			 Cylinder s=new Cylinder(a,b);
			 VolumeTest.get(s);
		 }

	}
	
	static void get(ObjectVolume obj) {
		System.out.printf("���Ϊ��%.2f\n",obj.getVolume());
	}

}
