package MathPackage;
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
     MathOpt opt = new MathOpt();
     Scanner sc = new Scanner(System.in);
     System.out.println("please input a degree:");
     double x = sc.nextDouble();
     if (opt.pow(opt.sin(x), 2) + opt.pow(opt.cos(x), 2) == 1.0) {
         System.out.println("sin(x)^2 + cos(x)^2 == 1");
     }
     if (opt.sin(x) / opt.cos(x) == opt.tan(x)) {
         System.out.println("sin(x) / cos(x) == tan(x)");
     } else {
         System.out.println("please explain the situation here.");
         // TODO: why?
     }
     if (opt.log10(100) == opt.log(100) / opt.log(10)) {
         System.out.println("log_a(b) / log_a(c) == log_c(b)");
     }
     if (opt.pow(opt.sqrt(100), opt.log10(100)) == 100.0 ) {
         System.out.println("Mutually inverse operation");
     }
     System.out.println("e=" + opt.exp(1) );
 }
}