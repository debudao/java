public class TestDimension{
	public static void main(String[] args){
		//声明、创建和初始化由一维数组构成的数组：
		int[][] n = new int[2][];
		n[0] = new int[3]; //第一个一维数组长度为3
		n[0][0] = 1; n[0][1] = 2; n[0][2] = 3;
		n[1] = new int[2]; //第二个一维数组长度为2
		n[1][0] = 11; n[1][1] = 12;
		//声明、创建和初始化一个一维数组：
		int[] a = {101, 102, 103, 104};
		//引用重新指向：
		n[0] = a;
		System.out.println("n[0][2]的值是3还是103？");
		System.out.println("n[0][2]的值是" + n[0][2]);
	}
}