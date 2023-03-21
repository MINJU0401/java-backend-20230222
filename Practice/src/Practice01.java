import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
// 문제1. 사용자로부터 정수 n을 입력받아서, 1부터 n까지의 합을 구하는 Java 프로그램을 작성하세요.
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수를 입력하세요 : ");
	int n = scanner.nextInt();
	
	int sum = 0;
	for (int i = 0; i <= n; i++) {
		sum += i;	}
	System.out.print(n + "이하 수의 합은 : " + sum);
	}

}
