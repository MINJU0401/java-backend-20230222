 
public class MainClass {

	public static void main(String[] args) {
		MethodClass methodClass = new MethodClass();
		System.out.println(Math.sqrt(2));
		System.out.println("1~100의 합계 : " + methodClass.total());

		System.out.println("1~100의 합계 : " + MethodClass.total());

	}

}
