package di;

public class Class1 {
	
	private Class2 class2;
	
	public Class1(Class2 class2) {
		this.class2 = class2;
	}
	
	public void method2() {
		System.out.println(class2.method1());
	}

}
