//上转型

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
        System.out.printf("体积为：%.2f",volume);
   }

   public static void main (String args[ ])
   { 
        int i; //i表示要输入的数字，i=1表示球体，i=2表示立方体，i=3表示圆柱体
        Scanner reader=new Scanner(System.in);
	do
	{
	    System.out.println("请输入1, 2 or 3：1表示球体，2表示立方体，3表示圆柱体");
            i=reader.nextInt();
	}while(i<1||i>3);  //do...while结构有纠错功能，保证输入的数字为1，2或者3
	
        switch(i)
	{
	     case 1:System.out.println("请输入球半径:"); 
		    double r=reader.nextDouble();
                    Ball ball=new Ball(r);
                    get(ball);
		    break;
	     case 2:System.out.println("请输入立方体的边长:"); 
		    double side=reader.nextDouble();
                    Cube cube=new Cube(side);
                    get(cube);
		    break;
	     case 3:System.out.println("请输入圆柱体的底面半径和高:"); 
		    double radius=reader.nextDouble();
                    double h=reader.nextDouble();
                    Cylinder cylinder=new Cylinder(radius,h);
                    get(cylinder);
		    break;
	}
   }
}
