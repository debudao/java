//Lianxi3.java
//�Ӽ���������λ�������������Ԫ�����λ���ƺ�λ���ƵĽ��

import java.util.*;
public class Lianxi3
{  
    public static void main (String args[ ])
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("�������λ��int������:");
        int x = reader.nextInt();
        System.out.println("������λ��:");
        int n = reader.nextInt();
        System.out.println("����λ�Ľ��:"+(x<<n));
        System.out.println("��λ�Ľ��:"+(x>>n));
    }
}
