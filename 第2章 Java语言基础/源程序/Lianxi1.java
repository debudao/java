//Lianxi1.java
//显示字符’α’在Unicode表中的位置，显示以字符’α’开始的25个字符

public class  Lianxi1
{  
    public static void main (String args[ ])
    {
         char c='α';
         System.out.println("希腊字母"+c+"在unicode表中的顺序位置:"+(int)c);
         System.out.println("希腊字母表：");
         for(int i=(int)c;i<(int)c+25;i++)
          {
            System.out.print(" "+(char)i);
          }
    }
}
