package HomeWorks.HomeWorkLesson13.Normal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        RegistrationService registrationService = new RegistrationService();

        registrationService.Registration(login, password, confirmPassword);

        try {
            registrationService.checkLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
