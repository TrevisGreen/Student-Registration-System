import java.util.Scanner;

public class Login extends User {
    public void firstName() {
        Scanner input = new Scanner(System.in);
        System.out.println("First Name:");
        String firstName = input.nextLine();
    }

    public void userName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = input.nextLine();
    }

    public void password() {
        Scanner input = new Scanner(System.in);
        System.out.print("Password: ");
        String password = input.nextLine();
    }
}
