import java.util.Scanner;
public class InputData
{
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);
        int amount=0;
        float price=0,sum=0;
        System.out.print("�����Ʒ�������س�ȷ�ϣ���");
        ������1��  //�Ӽ�������amount��ֵ
        System.out.print("�����Ʒ���ۣ��س�ȷ�ϣ���");
        ������1��  //�Ӽ�������price��ֵ
        sum=price*amount;
        System.out.printf("������%d�����ۣ�%5.2f���ܼ�ֵ��%5.2f",amount,price,sum);

     }
}
