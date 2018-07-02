package tom.jiafei;
class Tom
{
    void speak()
    { 
       System.out.println("Tom类在tom.jiafei包中");  
    }
}
public class Example4_10 
{  
    public static void main(String args[])
    {
       Tom cat=new Tom();
       cat.speak();
       System.out.println("Example4_10类在tom.jiafei包中");  
    }
}
