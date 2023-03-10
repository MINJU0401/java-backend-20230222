package chapter6.A_CollectionClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//	Collection Framework
//	배열형태의 데이터를 보다 편하게 사용할 수 있도록 해주는 클래스의 집합

public class CollectionClass {

	public static void main(String[] args) {
		
		//	Set 클래스
		//	집합의 개념. 집합 - 중복을 허용하지 않고 순서가 없는 형태
		//	Set 자체가 순서가 없어 index 활용이 불가함
		
		//	Set은 인터페이스. Set을 구현하는 구현체가 필요.
		//	HashSet<E> : 중복을 허용하지 않고 순서가 없는 형태
		Set<Integer> integerSet = new HashSet<Integer>(); 
		integerSet.add(4859);
		integerSet.add(123);
		integerSet.add(4859);
		integerSet.add(798);
		integerSet.add(798);
		integerSet.add(3564113);
		
		Iterator<Integer> iterator = integerSet.iterator();
		
		//	hasNext() 다음 값이 있는지 없는지를 판단하여, 없으면 false를 반환
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());			
//		}
		for (Integer item: integerSet) {
			System.out.println(item);
		}
		
		//	TreeSet<E> : 중복을 허용하지 않고 순서가 없는 형태 + 정렬기능 (사용방식은 HashSet과 동일)
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(4859);
		treeSet.add(123);
		treeSet.add(4859);
		treeSet.add(798);
		treeSet.add(798);
		treeSet.add(3564113);
		
		for (Integer item: treeSet) {
			System.out.println(item);
		}
		System.out.println("=====================================");
		
		//	List
		//	데이터를 일렬로 나열한 구조
		//	순서가 존재하고 중복이 허용 (배열)
		//	set과 마찬가지로 인터페이스임. 구현해줄 구현체 필요
		
		//	ArrayList는 굉장히 자주 쓰임 ★
		//	ArrayList<E> : 순서가 존재하고 중복이 허용된 '배열'. ArrayList는 배열과 다르게 길이를 지정하지 않고 사용할 수 있음.
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(0, "banana");   //	특정한 인덱스 값을 지정할 수 있음
		
		list.set(0, "BaNaNa");   // list.add 는 추가, list.set 은 값 변경
		
		String removeItem = list.remove(1);			 //	list.remove 특정 인덱스 값 삭제
		
		System.out.println(removeItem);
		System.out.println(list.toString());  	//	list.toString() 작성하면 배열 형태로 출력됨
		
		//	ArrayList의 길이는 .length 가 아니라 .size()로 구함
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		//	LinkedList<E> : 순서가 존재하고 중복이 허용된 '배열' + 
		//					각 요소가 이전 요소와 다음 요소의 주소를 같이 가지고 있음
		//					검색 속도가 빠름
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		long startTime = System.currentTimeMillis();
		for (int integer = 0; integer < 100_000; integer++) 
			arrayList.add(0, integer);
			long endTime = System.currentTimeMillis();
			
			System.out.println("Array List 작업시간 : " + (endTime - startTime));
			
			startTime = System.currentTimeMillis();
			for (int integer = 0; integer < 100_000; integer++) 
				linkedList.add(0, integer);
				endTime = System.currentTimeMillis();
				
				System.out.println("Linked List 작업시간 : " + (endTime - startTime));
		
				
		System.out.println("=============================================");
		
		//	Map (인터페이스)
		//	key와 value가 하나의 쌍으로 저장되는 구조
		//	순서가 존재하지 않음, 단 key를 사용하여 특정한 value를 가져올 수 있음
		
		//	HashMap<E, E>
		//	(안좋다는데...? )
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("key", "value");
		hashMap.put("apple", "사과");
		
		System.out.println(hashMap.get("apple"));
		System.out.println(hashMap.get("key"));
		
		
		//	Example) Lotto 응용
		//	전제조건 : 숫자 6개, 중복 숫자 제거, 정렬  -> TreeSet 기능과 흡사
		Set<Integer> lotto = new TreeSet<>();
		
		while (lotto.size() < 6) {
			Random random = new Random();
			int randomNumber = random.nextInt(45) + 1;
			lotto.add(randomNumber);
		}
		
		System.out.println(lotto.toString());
		
	}

}
