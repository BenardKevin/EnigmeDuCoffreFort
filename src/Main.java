import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String PASSWORD = "azerty12*";

        theVaultRiddle(PASSWORD);
    }

    public static void theVaultRiddle(String PASSWORD) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String pwdTest = scanner.next();
        ArrayList<String> passwordList = new ArrayList<>();
        passwordList.add(pwdTest);

        while (!pwdTest.equals(PASSWORD)) {
            System.out.println("...");
            pwdTest = scanner.next();
            passwordList.add(pwdTest);
        }
        System.out.println(STR."*Open*\{passwordList}");
    }
}