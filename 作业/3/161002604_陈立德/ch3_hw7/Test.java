//�Ҿ����б�Ҫ��private���ι��캯��

//��һ���౻�����ֻϣ������һ��ʵ�������ⲿ����ʱ�Ϳ�����private���ι��캯����Ȼ���ڸ����ﴴ������

class A{
	private static A x;
	
	private A() {
		System.out.println("����A");
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
