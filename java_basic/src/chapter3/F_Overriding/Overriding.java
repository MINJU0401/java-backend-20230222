package chapter3.F_Overriding;

//	오버라이딩
//	조상클래스로부터 상속받은 메서드의 내용을 변경하는 것
//	상속받은 메서드를 자손 클래스에 맞게 변경시키고자 할 때 오버라이딩을 사용

class Human {
	String name;
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다.");
	}
}

class Developer extends Human {
	//	Overload
	void eat() {
		System.out.println(super.name + "가 식사를 합니다.");
	}
	//	Override
	@Override   // 이 메서드는 오버라이드하는 것으로 표시
	void eat(String food) {
		System.out.println(super.name + "가 " + food + "를 절반만 먹습니다.");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.name = "John doe";
		
		developer.eat();
		developer.eat("사과");
		
		Human human = new Human();
		human.name = "Michael";
		
		human.eat("바나나");
		
		//	developer.eat과 human.eat으로 동일한 메서드를 호출했으나 
		//	Overriding 한 developer의 메서드는 오버라이드 된 내용으로 출력됨
		

	}

}
