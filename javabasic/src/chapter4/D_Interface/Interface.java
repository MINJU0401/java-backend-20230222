package chapter4.D_Interface;

//	인터페이스(Interface)
//	추상클래스보다 추상화 정도가 높은 존재
//	(시스템 설계에 주로 이용)
//	추상클래스와 다르게 일반 메서드와 일반 멤버 변수를 가질 수 없음

//	사용 방법 :
//	interface 인터페이스명 { }
interface ExampleInterface {
	//	변수를 사용할 때는 public static final 형태로만 사용할 수 있음
	public static final int NUMBER = 10;  // 반드시 초기화 필요
	
	//	메서드를 사용할 때는 public abstract로 선언해야 함. 추상메서드이기 때문에 구현부 없이 작성.
	public abstract void method1();
	public void method2();
	void method3(); //	인터페이스에서 메서드는 접근제어자와 abstract를 제외하고 선언하여도 public과 abstract로 작성됨
					//	public외 다른 접근제어자는 올 수 없음
}

//	인터페이스 간의 상속
//	, 를 써서 다중 상속이 가능
interface SubExampleInterface extends ExampleInterface {
	
}

//	인터페이스 구현
//	인터페이스도 추상메서드를 포함하고 있기 때문에 해당 메서드를 구현하는 클래스를 통해서 인스턴스를 만들어 줘야함
//	인터페이스를 클래스로 구현할 때는 implements 키워드를 사용함
class Implement implements ExampleInterface {

	@Override
	public void method1() {
		
		System.out.println("메서드 1");
	}

	@Override
	public void method2() {
		System.out.println("메서드 2");
	}

	@Override
	public void method3() {
		System.out.println("메서드 3");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		//	인터페이스 자체로 인스턴스를 생성할 수 없음
		ExampleInterface exampleInterface = new Implement();

	}

}
