package chapter5.C_DateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//	날짜 및 시간
public class DateTime {

	public static void main(String[] args) {
		//	System.currentTimeMills()
		//	현재 시간을 long 타입으로 0.001초 단위로 표현
		//	기준 1970년 1월 1일
		//	(개발자가 사용 시에는 메서드의 구현시간을 재는 용도로 사용함)
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		for (int count = 0; count < 1000000000; count++) {
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		//	Date class
		//	날짜를 관리해주는 클래스
		//	주로 날짜와 관련된 데이터 타입을 취급할 때 사용
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getMonth());  // 현재 3월인데, 2로 출력됨(Java에서는 1월이 0이기 때문)
											  // 이런 형태는 값을 저장하는 용도로만 사용됨.
		date.setHours(date.getHours() + 2);	  // setHour 시간을 세팅할 수 있는데, 잘안씀
		System.out.println(date);
		
		Date now = Date.from(Instant.now());  // 현재 시간을 나타내는 time 객체를 만들어서 사용
		System.out.println(now);
		
		Date minusTwoHours = Date.from(Instant.now().minus(2, ChronoUnit.HOURS));
		System.out.println(minusTwoHours);
		
		//	SimpleDateFormat 
		//	Date 타입의 참조변수를 지정한 포멧의 문자열로 변경해주는 클래스
		//	y: 연, M: 월, d: 일, H: 시간, m: 분, s: 초
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy. MM. dd. HH:mm:ss");
		//	SimpleDateFormat 줄여서 sdf 라고 쓰기도
		
		String formatedDate = simpleDateFormat.format(now);
		System.out.println(formatedDate);
		
		//	Time Package
		//	Date와 Calander 클래스의 단점 보완
		
		//	LocalDate class
		//	날짜를 관리해주는 class
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDateOf = LocalDate.of(2022, 12, 25);
		System.out.println(localDateOf);
		
		//	LocalTime class
		//	시간을 관리해주는 class
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime localTimeOf = LocalTime.of(12, 40);
		System.out.println(localTimeOf);
		
		//	LocalDateTime class
		//	날짜와 시간을 관리해주는 class
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println(localDateTimeOf);
		

	}

}
