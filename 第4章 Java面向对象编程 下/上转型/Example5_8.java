//������ת����ϰ

class  A
{  
    double n;
    int m;
    void f()
    {
       System.out.printf("���ཫ�̳��������,n=%f,m=%d\n",n,m); 
    }
    void g() 
    {  
       System.out.printf("��ã�n=%f,m=%d\n",n,m);  
    }  
}

class B extends A 
{ 
    int n=12;
    void g()
    {  
        System.out.printf("������д�ķ���g(),n=%d,m=%d\n",n,m); 
    }
    void cry()
    { 
       System.out.printf("���������ķ���,n=%d,m=%d\n",n,m); 
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