package chapter1.E_Array;

//	배열(Array)
//	'같은 타입'의 변수가 나열된 형태
//	배열은 '생성'해서 사용함 = 생성해서 사용하는 변수 : 참조 변수
//	new 연산자로 생성할 수 있음
//	배열은 실제 데이터가 저장되는 것이 아니라
//	데이터 배열이 저장된 첫번째 메모리 주소가 저장됨 

public class Array {

	public static void main(String[] args) {
		//	동일한 그룹의 데이터를 변수로만 선언해서 사용할 때
		int score1, score2, score3, score4, score5;
		score1 = 90;
		score2 = 100;
		score3 = 70;
		//	위 방식의 문제점
		//	관리가 어려움, 특정 조건에 따른 데이터를 가져오기 힘듦
		
		//	배열
		//	동일 타입이면서 동일한 그룹의 변수들을 묶어서 관리해주는 형태 
		//	선언 방법 : 데이터타입[] 배열명;
		int[] scores;  // 배열명을 정할때 배열명에 List를 붙이거나 복수형태로 나타냄
		//	생성 방법 : 배열명 = new 데이터타입[배열의길이];
		scores = new int[5];
		System.out.println(scores);   // 초기화 전에 출력 시, 참조변수이기 때문에 주소만 출력됨
		//	초기화 방법 : 배열명[인덱스번호] = 데이터;
		//	인덱스는 0부터 시작
		scores[0] = 90;
		scores[1] = 100;
		scores[2] = 95;
		scores[3] = 75;
		scores[4] = 80;
		
		//	선언과 동시에 생성 및 초기화
		//	1. 데이터타입[] 배열명 = new 데이터타입[]{ 요소1, ... }  
		int[] scoreList = new int[] {90, 100, 95};
		System.out.println(scoreList.length);
		//	2. 데이터타입[] 배열명 = { 요소1, ... }
		char[] string = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(string);
		string[0] = 'k';
		System.out.println(string);
		
		//	다차원 배열
		//	선언 방법 : 데이터타입[][] 배열명;
		//	생성 방법 : 배열명 = new 데이터타입[첫번째 배열 길이][두번째 배열 길이];
		//	선언과 동시에 초기화 
		//	1. 데이터타입[][] 배열명 = new 데이터타입[][] { { 요소11, ... }, { 요소21, ... }, ... };
		//	2. 데이터타입[][] 배열명 = { { 요소11, ... }, { 요소21, ... }, ... };
		
		//	scoreList = {90, 100, 95};
		int[] extraScoreList = scoreList;

		System.out.println(scoreList);
		System.out.println(extraScoreList);

		extraScoreList[0] = 70;	 	
		
		System.out.println(scoreList[0]); 
		// extraScoreList의 0번째 index를 수정했고, scoreList의 값은 변동이 없을거라고 예상했지만 함께 수정되어버림
		//	데이터값 뿐만 아니라 메모리 주소까지 복사되어버렸기 때문임
		//	실제로 출력해보면 extraScoreList와 scoreList의 주소는 동일함
		//	배열 복사를 이용하여 복사해야함		
	}

}
