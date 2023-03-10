package chapter6.B_Generic;

//	제너릭(Generic)
//	다양한 타입을 다루는 메서드나 클래스에 컴파일 시 타입을 체크하는 기능
//	컴파일 시 타입을 체크하기 때문에 유연하게 개발을 할 수 있음

class GenericClass<D> {
	//	대소문자 상관없음, Type 이라는 뜻으로 T를 많이 사용. (외부에서 받은 타입으로 변수의 타입을 지정하겠다는 의미)
	boolean status;
	String message;
	D data;
	
	static <D> GenericClass<D> getInstance(boolean status, String message, D data) {
		GenericClass<D> instance = new GenericClass();
		instance.status = status;
		instance.message = message;
		instance.data = data;
		
		return instance;
	}
	
}

public class Generic {

	public static void main(String[] args) {
		
		GenericClass<Integer> generic1 = new GenericClass<>();
		GenericClass<String> generic2 = new GenericClass<>();
		
//		generic1.data = "String";	// Integer type으로 지정하여 문자열 선언 불가
		generic2.data = "String";
		
		GenericClass<?> generic3 = GenericClass.getInstance(true, "message", "String");

	}

}
