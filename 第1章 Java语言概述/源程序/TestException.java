public class TestException
{
     public static double calculateArea(double a, double b, double c)
     {
	 double p = (a+b+c)/2;
	 return Math.sqrt(p*(p-a)*(p-b)*(p-c));
     }
     public static void main(String[] args)
     {
	 double a = Double.parseDouble(args[0]);
	 double b = Double.parseDouble(args[1]);
	 double c = Double.parseDouble(args[2]);
	 double s = calculateArea(a, b, c);
	 System.out.println("�߳�Ϊ"+a+","+b+","+c+"�������������"+s);
     }
}
