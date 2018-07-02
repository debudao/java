class Computer
{
      double x,y;
      static double max(double a,double b)
      {   return a>b?a:b;  }
}
class Example4_4
{
      public static void main(String args[ ])
     {
          double max=Computer.max(12,45); 
          System.out.println(max);
     }
}
