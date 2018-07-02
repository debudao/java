import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		System.out.println("请输入第一个矩阵的行数，列数：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),m=in.nextInt();
		int one[][]=new int[n][m];	
		System.out.println("请输入第一个矩阵数据：");
		for(int i=0;i<one.length;i++)
			for(int j=0;j<one[i].length;j++)
				one[i][j]=in.nextInt();
		
		System.out.println("请输入第二个矩阵的行数，列数：");
		n=in.nextInt();
		m=in.nextInt();
		int two[][]=new int[n][m];
		System.out.println("请输入第二个矩阵数据：");
		for(int i=0;i<two.length;i++)
			for(int j=0;j<two[i].length;j++)
				two[i][j]=in.nextInt();
		
		System.out.println("第一个矩阵：");
		for(int i=0;i<one.length;i++)
		{
			for(int j=0;j<one[i].length;j++)
			{
				System.out.print(one[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("第二个矩阵：");
		for(int i=0;i<two.length;i++)
		{
			for(int j=0;j<two[i].length;j++)
			{
				System.out.print(two[i][j]+" ");
			}
			System.out.println("");
		}
			
		int res[][]=new int[one[0].length][two[0].length];
		for(int i=0;i<one.length;i++)
			for(int j=0;j<two[0].length;j++)
			{
				for(int k=0;k<one[0].length;k++)
					res[i][j]+=(one[i][k]*two[k][j]);
			}
				
		
		System.out.println("结果：");
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println("");
		}
		
				

	}

}
