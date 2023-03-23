
import java.util.ArrayList;
import java.util.Scanner;

public class Practice02 {

//	for 루프를 사용하여 1부터 10까지의 합을 구하는 코드를 작성하시오.
		
	    public static void main(String[] args) {
	    	
	    	int sum = 0;
	    	
	    	for (int index = 0; index <= 10; index++) {
	    		sum += index;
	    	}
	    	System.out.println("1~10의 합 : " + sum);
	    
	    
//	    if-else 문을 사용하여 입력받은 정수가 0보다 크면 "양수",
//	    0보다 작으면 "음수", 0이면 "0"을 출력하는 
//	    코드를 작성하시오.
	    
	    Scanner scanner = new Scanner(System.in); 
	    
	    System.out.print("숫자를 입력하세요 : ");
	    int index = scanner.nextInt();
	    
	    if (index > 0) {
	    	System.out.println("양수");
	    } else if (index < 0) {
	    	System.out.println("음수");
	    } else {
	    	System.out.println(0);
	    }
	    
//	    *
//	    **
//	    ***
//	    ****
//	    *****
//	    다음과 같이 출력되는 코드 작성하기
	    
	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
//	    while 문을 사용하여 1부터 100까지의 숫자 중 3의 배수를
//	    출력하는 코드를 작성하시오.
	    
	    int index3 = 1;
	    while (index3 <= 100) {
	    	if (index3 % 3 == 0) {
	    		System.out.println(index3);
	    	}
	    	index3++;
	    	}
	    
//	    switch 문을 사용하여 사용자로부터 입력받은 
//	    월에 해당하는 계절을 출력하는 코드를 작성하시오.
	    
	    
	    
}}