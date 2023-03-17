package board.common.constant;

//	메시지 반환 시, 인코딩 타입이 상이하고 동일하게 적용이 안되는 문제가 있기때문에 한글 말고 영어로 작성한다.

public interface ResponseMessage {
	public static final String SUCCESS = "Success";
	
	public static final String EXIST_EMAIL = "Existed Email";
	
	public static final String NOT_EXIST_USER = "Does Not Exist User";
	
	public static final String PASSWORD_NOT_MATCH = "Password Does Not Match";
	
	public static final String FAIL_SIGN_IN = "Sign in Failed";

}
