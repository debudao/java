class CopyArray
{
    public static void main(String args[])
    {
         char a[]={'a','b','c','d','e','f'},b[]={'1','2','3','4','5','6'};
         int c[]={1,2,3,4,5,6},d[]={-1,-2,-3,-4,-5,-6};
         System.arraycopy(a,0,b,0,a.length);
         System.arraycopy(c,2,d,2,c.length-3);
         System.out.printf("\narray a: ");
         for(int i=0;i<a.length;i++)
         {
              System.out.printf("%3c",a[i]);
          }
         System.out.printf("\narray b: ");
         for(int i=0;i<b.length;i++)
         {
              System.out.printf("%3c",b[i]);
          }
         System.out.printf("\narray c: ");
         for(int i=0;i<b.length;i++)
         {
              System.out.printf("%3d",c[i]);
          }
          System.out.printf("\narray d: ");
         for(int i=0;i<d.length;i++)
         {
              System.out.printf("%3d",d[i]);
          }
     }
}