class Single  //没有重写Object类的equals()方法
{ 
    int x;
    Single(int x)
    {
	this.x = x;
    }
}
class Pair
{
    int x;
    int y;
    Pair(int x, int y)
    {
	this.x = x;
	this.y = y;
    }
    public boolean equals(Object obj)  //重写Object类的equals()方法
    { 
	Pair that = (Pair)obj;
	if (this.x == that.x) //只要第一个成员变量相等则两个对象相等
	       return true;
	return false; //其它情况全部为两个对象不相等
    }
}

public class TestEquals
{
    public static void main(String[] args)
    {
	Single s1 = new Single(13);
	Single s2 = new Single(13);
	Pair p1 = new Pair(5, 16);
	Pair p2 = new Pair(5, 8);
	System.out.println("两个Single型引用s1和s2指向了同一个对象吗？");
	System.out.println(s1 == s2);
	
        System.out.println("Single对象s1和s2相等吗？");
        
        //调用Object类的equals()方法
	System.out.println(s1.equals(s2));                  
	
        System.out.println("Pair对象p1和p2相等吗？");
 	
        //调用Pair类的equals()方法
	System.out.println(p1.equals(p2));                 
    }
}