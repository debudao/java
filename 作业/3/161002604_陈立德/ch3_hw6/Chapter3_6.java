
//Ҫ�ж����������Ƿ����ʱ��������hashCode������equals������Ȼ����equals�����Ƚϼ���

public class Chapter3_6 {

	public static void main(String[] args) {
		//��ʱa��bΪ��������java�У���ʱa��bָ�����ͬһ����ַ������������ͬ
		String a="123",b="123";
		System.out.println(a==b);
		
		//��Ϊ��������ʱ����Ϊ��ʱ����ָ��ͬһ����ַ����ʹ����һ�����Ҳ��false����ʱ������equals����
		String c=new String("123"),d=new String("123");
		System.out.println(c==d);
		System.out.println(c.equals(d));

	}

}



