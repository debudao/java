//��ת��

import java.util.Scanner;

abstract class ObjectVolume
{
    abstract double getVolume();
}


class Ball extends ObjectVolume
{
    double r;
    Ball(double r)
    {
        this.r=r;
    }
    double getVolume()
    {
        return 1.33*3.1415926*r*r*r;
    }
}

class Cube extends ObjectVolume
{
    double side;
    Cube(double side)
    {
        this.side=side;
    }
    double getVolume()
    {
        return side*side*side;
    }
}

class Cylinder extends ObjectVolume
{
    double r,h;
    Cylinder(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    double getVolume()
    {
        return 3.1415926*r*r*h;
    }
}

public class GetObjectVolume
{  
   static void get(ObjectVolume obj)
   {
        double volume=obj.getVolume();
        System.out.printf("���Ϊ��%.2f",volume);
   }

   public static void main (String args[ ])
   { 
        int i; //i��ʾҪ��������֣�i=1��ʾ���壬i=2��ʾ�����壬i=3��ʾԲ����
        Scanner reader=new Scanner(System.in);
	do
	{
	    System.out.println("������1, 2 or 3��1��ʾ���壬2��ʾ�����壬3��ʾԲ����");
            i=reader.nextInt();
	}while(i<1||i>3);  //do...while�ṹ�о����ܣ���֤���������Ϊ1��2����3
	
        switch(i)
	{
	     case 1:System.out.println("��������뾶:"); 
		    double r=reader.nextDouble();
                    Ball ball=new Ball(r);
                    get(ball);
		    break;
	     case 2:System.out.println("������������ı߳�:"); 
		    double side=reader.nextDouble();
                    Cube cube=new Cube(side);
                    get(cube);
		    break;
	     case 3:System.out.println("������Բ����ĵ���뾶�͸�:"); 
		    double radius=reader.nextDouble();
                    double h=reader.nextDouble();
                    Cylinder cylinder=new Cylinder(radius,h);
                    get(cylinder);
		    break;
	}
   }
}
