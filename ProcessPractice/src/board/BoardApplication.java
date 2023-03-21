package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;


public class BoardApplication {
	
	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();

	private static final String SIGN_UP = "POST /sign-up";
	private static final String SIGN_IN = "POST /sign-in";
	
	private static final String POST_BOARD = "POST /board";
	
	private static final String GET_BOARD = "GET /board";
	private static final String GET_BOARD_LIST = "GET /board/list";
	
	private static final String PATCH_BOARD = "PATCH /board";

	private static final String DELETE_BOARD = "DELETE /board";
	
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
				
				break;
			case POST_BOARD: 
				PostBoardDto postBoardDto = new PostBoardDto();
				System.out.print("제목 : ");
				postBoardDto.setTitle(scanner.nextLine());
				System.out.print("내용 : ");
				postBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 : ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("작성자 이메일 : ");
				postBoardDto.setWriterEmail(scanner.nextLine());
				// 값을 받아온 뒤 controller에게 넘김
				
				boardController.postBoard(postBoardDto);
				break;
				
			case GET_BOARD_LIST:
				
				boardController.getBoardList();
				break;
				
			case GET_BOARD:
				
				int boardNumber = 0;
				
				try {
					System.out.print("게시물 번호 : ");
					boardNumber = scanner.nextInt();					
				} catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.getBoard(boardNumber);
				break;
				
			case PATCH_BOARD:
				patchBoard();
				break;
				
			case DELETE_BOARD:
				int deleteBoardNumber = 0;
				String deleteEmail = null;
				
				try {			
					System.out.print("게시물 번호 : ");
					deleteBoardNumber = Integer.parseInt(scanner.nextLine());
					System.out.print("이메일 : ");
					deleteEmail = scanner.nextLine();
					
				} catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.deleteBoard(deleteBoardNumber, deleteEmail);
				
				break;
				
			default:
				System.out.println(HttpStatus.NOT_FOUND);
				
			}
			
		}
		
	}
	
	private static void patchBoard() {
		Scanner scanner = new Scanner(System.in);
		PatchBoardDto patchBoardDto = new PatchBoardDto();
		try {
		System.out.print("게시물 번호 : ");
		String patchBoardNumber = scanner.nextLine();
		patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumber));
		System.out.print("제목 : ");
		patchBoardDto.setTitle(scanner.nextLine());
		System.out.print("내용 : ");
		patchBoardDto.setContent(scanner.nextLine());
		System.out.print("이미지 : ");
		patchBoardDto.setBoardImageUrl(scanner.nextLine());
		System.out.print("이메일 : ");
		patchBoardDto.setEmail(scanner.nextLine());	
		boardController.patchBoard(patchBoardDto);
		}  catch (Exception exception){
			exception.printStackTrace();
		}		
	}
}
