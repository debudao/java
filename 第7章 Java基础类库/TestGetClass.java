class Pair
{
    int x;
    int y;
    Pair(int x, int y)
    {
	this.x = x;
	this.y = y;
    }
    void show()
    {
	System.out.println("x="+x+";y="+y);
    }
}

public class TestGetClass
{
    public static void main(String[] args)
    {
	Pair pair = new Pair(3, 4);
	Class info = pair.getClass();
	System.out.println("������" + info.getName());
	System.out.println("������" + info.getPackage());
	System.out.println("��������" + info.getSuperclass().getName());
        //System.out.println(pair);
    }
}