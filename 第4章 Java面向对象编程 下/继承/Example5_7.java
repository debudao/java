class A 
{  
    int m=0,n=0;
    long  f() 
    {  
       return m+n;
    }
}
class B extends A 
{  
    int m=1,n=1;  
    long f() 
    {  
       long result=0;
       super.m=10;
       super.n=20;
       result=super.f()+(m+n);
       return result; 
    }
    long g() 
    { 
       long result=0;
       result=super.f();
       return result/2; 
    }
}
public class Example5_7
{  
    public static void main(String args[ ]) 
    {  
       B b=new B();
       b.m=3;
       b.n=7;
       long resultOne=b.g();
       long resultTwo=b.f();
       long resultThree=b.g();
       System.out.println("resultOne="+resultOne);
       System.out.println("resultTwo="+resultTwo);
       System.out.println("resultThree="+resultThree);
    }
}