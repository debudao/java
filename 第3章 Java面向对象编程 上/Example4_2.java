class Lader 
{   
    double above,height; //ʵ��������
    static double bottom; //�������
    void setAbove(double a)
    {  
       above=a;
    }
    void setBottom(double b)
    {  
       bottom=b;
    }
    double getAbove()
    {  
       return above;
    }
    double getBottom()
    {  
       return bottom;
    }
}
class Example4_2
{   
    public static void main(String args[]) 
    { 
       Lader.bottom=60; //Lader���ֽ��뱻���ص��ڴ棬ͨ�����������������

       Lader laderOne,laderTwo;

       System.out.println("��������Lader�����bottom����"+Lader.bottom);
           
       laderOne=new Lader();  
       laderTwo=new Lader();

       System.out.println("laderOne��bottom:"+laderOne.getBottom());
       System.out.println("laderTwo��bottom:"+laderTwo.getBottom());

       laderOne.setAbove(11);
       laderTwo.setAbove(22);
       laderTwo.setBottom(100);

       System.out.println("��������Lader�����bottom����"+Lader.bottom);
       System.out.println("laderOne��above:"+laderOne.getAbove());
       System.out.println("laderTwo��above:"+laderTwo.getAbove());
    } 
}
