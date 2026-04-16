import java.util.Scanner;
import java.lang.Exception;

class UsernameException extends Exception {
    UsernameException(String msg) {
        System.out.println(msg);
    }
}

class PasswordException extends Exception {
    PasswordException(String msg) {
        System.out.println(msg);
    }
}

public class UserNamePass {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        String username, password;
        System.out.println("Enter username:");
        username = reader.nextLine();
        System.out.println("Enter password:");
        password = reader.nextLine();
        int len = username.length();
        try {
            if (len < 8)
                throw new UsernameException("Username must be greater than 8 character\n");
            else if (!password.equals("admin"))
                throw new PasswordException("Incorrect password\n");
            else
                System.out.println("Login successfull");
        } catch (UsernameException u) {
            System.out.println(4);
        } catch (PasswordException p) {
            System.out.println(p);
        }
    }
}
