package common;

public class Creds {
    private static String correctName = "correctName";
    private static String correctPassword = "correctPassword";
    private static String incorrectName = "incorrectName";
    private static String incorrectPassword = "incorrectPassword";

    public static String name;
    public static String password;


    public static void correctNameCorrectPassword() {
        name = correctName;
        password = correctPassword;
    }

    public static void correctNameIncorrectPassword() {
        name = correctName;
        password = incorrectPassword;
    }

    public static void incorrectNameCorrectPassword() {
        name = incorrectName;
        password = correctPassword;
    }

    public static void incorrectNameIncorrectPassword() {
        name = incorrectName;
        password = incorrectPassword;
    }
}
