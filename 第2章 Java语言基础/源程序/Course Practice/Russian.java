public class Russian
{
    public static void main(String args[])
    {
        int startPosition=0,endPosition=0;
        char cStart='а',cEnd='я';
        【代码1】 //对cStart进行int类型转换运算，并将结果赋值给startPosition
        【代码2】 //对cEnd进行int类型转换运算，并将结果赋值给endPosition
        System.out.println("俄文字母共有："+(endPosition-startPosition+1)+"个");
        for(int i=startPosition;i<=endPosition;i++)
        {
             char c='\0';
             【代码3】  //对i进行char类型转换运算，并将结果赋值给c
             System.out.print(""+c);
         }
     }
}