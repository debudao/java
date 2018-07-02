class Employee{
    private double salary=1800;
    public void setSalary(double salary){
         if(salary>1800&&salary<=6000){
              this.salary=salary;
         }
    }
    public double getSalary(){
         return salary;
    }
}

public class Example4_14{
    public static void main(String args[]){
        Employee zhang=new Employee();
        Employee wang=new Employee();
        zhang.setSalary(100);
        System.out.println("zhang的薪水："+zhang.getSalary());
        wang.setSalary(3888);
        System.out.println("wang的薪水："+wang.getSalary());
    }
}