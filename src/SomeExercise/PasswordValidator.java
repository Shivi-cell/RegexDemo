package SomeExercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println("Enter your password ");
        String str = new Scanner(System.in).nextLine();
        /**
         * password should be 8 to 20 in length
         * password should contain at least one of this (~ ! @ # $ % ^ & * |)
         * password should contain at least an upper case and a lower case letter
         * password must not have a wide space at all
         * password should contain at least one digit
         *
         * regex
         *    ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$
         *
         *    ([a-z]*)([A-Z]*)([0-9]*)([~!@#$%^&*|_.]*).{8,20}
         */

        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
        boolean b = p.matcher(str).matches();
        if (b)
            System.out.println("Password is valid.");
        else
            System.out.println("Invalid password.");
    }
}
