//对象上转型练习

class  A
{  
    double n;
    int m;
    void f()
    {
       System.out.printf("子类将继承这个方法,n=%f,m=%d\n",n,m); 
    }
    void g() 
    {  
       System.out.printf("你好，n=%f,m=%d\n",n,m);  
    }  
}

class B extends A 
{ 
    int n=12;
    void g()
    {  
        System.out.printf("子类重写的方法g(),n=%d,m=%d\n",n,m); 
    }
    void cry()
    { 
       System.out.printf("子类新增的方法,n=%d,m=%d\n",n,m); 
    }
}
class Example5_8
{  
    public static void main(String args[ ]) 
    {  
      A a;
      a=new B();            
      
      a.n=0.618;            
      a.m=200;             
      
      a.f();                
      a.g();
                 
                          
      B b=(B)a;          
      
      b.n=555;           
      b.cry();
    }
}