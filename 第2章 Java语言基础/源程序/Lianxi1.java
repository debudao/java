//Lianxi1.java
//��ʾ�ַ���������Unicode���е�λ�ã���ʾ���ַ���������ʼ��25���ַ�

public class  Lianxi1
{  
    public static void main (String args[ ])
    {
         char c='��';
         System.out.println("ϣ����ĸ"+c+"��unicode���е�˳��λ��:"+(int)c);
         System.out.println("ϣ����ĸ��");
         for(int i=(int)c;i<(int)c+25;i++)
          {
            System.out.print(" "+(char)i);
          }
    }
}
