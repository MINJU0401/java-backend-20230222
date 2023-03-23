import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {

    String email;

    String password;

    String name;

    String telNumber;

}

public class MainApplication2 {
	
	
	    List<User> userList = new ArrayList<>();

	    public static void main(String[] args) {

	        String email = null;

	        String password = null;

	        String passwordCheck = null;

	        String name = null;

	        String telNumber = null;

	        while(true) {

	            Scanner scanner = new Scanner(System.in);

	            email = scanner.nextLine();

	            password = scanner.nextLine();

	            passwordCheck = scanner.nextLine();

	            name = scanner.nextLine();

	            telNumber = scanner.nextLine();

	            if (email.isBlank() || password.isBlank() || passwordCheck.isBlank() || name.isBlank() || telNumber.isBlank()) {

	                continue;

	            }

	           

	            boolean hasUser = false;

	            for (User user: userList) if (user.email.equals(email)) hasUser = true;

	            if (hasUser) continue;

	            if (!password.equals(passwordCheck)) continue;

	            break;

	        }

	        User user = new User();

	        user.email = email;

	        user.password = password;

	        user.passwordCheck = passwordCheck;

	        user.name = name;

	        user.telNumber = telNumber;

	        userList.add(user);

	        System.out.println(user.toString());

	    }

	}

	 
