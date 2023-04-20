package di;

public class MainApplication {
	
	private static Class4 class4 = new Class4("Hi");
	private static Class3 class3 = new Class3("부산");
	
	private static Class2 class2 = new Class2(class3, class4);
	
	private static Class1 class1 = new Class1(class2);

	public static void main(String[] args) {

		class1.method2();
	}

}
