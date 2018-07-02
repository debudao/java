import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		System.out.println("请输入数组的长度：");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("请输入"+n+"个数据：");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		quickSort(a, 0, a.length - 1);
		
		if(n%2==0)
			System.out.println((double)a[(n-1)/2]);
		else
			System.out.println(((double)a[n/2]+a[n/2-1])/2);


	}
	
	public static int Partition(int[] a, int l, int r)

	{
		int tmp;
	    int piv = a[l];

	    while (l < r)
	    {
	    	while(l<r && a[r]>=piv)
	    		r--;
	        tmp = a[r];
	        a[r] = a[l];
	        a[l] = tmp;
	
	        while(l<r && a[l]<=piv)
	        	l++;
	        
	        tmp = a[r];
	        a[r] = a[l];
	        a[l] = tmp;
	     }

	    a[l] = piv; 
	    return l; 

	}

	public static void quickSort(int[] a, int l, int r) 
	{
		if(l >= r - 1)
	    return;

	    int piv = Partition(a,l,r);
        quickSort(a, l, piv-1);
        quickSort(a, piv+1, r);

	}

	

}
