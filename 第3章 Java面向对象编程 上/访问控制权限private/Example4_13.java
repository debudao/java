public class Example4_13 
{   
    private int money;
    Example4_13() 
    {  
        money=2000;
    } 
    private int getMoney() 
    { 
       return money;
    }
    public static void main(String args[]) 
    { 
       Example4_13  exa=new Example4_13();
       exa.money=3000;
       int m=exa.getMoney();
       System.out.println("money="+m);
    }
}
