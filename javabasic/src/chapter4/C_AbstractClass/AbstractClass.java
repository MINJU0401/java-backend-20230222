package chapter4.C_AbstractClass;

//	추상 클래스
//	추상 메서드가 포함되어있는 클래스
//	추상 클래스로 인스턴스를 생성할 수 없음!

//	추상 클래스를 사용하는 이유
//	모든 기능이 같지만, 1가지 기능만 다를 때에 추상메서드를 사용함
//	Abstract class와 method를 작성하거나 접할 일은 거의 없으나
//	기작성된 코드를 확인할 때에 필요할 수도 있으므로 추상클래스와 메서드의 개념을 알고있는 것이 좋음
//	상속받아, 오버라이드하여 사용해야 구현되는 메서드라는 개념

//	사용 방법 :
//	abstract class 클래스명 {}
abstract class Abstract {
	int number1;
	
	//	추상메서드
	//	선언부만 작성되어 있고, 구현부는 작성되어 있지 않은 메서드
	//	해당 클래스를 상속받은 자손 클래스에서 구현을 필수로 요구함
	
	//	사용 방법 :
	//	abstract 반환타입 메서드명([매개변수]);
	abstract void method1();   
}

class SubClass extends Abstract {
	void method1() {
		System.out.println("구현!");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Abstract abstract1 = new SubClass();  // Abstract가 SubClass의 조상클래스이기 때문에, 자손클래스의 참조변수로 사용가능
//		Abstract abstract1 = new Abstract();  // 추상클래스를 인스턴스화 할 수 없다고 에러남
		abstract1.method1();
	}

}
