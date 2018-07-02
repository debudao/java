class Single  //û����дObject���equals()����
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
    public boolean equals(Object obj)  //��дObject���equals()����
    { 
	Pair that = (Pair)obj;
	if (this.x == that.x) //ֻҪ��һ����Ա��������������������
	       return true;
	return false; //�������ȫ��Ϊ�����������
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
	System.out.println("����Single������s1��s2ָ����ͬһ��������");
	System.out.println(s1 == s2);
	
        System.out.println("Single����s1��s2�����");
        
        //����Object���equals()����
	System.out.println(s1.equals(s2));                  
	
        System.out.println("Pair����p1��p2�����");
 	
        //����Pair���equals()����
	System.out.println(p1.equals(p2));                 
    }
}