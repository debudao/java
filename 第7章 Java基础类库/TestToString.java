class Single  //û����дObject���toString()����
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
    public String toString()  //��д��Object���toString()����
    { 
	String result = "x=" + x + "; y=" + y;
	return result;
    }
}

public class TestToString
{
    public static void main(String[] args)
    {
	Single a = new Single(7);
	Pair b = new Pair(5, 8);
	System.out.println("Single����a��Pair����b���ڲ���Ϣ�ǣ�\n" + a + "\n" + b);      
    }
}