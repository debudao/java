
//要判断两个对象是否相等时，先重载hashCode函数和equals函数，然后用equals函数比较即可

public class Chapter3_6 {

	public static void main(String[] args) {
		//此时a，b为常量，在java中，此时a，b指向的是同一个地址，所以两者相同
		String a="123",b="123";
		System.out.println(a==b);
		
		//当为两个对象时，因为此时不是指向同一个地址，即使内容一样输出也是false，这时可以用equals函数
		String c=new String("123"),d=new String("123");
		System.out.println(c==d);
		System.out.println(c.equals(d));

	}

}



