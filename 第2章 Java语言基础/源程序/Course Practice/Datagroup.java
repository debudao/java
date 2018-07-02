public class Datagroup
{
    public static void main(String args[])
    {
        int a[][]={{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                 System.out.printf("%4d",a[i][j]);
             }
            System.out.printf("%n");
         }
     }
}