import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("����������ĳ��ȣ�");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("������"+n+"�����ݣ�");	
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
        System.out.println("������");
        for(double num:a)
            System.out.print(num+" ");

	}
}
