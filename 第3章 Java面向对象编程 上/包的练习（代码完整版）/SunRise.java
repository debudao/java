package nihao;
import tom.jiafei.Trangle;
import java.util.Date;
class SunRise
{
    public static void main(String args[])
    {
	    Trangle trangle=new Trangle(12,3,104);
		trangle.计算面积();
		trangle.修改三边(3,4,5);
		trangle.计算面积();
		Date date=new Date();
		System.out.println(date);
    }	
}
