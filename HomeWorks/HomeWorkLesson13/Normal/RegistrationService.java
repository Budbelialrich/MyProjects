package HomeWorks.HomeWorkLesson13.Normal;

public class RegistrationService {
    public void Registration(String login, String password, String confirmPassword) {
        try {
            checkLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
    public void checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length()> 16){
            throw new WrongLoginException("Длина логина не должна превышать 16 символов");
        }
        if (password.length() <= 8 && !password.equals(confirmPassword)){
            throw new WrongPasswordException("Длина пароля не должна быть 8 символов");
        }
    }
}
