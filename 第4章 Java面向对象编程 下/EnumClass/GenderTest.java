package chapter4.EnumClass;

public class GenderTest {
	public static void main(String[] args) {
		// 通过Enum的valueOf()方法来获取指定枚举类的枚举值
		Gender g = Enum.valueOf(Gender.class , "FEMALE");
		// 使用getter访问枚举值的name实例变量
		System.out.println(g + " 代表: " + g.getName());
	}
}
