

public class Chess {

	public static void main(String[] args) {
		for(int i=0;i<8;i++)  
	    {  
	        for(int j=0;j<8;j++)  
	            if((i+j)%2==0)  
	                System.out.printf("  ");  
	            else System.out.printf("%c%c",0x25A0,0x25A0);  
	        System.out.printf("\n");  
	    }  
	}

}