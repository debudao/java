class Jerry
{
     int leg;
     Jerry(int n)
     {
         leg=n;
     }
     void setLeg(int n)
     {
         leg=n;
     }
    int getLeg()
     {
         return leg;
     }
}

class Tom
{  
     void f(Jerry mouse)
     {
        mouse.setLeg(12); 
        System.out.println("��ִ�з���fʱ������mouse�޸����Լ���leg��ֵ");
        System.out.println("��ǰ����mouse�ĳ�Աleg��ֵ:"+mouse.getLeg());
        mouse=null;
        //mouse.setLeg(12);
     } 
}

public class Example4_6
{
   public static void main(String args[])
   {
     Tom cat=new Tom();
     Jerry jerry=new Jerry(2);
     System.out.println("�ڵ��÷���f֮ǰ,jerry�ĳ�Աleg��ֵ:"+jerry.getLeg());
     cat.f(jerry);
     System.out.println("�ڵ��÷���f֮��,jerry�ĳ�Աleg��ֵ:"+jerry.getLeg());
   }
}
