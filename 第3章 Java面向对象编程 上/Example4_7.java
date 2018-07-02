class Circle 
{  
    double radius;
    Circle(double r)
    { 
       radius=r;
     }
    double computerArea() 
    {  
       return 3.14*radius*radius;
    }
    void setRadius(double newRadius)
    {  
       radius=newRadius;
    }
    double getRadius() 
    { 
        return radius;
    }
}
class Cone 
{ 
    Circle bottom;
    double height;
    Cone(Circle c,double h) 
    {  
       bottom=c;
       height=h;
    }
    double computerVolume() 
   {   
       double volume;
       volume=bottom.computerArea()*height/3.0;
       return volume;
    }
    void setBottomRadius(double r) 
    {  
        bottom.setRadius(r);
    }
    double getBottomRadius() 
    {  
        return bottom.getRadius();
    }
}
class Example4_7 
{  
    public static void main(String args[])
    { 
       Circle circle=new Circle(8);
       Cone circular=new Cone(circle,18);
       System.out.println("circular的bottom半径:"+circular.getBottomRadius()); 
       System.out.println("circular的体积:"+circular.computerVolume());
       circular.setBottomRadius(88);
       System.out.println("circular的bottom半径:"+circular.getBottomRadius());
       System.out.println("circular的体积:"+circular.computerVolume());  
    }
}
