import java.util.Scanner;
public class InputData
{
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);
        int amount=0;
        float price=0,sum=0;
        System.out.print("输入产品数量（回车确认）：");
        【代码1】  //从键盘输入amount的值
        System.out.print("输入产品单价（回车确认）：");
        【代码1】  //从键盘输入price的值
        sum=price*amount;
        System.out.printf("数量：%d，单价：%5.2f，总价值：%5.2f",amount,price,sum);

     }
}
