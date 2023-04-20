package di;

public class Class2 {

	private Class3 class3;	
	private Class4 class4;
	
	public Class2(Class3 class3, Class4 class4) {
		this.class3 = class3;
		this.class4 = class4;		
	}
	
	public String method1() {
		class4.printHello();
		return class3.getName();
	}

}

