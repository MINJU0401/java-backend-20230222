import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    String email;
    String password;
    String passwordCheck;
    String name;
    String phoneNumber;
}

public class MainApplication {

    public static void main(String[] args) {
       List<User> userList = new ArrayList<>();
       String[] emailList = {  };
        
       Scanner scanner = new Scanner(System.in);

        User user = new User();

       System.out.print("email : ");
       user.email = scanner.nextLine();
       System.out.print("비밀번호 : ");
       user.password = scanner.nextLine();
       System.out.print("비밀번호 확인 : ");
       user.passwordCheck = scanner.nextLine();       
       System.out.print("이름 : ");
       user.name = scanner.nextLine();
       System.out.print("전화번호 : ");
       user.phoneNumber = scanner.nextLine(); 

       if (user.email.isBlank() || user.password.isBlank() || user.passwordCheck.isBlank() || user.name.isBlank() || user.phoneNumber.isBlank()) {
           System.out.println("모두 입력하세요");
           return;
       }

       for (String email : emailList) {
    	    if (user.email.equals(email)) {
    	        return;
    	    }
    	}

    	if (!user.password.equals(user.passwordCheck)) {
    	    return;
    	}

    	userList.add(user);

    	for (User userInfo : userList) {
    	    System.out.println("email: " + userInfo.email);
    	    System.out.println("비밀번호: " + userInfo.password);
    	    System.out.println("이름: " + userInfo.name);
    	    System.out.println("전화번호: " + userInfo.phoneNumber);
    	}

    	}
}
