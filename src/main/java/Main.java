import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {

        final Logger logger = LogManager.getLogger(Main.class.getName());

        Scanner input = new Scanner(System.in);
        PasswordChecker pass = new PasswordChecker();
        logger.info("Please create password:");
        System.out.println("Please create password:");
        String password = input.nextLine();
        pass.funcPassword(password);
    }
}