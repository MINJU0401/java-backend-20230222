package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;


public class BoardApplication {
	
	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();

	private static final String SIGN_UP = "POST /sign-up";
	private static final String SIGN_IN = "POST /sign-in";
	
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("URL End point : ");
			String endPoint = scanner.nextLine();
			
			switch(endPoint) {
			
//			회원가입
			case SIGN_UP:
				SignUpDto signUpdto = new SignUpDto();
				System.out.print("이메일 주소 : ");
				signUpdto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signUpdto.setPassword(scanner.nextLine());
				System.out.print("비밀번호 확인 : ");
				signUpdto.setPasswordCheck(scanner.nextLine());
				System.out.print("닉네임 : ");
				signUpdto.setNickname(scanner.nextLine());
				System.out.print("휴대전화 번호 : ");
				signUpdto.setPhoneNumber(scanner.nextLine());
				System.out.print("주소 : ");
				signUpdto.setAddress(scanner.nextLine());
				System.out.print("상세 주소 : ");
				signUpdto.setAddressDetail(scanner.nextLine());
				
//				System.out.println(signUpDto.toString());
				
				userController.signUp(signUpdto);
				break;
				
//			로그인	
			case SIGN_IN:
				SignInDto signInDto = new SignInDto();
				System.out.print("이메일 주소 : ");
				signInDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signInDto.setPassword(scanner.nextLine());
				
//				System.out.println(signInDto.toString());

				userController.signIn(signInDto);
				
			default:
				System.out.println(HttpStatus.NOT_FOUND);
				
			}
			
		}
		
	}

}
