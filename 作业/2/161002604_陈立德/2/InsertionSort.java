import java.util.Scanner;

public class InsertionSort {

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
		
	    int j;
	    double t;

	    for (int i = 1; i < n; i++)
	    {
	        j = i;
	        t = a[i];
	 
	        while (j > 0 && t < a[j - 1])
	        {
	            a[j] = a[j - 1];
	            j--;
	        } 
	        a[j] = t;
	    }
	    
	    for(double num:a)
            System.out.print(num+" ");

	}

}
