import tom.jiafei2.*;
class Example4_12 
{  
    public static void main(String args[ ])
    {  
        SquareEquation equation=new SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficient(-3,4,5);
        equation.getRoots();
    }
}
