class A
{
     int x,y;
     A()
     {
        x=100;
        y=200;
     }
     A(int x,int y)
     {
        this.x=x;
        this.y=y;
     } 
}
class B extends A
{
     int z;
     B(int x,int y)
     {
        super(x,y);  //这条语句不写会怎么样？
        z=300; 
     }
     B()
     {
        z=800; 
     }
     public void f()
     {
        System.out.printf("x=%d,y=%d,z=%d\n",x,y,z);
     }
}
public class Example5_6
{    
     public static void main(String args[])
     {
        B b1=new B(10,20);
        b1.f(); 
        B b2=new B(); 
        b2.f();          
     }  
}