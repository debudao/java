//Lianxi3.java
//从键盘输入移位运算的两个操作元，输出位左移和位右移的结果

import java.util.*;
public class Lianxi3
{  
    public static void main (String args[ ])
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("输入待移位的int型整数:");
        int x = reader.nextInt();
        System.out.println("输入移位量:");
        int n = reader.nextInt();
        System.out.println("左移位的结果:"+(x<<n));
        System.out.println("右位的结果:"+(x>>n));
    }
}
