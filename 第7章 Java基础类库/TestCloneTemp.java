class Single
{
      int z;
      Single(int z)
      {
	 this.z = z;
      }
      void show()
      {
	 System.out.println("z="+z+" "+ toString());
      }
}
class Pair implements Cloneable 
{
      Single x;
      Single y;
      Pair(Single x, Single y)
      {
	 this.x = x;
	 this.y = y;
      }
      void show()
      {
	 System.out.println("Pair¶ÔÏó£º"+this.toString());
	 x.show();
	 y.show();
      }
}

public class TestCloneTemp
{
      public static void main(String[] args) throws CloneNotSupportedException

      {
	   Pair a = new Pair(new Single(3), new Single(4));
	   System.out.print("a: ");
	   a.show();
	   Pair b =(Pair)a.clone();
	   System.out.print("aµÄ¿½±´b: ");
	   b.show();
      }
}