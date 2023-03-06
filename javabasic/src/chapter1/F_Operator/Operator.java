package chapter1.F_Operator;

//	연산자
//	산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자
public class Operator {

	public static void main(String[] args) {
		//	산술 연산자(정수나 실수. 숫자 연산)
		
		//	1) 덧셈 연산자 : + 
		//	좌항에 우항을 더한 값을 반환
		int addResult = 8 + 3;
		System.out.println(addResult);
		
		//	2) 뺄셈 연산자 : -
		//	좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);
		
		//	3) 곱셈 연산자 : *
		//	좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
		//	4) 나눗셈 연산자 : /
		//	좌항에 우항을 나눈 값을 반환
		int remainderResult = 8 / 3;
		float float1 = 2.6666F;
		int number1 = (int) float1;
		
		System.out.println(number1);
		System.out.println(remainderResult);  // int로 연산했기 때문에 몫만 출력된 것임

		double remainderResult2 = 8.0 / 3.0;  
		System.out.println(remainderResult2);  // double로 연산하면 소수점자리까지 출력됨
		
		//	5) 나머지 연산자 : %
		//	좌항에 우항을 나눈 나머지를 반환
		int remainderResult3 = 8 % 3;
		System.out.println(remainderResult3);
		
		//	정수와 정수를 연산하면 정수가 반환됨
		//	실수와 정수를 연산하면 실수가 반환됨
		//	실수와 실수를 연산하면 실수가 반환됨
		
		//	증감 연산자 : '변수' 자신을 1 증가 혹은 감소시키는 연산자
		
		//	증가 연산자 : ++
		//	연산자의 좌항 혹은 우항의 값을 1 증가시킴
		//	좌항에 붙이는 것과 우항에 붙이는 것의 차이? 컴퓨터는 좌-우, 상-하 순서로 데이터를 읽음. 좌항에 증가연산자가 있는 경우, 연산 후 1 증가된 값으로 출력됨. 
		//	우항에 증가연산자가 있는 경우, 출력시는 보이지 않으나 저장된 값만 1 증가된 상태. 다음 출력 시에 증가된 값으로 출력됨. 
		int integer1 = 10;
		++integer1;
		System.out.println(integer1);
		integer1++;
		System.out.println(integer1);		
		System.out.println("=============");
		integer1 = 0;
		System.out.println(integer1);
		System.out.println(++integer1);
		
		System.out.println(integer1);
		System.out.println(integer1++);
		
		System.out.println(integer1);
		
		//	상수에는 증감연산자 사용 불가능(변수에만 적용됨)
		final int NUMBER = 0;
//		NUMBER++;
//		0++;
		
		//	감소 연산자 : --
		//	연산자의 좌항 혹은 우항의 값을 1 감소시킴
		int integer2 = 10;
		--integer2;
		integer2--;
		
		int number2 = 8;
		int number3 = 3;
		int sampleNumber = number2 / --number3;  
		
		
		System.out.println("-----대입 연산자-----");
		//	대입 연산자
		//	좌항에 우항을 (누적)대입
		//	좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입하는 연산자
		//	= : 좌항에 우항을 대입
		int number4 = 10;
		//	+= : 좌항에 우항을 더한 값을 좌항에 대입
		number4 += 3;
		System.out.println(number4);
		//	-= : 좌항에 우항을 뺀 값을 좌항에 대입
		number4 -= 6;
		System.out.println(number4);
		//	*= : 좌항에 우항을 곱한 값을 좌항에 대입
		number4 *= 3;
		System.out.println(number4);
		//	/= : 좌항에 우항을 나눈 값을 좌항에 대입
		number4 /= 5;
		System.out.println(number4);
		//	%= : 좌항에 우항을 나눈 나머지를 좌항에 대입
		number4 %= 3;
		System.out.println(number4);
		
		//	대입연산자의 좌항에는 무조건 변수만 지정할 수 있음 (값이 변경되므로 상수가 올 수 없음)
		
		System.out.println("-----비교 연산자-----");
		
		//	비교 연산자
		//	좌항을 우항과 비교한 결과를 논리(true, false)값으로 반환하는 연산자
		
		//	== 
		//	좌항이 우항과 같다면 true, 아니면 false 반환
		boolean boolean1 = 10 == 12;
		System.out.println(boolean1);		
		//	!=
		//	좌항이 우항과 다르다면 true, 아니면 false 반환
		boolean boolean2 = 10 != 12;
		System.out.println(boolean2);
		//	>(Greater than), >=(Greater than or equal to) 
		//	좌항이 우항보다 크면 true, 아니면 false 반환
		//	좌항이 우항보다 크거나 같으면 true, 아니면 false 반환
		boolean boolean3 = 10 > 10;
		boolean boolean4 = 10 >= 10;
		System.out.println(boolean3);
		System.out.println(boolean4);
		//	<(Less than), <=(Less than or equal to)
		//	좌항이 우항보다 작으면 true, 아니면 false 반환
		//	좌항이 우항보다 작거나 같으면 true, 아니면 false 반환
		boolean boolean5 = 8 < 10;
		boolean boolean6 = 10 <= 10;   //  부등호가 앞에 와야함, equal이 뒤
		System.out.println(boolean5);
		System.out.println(boolean6);
		
		System.out.println("-----논리 연산자-----");
		//	논리 연산자
		//	논리 값을 연산하는 연산자
		
		//	&& : AND 연산
		//	좌항과 우항이 모두 true일 때 true, 아니면 false를 반환
		int number5 = 8;
		int number6 = 3;
		boolean boolean7 = (number5 > number6) && true;   // 연산식은 괄호()로 묶어줘야 보기 편함(사칙연산 순서 무관하게)
				
		//	|| : OR 연산
		//	좌항과 우항 중 하나라도 true이면 true, 아니면 false
		boolean boolean8 = false || true;
		
		boolean boolean9 = 
				 (number6 > number5) && (number5++ > number6);	// AND 연산은 두항이 모두 true일 경우에만 true로 반환되므로, 좌항의 반환값이 false인 경우 우항의 연산은 진행하지 않음
		System.out.println(number5);	// 증가되지 않은 값인 8으로 출력됨
		
		boolean boolean10 =
				(number5 > number6) || (number6 > ++number5);	// OR 연산은 하나라도 true 이면 true로 반환되므로, 좌항이 true인 경우 우항의 연산은 진행하지 않음
		System.out.println(number5);	// 증가되지 않은 값인 8으로 출력됨
		
		//	! : NOT(부정) 연산
		//	논리값의 부정을 반환
		boolean boolean11 = !(number5 > number6);
		System.out.println(boolean11);
		
		System.out.println("-----삼항 연산자-----");
		//	삼항 연산자 (항이 3개임)
		//	조건에 따라 다른 결과를 반환하는 연산자
		//	조건 ? 참일때 결과 : 거짓일 때 결과
		String string1 = 
				number5 > number6 ? "3보다 큽니다." : "3보다 크지 않습니다.";
//				number5 == number6 ? "3입니다." : "3보다 작습니다.";
//				
//		if (number5 > number6) {
//			System.out.println("3보다 큽니다.");
//		} else {
//			if (number5 == number6) {
//				System.out.println("3입니다.");
//			} else {
//				System.out.println("3보다 작습니다.");
//			}
//		
		System.out.println(string1);
		
	}
}
