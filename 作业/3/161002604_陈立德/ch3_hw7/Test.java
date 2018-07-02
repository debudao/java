//我觉得有必要用private修饰构造函数

//当一个类被定义后，只希望产生一个实例对象供外部访问时就可以用private修饰构造函数，然后在该类里创建对象

class A{
	private static A x;
	
	private A() {
		System.out.println("我是A");
	}
	
	public static A getA() {
		x=new A();
		return x;
	}
	
}



public class Test {

	public static void main(String[] args) {
		A one=A.getA();

	}

}
