
public class test1 {
	public static void main(String[] args) {

	    String message = null;

	    try {

	        int denominator = 0;

	        int numerator = 15;

	        int calculationResult = numerator / denominator;

	        message = " 연산결과 : " + calculationResult;

	    } catch(Exception exception) {

	       System.out.println("0으로 나눌 수 없습니다.");

	    }
	    
	    if ( message != null) {
	    System.out.println(message.trim());
	    }

	}
}
