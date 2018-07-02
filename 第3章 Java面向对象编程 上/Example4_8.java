class People{
    double getArea(double x,int y){
          return x*y;
    }
    int getArea(int x,double y){
          return (int)(x*y);
    }
    double getArea(float x,float y,float z){
          return(x*x+y*y+z*z)*2.0;
    }
}

public class Example4_8{
    public static void main(String args[]){
         People zhang=new People();
         System.out.println("面积："+zhang.getArea(10,3.88));
         System.out.println("面积："+zhang.getArea(10.0,8));
    }
}