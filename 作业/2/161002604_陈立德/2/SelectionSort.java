import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("请输入数组的长度：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("请输入"+n+"个数据：");	
		double[] a=new double[n];
		
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextDouble();
        }        
       
        for(int i = 0; i < n-1; i++) 
        {
            int k = i;
            for(int j = k + 1; j < n; j++)
            {
                if(a[j] < a[k])
                    k = j; 
            }
            
            if(i != k)
            {  
                double temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }    
        }
        System.out.println("交换后：");
        for(double num:a)
            System.out.print(num+" ");

	}
}
