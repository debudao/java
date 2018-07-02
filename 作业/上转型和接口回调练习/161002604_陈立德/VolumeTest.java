package lab2;

import java.util.Scanner;

abstract class ObjectVolume
{
    abstract double getVolume(); //返回物体的体积
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
		System.out.println("请输入1，2 or 3：1表示球体，2表示立方体，3表示圆柱体");
		 Scanner reader=new Scanner(System.in);
		 int i=reader.nextInt();
		 if(i==1) {
			 System.out.println("请输入球的半径：");
			 double a=reader.nextDouble();
			 Sphere s=new Sphere(a);
			 VolumeTest.get(s);
		 }else if(i==2) {
			 System.out.println("请输入立方体的边长：");
			 double a=reader.nextDouble();
			 Cube s=new Cube(a);
			 VolumeTest.get(s);
		 }else if(i==3) {
			 System.out.println("请输入圆柱的半径和高：");
			 double a=reader.nextDouble();
			 double b=reader.nextDouble();
			 Cylinder s=new Cylinder(a,b);
			 VolumeTest.get(s);
		 }

	}
	
	static void get(ObjectVolume obj) {
		System.out.printf("体积为：%.2f\n",obj.getVolume());
	}

}
